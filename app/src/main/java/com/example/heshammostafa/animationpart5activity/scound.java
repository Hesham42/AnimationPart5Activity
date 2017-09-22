package com.example.heshammostafa.animationpart5activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class scound extends AppCompatActivity {

    RecyclerView mRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scound);

        CustomerAdapter mAdapter=new CustomerAdapter(this,new Date().getData());

        mRecyclerView=(RecyclerView)findViewById(R.id.Rec);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


  /** TODO: 7/1/2017  coment off type of recycleView
   * todo horizontal
   *    LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
   *    linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
   *    mRecyclerView.setLayoutManager(linearLayoutManager);
   *
   *  todo vertical
   *          LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
   *          linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
   *          mRecyclerView.setLayoutManager(linearLayoutManager);
   *
   * todo GraidView
   *                   GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2); //2 clome span
   *                   mRecyclerView.setLayoutManager(gridLayoutManager);
   *
   *todo Staggerd
   *                  StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
   *                  mRecyclerView.setLayoutManager(gridLayoutManager);
   * */


    }









    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_open_scale,R.anim.activity_close_translate);

    }
}
