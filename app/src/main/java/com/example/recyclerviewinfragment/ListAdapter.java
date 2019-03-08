package com.example.recyclerviewinfragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter  extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {

        ((ViewHolder)holder).bindview(i);


    }

    @Override
    public int getItemCount() {
        return DataModel.names.length;
    }

    private class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView itemtxt;
        ImageView itemimg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemimg =(ImageView)itemView.findViewById(R.id.item_img);
            itemtxt=(TextView)itemView.findViewById(R.id.item_txt);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

        public void bindview (int position){
            itemtxt.setText(DataModel.names[position]);
            itemimg.setImageResource(DataModel.images[position]);
        }
    }



}
