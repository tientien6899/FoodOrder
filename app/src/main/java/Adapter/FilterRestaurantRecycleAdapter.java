package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.FoodOrderListModelClass;
import uiux.design.myapplication.R;


public class FilterRestaurantRecycleAdapter extends RecyclerView.Adapter<FilterRestaurantRecycleAdapter.MyViewHolder> {

    Context context;


    private List<FoodOrderListModelClass> OfferList;

    int myPos = 0;



    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;
        ImageView image;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView) view.findViewById(R.id.image);


        }

    }


    public FilterRestaurantRecycleAdapter(Context context, List<FoodOrderListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public FilterRestaurantRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_filter_restaurant_list, parent, false);


        return new FilterRestaurantRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        FoodOrderListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());

        if (myPos == position){
            holder.title.setTextColor(Color.parseColor("#e69a00"));
            holder.image.setBackgroundResource(R.drawable.ic_path_489);

        }else {

            holder.title.setTextColor(Color.parseColor("#7e7e7e"));

            holder.image.setBackgroundColor(Color.parseColor("#00000000"));

        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }


        });



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


