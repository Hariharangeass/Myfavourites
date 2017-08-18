package com.example.rajiv.myfavourites;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rajiv on 18/8/17.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.DirectoryViewHolder>{

    Context context;

    ArrayList<Integer> imgid;

    GridAdapter(Context c,ArrayList<Integer> imgid)
    {
        this.context = c;

        this.imgid = imgid;
    }


    @Override
    public DirectoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_item,parent,false);
        DirectoryViewHolder dvh = new DirectoryViewHolder(row);

        return dvh;
    }

    @Override
    public void onBindViewHolder(DirectoryViewHolder holder, int position) {


        holder.I.setImageResource(imgid.get(position));
    }


    @Override
    public int getItemCount() {
        return imgid.size();
    }

    public class DirectoryViewHolder extends RecyclerView.ViewHolder{

        TextView T;
        ImageView I;


        public DirectoryViewHolder(View itemView) {
            super(itemView);


            I = itemView.findViewById(R.id.photo);
        }
    }
}


