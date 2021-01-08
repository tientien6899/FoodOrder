package uiux.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.HomePopularRecycleAdapter;
import ModelClass.PopularModelClass;

public class HomeActivity extends AppCompatActivity {


    /*Home Popular recyerview data is here*/

    private ArrayList<PopularModelClass> popularModelClasses;
    private RecyclerView recyclerView;
    private HomePopularRecycleAdapter bAdapter;

    private Integer image[] = {R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas};
    private String title[] = {"Fast Food Eat","Chicken Restaurant","US Pizza","Dominoz"};



        /*Home New Restaurants recyerview data is here*/

    private ArrayList<PopularModelClass> popularModelClasses1;
    private RecyclerView recyclerView1;
    private HomePopularRecycleAdapter bAdapter1;

    private Integer image1[] = {R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas};
    private String title1[] = {"Fast Food Eat","Chicken Restaurant","US Pizza","Dominoz"};



    /*Home Offers recyerview data is here*/

    private ArrayList<PopularModelClass> popularModelClasses2;
    private RecyclerView recyclerView2;
    private HomePopularRecycleAdapter bAdapter2;

    private Integer image2[] = {R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas,R.drawable.pizzas};
    private String title2[] = {"Fast Food Eat","Chicken Restaurant","US Pizza","Dominoz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


          /*HomePopular  recyclerview code is here*/

        recyclerView = findViewById(R.id.RecyclerViewPoppular);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        popularModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            PopularModelClass mycreditList = new PopularModelClass(image[i],title[i]);
            popularModelClasses.add(mycreditList);
        }
        bAdapter = new HomePopularRecycleAdapter(HomeActivity.this,popularModelClasses);
        recyclerView.setAdapter(bAdapter);




         /*Home New Restaurants  recyclerview code is here*/

        recyclerView1 = findViewById(R.id.RecyclerViewRestaurant);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(HomeActivity.this);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        popularModelClasses1 = new ArrayList<>();

        for (int i = 0; i < image1.length; i++) {
            PopularModelClass mycreditList = new PopularModelClass(image1[i],title1[i]);
            popularModelClasses1.add(mycreditList);
        }
        bAdapter1 = new HomePopularRecycleAdapter(HomeActivity.this,popularModelClasses1);
        recyclerView1.setAdapter(bAdapter1);


        /*Home New Restaurants  recyclerview code is here*/

        recyclerView2 = findViewById(R.id.RecyclerViewOffers);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(HomeActivity.this);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());

        popularModelClasses2 = new ArrayList<>();

        for (int i = 0; i < image2.length; i++) {
            PopularModelClass mycreditList = new PopularModelClass(image2[i],title2[i]);
            popularModelClasses2.add(mycreditList);
        }
        bAdapter2 = new HomePopularRecycleAdapter(HomeActivity.this,popularModelClasses2);
        recyclerView2.setAdapter(bAdapter2);

    }
}
