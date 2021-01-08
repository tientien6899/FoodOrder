package uiux.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.ReviewRecycleAdapter;
import ModelClass.ReviewModelClas;

public class ReviewActivity extends AppCompatActivity {


    TextView title;

    private ArrayList<ReviewModelClas> reviewModelClas;
    private RecyclerView recyclerView;
    private ReviewRecycleAdapter bAdapter;


    private String title1[] = {"Alena King","Alena King","Alena King","Alena King"};
    private Integer image[] = {R.drawable.ic_blue_like,R.drawable.ic_white_like,R.drawable.ic_blue_like,R.drawable.ic_white_like,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        title = findViewById(R.id.title);
        title.setText("Restaurant Review");

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ReviewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        reviewModelClas = new ArrayList<>();

        for (int i = 0; i < title1.length; i++) {
            ReviewModelClas beanClassForRecyclerView_contacts = new ReviewModelClas(title1[i],image[i]);
            reviewModelClas.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new ReviewRecycleAdapter(ReviewActivity.this,reviewModelClas);
        recyclerView.setAdapter(bAdapter);
    }
}
