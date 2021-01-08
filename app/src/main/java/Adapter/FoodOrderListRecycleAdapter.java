package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.FoodOrderListModelClass;

import uiux.design.myapplication.BookOrderActivity;
import uiux.design.myapplication.FilterActivity;
import uiux.design.myapplication.FoodFilterActivity;
import uiux.design.myapplication.HomeActivity;
import uiux.design.myapplication.LocationActivity;
import uiux.design.myapplication.R;
import uiux.design.myapplication.ReviewActivity;


public class FoodOrderListRecycleAdapter extends RecyclerView.Adapter<FoodOrderListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<FoodOrderListModelClass> OfferList;



    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public FoodOrderListRecycleAdapter(Context context, List<FoodOrderListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public FoodOrderListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food_order_list, parent, false);


        return new FoodOrderListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        FoodOrderListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, HomeActivity.class);
                    context.startActivity(i);
                }else if (position ==1){
                    Intent i = new Intent(context, BookOrderActivity.class);
                    context.startActivity(i);
                }else if (position ==2){
                    Intent i = new Intent(context, FilterActivity.class);
                    context.startActivity(i);
                }else if (position ==3){
                    Intent i = new Intent(context, FoodFilterActivity.class);
                    context.startActivity(i);
                }else if (position ==4){
                    Intent i = new Intent(context, ReviewActivity.class);
                    context.startActivity(i);
                }else if (position ==5){
                    Intent i = new Intent(context, LocationActivity.class);
                    context.startActivity(i);
                }
            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


