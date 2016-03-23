package com.example.avinashke1.card123;

/**
 * Created by avinash on 22/3/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

/**
 * Created by arpit on 11/3/16.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    List<Product> list;
    private ImageLoader imageLoader;
    private Context context;


    public ProductAdapter(List<Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newsfeed, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Product stationary = list.get(position);
        //Loading image from url
        int x;
        final String name=stationary.getName();

        final int age = stationary.getAge();

        holder.fun(name);
        Log.d("OnBind", "calling on bind");
        imageLoader = Singleton.getInstance().getImageLoader();
        imageLoader.get(stationary.getImgUrl(), ImageLoader.getImageListener(holder.imageView, R.mipmap.ic_launcher, R.drawable.abc_btn_check_material));
        holder.textViewName.setText(stationary.getName());
        holder.textViewage.setText(Integer.toString(stationary.getAge()));

        holder.imageView.setImageUrl(stationary.getImgUrl(), imageLoader);









    }
    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener   {
        public NetworkImageView imageView;
        public TextView textViewName;

        public TextView textViewage;
        String name;




        //Initializing Views
        public ViewHolder(View itemView) {
            super(itemView);
            context=itemView.getContext();
            imageView = (NetworkImageView) itemView.findViewById(R.id.person_photo);
            textViewName = (TextView) itemView.findViewById(R.id.person_name);

            textViewage = (TextView) itemView.findViewById(R.id.person_age);
            itemView.setOnClickListener(this);

        }
        public void fun(String name){
            this.name=name;
        }
        


        @Override
        public void onClick(View v) {

            Toast.makeText(context,name,Toast.LENGTH_LONG).show();

        }
    }
}
