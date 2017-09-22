package com.example.heshammostafa.animationpart5activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Hesham Mostafa on 6/30/2017.
 */

public class AnimationUtls {
    public void animate(RecyclerView.ViewHolder holder, boolean goesDown) {

//        slidgAnimation(holder,goesDown);
slidgWithAnimation(holder,goesDown);
    }


private void slidgAnimation(RecyclerView.ViewHolder holder, boolean goesDown) {

    ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(holder.itemView,"translationY",goesDown?200:-200,0);
    objectAnimator.setDuration(1000);
    objectAnimator.start();

}

    private void slidgWithAnimation(RecyclerView.ViewHolder holder, boolean goesDown) {
        {
            AnimatorSet animatorSet=new AnimatorSet();
            ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(holder.itemView,"translationY",goesDown?200:-200,0);
            ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(holder.itemView,"translationX",-30,30,-20,20,-5,5,0);

            objectAnimator.setDuration(1000);
            objectAnimator1.setDuration(1000);
            animatorSet.playTogether(objectAnimator,objectAnimator1);
            animatorSet.start();
        }
    }
}
