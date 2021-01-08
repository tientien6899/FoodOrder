package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ModelClass.BookOrderModelClass;
import uiux.design.myapplication.R;


public class BookOrderRecycleAdapter extends RecyclerView.Adapter<BookOrderRecycleAdapter.MyViewHolder> {

    Context context;


    private List<BookOrderModelClass> OfferList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            linear = (LinearLayout) view.findViewById(R.id.linear);


        }

    }


    public BookOrderRecycleAdapter(Context context, List<BookOrderModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public BookOrderRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book_order_list, parent, false);


        return new BookOrderRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final BookOrderModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());

        if (myPos == position){
            holder.title.setTextColor(Color.parseColor("#000000"));
            holder.linear.setBackgroundResource(R.drawable.ic_rectangle_13);

        }else {

            holder.title.setTextColor(Color.parseColor("#484646"));

            holder.linear.setBackgroundResource(R.drawable.ic_rectangle_12);

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


