package uiux.design.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.BookOrderRecycleAdapter;
import ModelClass.BookOrderModelClass;

public class BookOrderActivity extends AppCompatActivity {

    TextView title;

    private ArrayList<BookOrderModelClass> bookOrderModelClasses;
    private RecyclerView recyclerView;
    private BookOrderRecycleAdapter bAdapter;


    private Integer image[] = {R.drawable.ic_coffee_cup,R.drawable.ic_doughnut,R.drawable.ic_cake_slice,R.drawable.ic_fried_egg,
    R.drawable.ic_burger,R.drawable.ic_fries,R.drawable.ic_pizza,R.drawable.ic_noodle,R.drawable.ic_buffet};
    private String txt[]={"Coffee","Donut","Cake","Omelette","Burger","French Fries","Pizza","Noodles","More"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_order);

        title = findViewById(R.id.title);
        title.setText("Most Popular");



        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(BookOrderActivity.this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        bookOrderModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            BookOrderModelClass beanClassForRecyclerView_contacts = new BookOrderModelClass(image[i],txt[i]);
            bookOrderModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new BookOrderRecycleAdapter(BookOrderActivity.this,bookOrderModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
