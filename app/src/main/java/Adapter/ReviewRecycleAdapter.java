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

import ModelClass.ReviewModelClas;
import uiux.design.myapplication.R;


public class ReviewRecycleAdapter extends RecyclerView.Adapter<ReviewRecycleAdapter.MyViewHolder> {

    Context context;


    private List<ReviewModelClas> OfferList;

    int myPos = 0;



    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;
        ImageView image;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView)view.findViewById(R.id.like);


        }

    }


    public ReviewRecycleAdapter(Context context, List<ReviewModelClas> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public ReviewRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_review_list, parent, false);



        return new ReviewRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ReviewModelClas lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());
        holder.image.setImageResource(lists.getImage());

        if (position % 2 == 0  ){

            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
        }else
        {
            holder.itemView.setBackgroundColor(Color.parseColor("#f8f8f8"));
        }

    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


