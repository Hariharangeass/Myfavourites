package com.example.rajiv.myfavourites;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycle;
    GridLayoutManager grid_manage;
    GridAdapter gridAdapter;
    ArrayList<Integer> img_id = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridAdapter=new GridAdapter(this,img_id);
        recycle=(RecyclerView) findViewById(R.id.thegrid);
        grid_manage= new GridLayoutManager(getApplicationContext(),3);
        recycle.setLayoutManager(grid_manage);
        recycle.setAdapter(gridAdapter);
        img_id.add(R.drawable.index);
        for(int i=0;i<20;i++)
        {
            img_id.add(R.drawable.ima1);// insert pics here
            gridAdapter.notifyItemInserted(i);
        }

        gridAdapter.notifyDataSetChanged();//notify adapter


        //please dont forget this

    }
}
