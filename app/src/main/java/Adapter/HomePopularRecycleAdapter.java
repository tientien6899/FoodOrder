package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.PopularModelClass;
import uiux.design.myapplication.R;


public class HomePopularRecycleAdapter extends RecyclerView.Adapter<HomePopularRecycleAdapter.MyViewHolder> {

    Context context;


    private List<PopularModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public HomePopularRecycleAdapter(Context context, List<PopularModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HomePopularRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_popular_list, parent, false);


        return new HomePopularRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final PopularModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(context, All_Services_Activity.class);
//                context.startActivity(intent);
//            }
//        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


