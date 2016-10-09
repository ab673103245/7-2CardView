package qianfeng.a7_2cardview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/9 0009.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private List<UserBean> list;
    private LayoutInflater inflater;
    private Context context;

    private Random random;
    private int[] colors;

    public MyAdapter(List<UserBean> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
        colors = new int[]{Color.BLUE,Color.RED,Color.YELLOW,Color.GREEN,};
        random = new Random();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rv_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        UserBean userBean = list.get(position);
        MyHolder myHolder = (MyHolder) holder;
        myHolder.iv.setImageResource(userBean.getUserface());

        myHolder.tv.setText(userBean.getUsername());

        myHolder.cardview.setCardBackgroundColor(colors[random.nextInt(4)]);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;
        private CardView cardview;

        public MyHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv);
            tv = (TextView) itemView.findViewById(R.id.tv);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
        }
    }

}
