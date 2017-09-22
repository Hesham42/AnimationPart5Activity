package com.example.heshammostafa.animationpart5activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyviewHolder> {

    private LayoutInflater mInflater;
    List<Date.Information> data= Collections.emptyList();
    private int perviousPostion=0;


    public CustomerAdapter(Context context, ArrayList<Date.Information> data) {

        mInflater=LayoutInflater.from(context);
        this.data=data;
    }



    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=mInflater.inflate(R.layout.activity_customer,parent,false);
        MyviewHolder holder =new MyviewHolder(view);

        return holder;

    }

    @Override
    public void onBindViewHolder(final MyviewHolder holder, final int position) {

        holder.title.setText(data.get(position).title);
        holder.imageView.setImageResource(data.get(position).Item);
        if (position>perviousPostion)
        {
            new AnimationUtls().animate(holder,true);

        }else
        {
            new AnimationUtls().animate(holder,false);

        }

   perviousPostion=position;

//
//holder.imageView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        ActivityOptionsCompat anim=
//                ActivityOptionsCompat.
//                        makeSceneTransitionAnimation((android.app.Activity)mContext,holder.imageView,"targetImage");
//        Intent intent= new Intent(mContext,Details.class);
//        intent.putExtra("postion",position);
//        mContext.startActivity(intent,anim.toBundle());
//    }
//});

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder
{
    TextView title;
    ImageView imageView;


    public MyviewHolder(View itemView) {
        super(itemView);

    title=itemView.findViewById(R.id.Txv_row);
    imageView=itemView.findViewById(R.id.cardImge);
    }
}

}
