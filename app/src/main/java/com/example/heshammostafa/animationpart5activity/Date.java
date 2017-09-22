package com.example.heshammostafa.animationpart5activity;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Hesham Mostafa on 6/30/2017.
 */

public class Date  {

    public ArrayList<Information> getData() {
        ArrayList<Information> data= new ArrayList<Information>();


        int[] imge = {
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,
                R.drawable.s, R.drawable.s, R.drawable.s,


        };


        String[] catigories = {
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",
                "guinness", "guinness", "guinness",

        };



        for(int i=0;i<imge.length;i++)
        {

        Information current=new Information();

            current.title=catigories[i];


            current.Item=imge[i];

            data.add(current);
        }

        return data;
    }

    class Information {
        String title;
        int Item;

    }
   }
