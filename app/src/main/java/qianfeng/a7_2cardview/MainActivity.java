package qianfeng.a7_2cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    private int[] imgs = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6,
            R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14
            , R.drawable.p15, R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6,
            R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14
            , R.drawable.p15};

    private List<UserBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerview = ((RecyclerView) findViewById(R.id.recyclerview));

        initData();

        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        recyclerview.setAdapter(new MyAdapter(list,this));


    }

    private void initData() {

        list = new ArrayList<>();

        for (int i = 0; i < imgs.length; i++) {
            list.add(new UserBean(imgs[i],"王五" + imgs[i]));// imgs[i]+"":
        }
    }
}
