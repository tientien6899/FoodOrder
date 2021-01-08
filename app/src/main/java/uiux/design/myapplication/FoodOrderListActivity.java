package uiux.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.FoodOrderListRecycleAdapter;
import ModelClass.FoodOrderListModelClass;

public class FoodOrderListActivity extends AppCompatActivity {

    private ArrayList<FoodOrderListModelClass> foodOrderListModelClasses;
    private RecyclerView recyclerView;
    private FoodOrderListRecycleAdapter bAdapter;

    private String txt[]={"1.HomeActivity","2.BookOrderActivity","3.RestaurantFilterActivity","4.FoodFilterActivity","5.ReviewActivity","6.LocationActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order_list);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FoodOrderListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        foodOrderListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            FoodOrderListModelClass beanClassForRecyclerView_contacts = new FoodOrderListModelClass(txt[i]);
            foodOrderListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new FoodOrderListRecycleAdapter(FoodOrderListActivity.this,foodOrderListModelClasses);
        recyclerView.setAdapter(bAdapter);

    }
}
