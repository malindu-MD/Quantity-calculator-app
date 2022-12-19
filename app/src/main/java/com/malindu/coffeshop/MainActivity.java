package com.malindu.coffeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int num=0;
    public void minus(View view){
        num=num-1;
        display(num);

    }

    /**
     *
     *
     */

    public void Plus(View view){
        num=num+1;
        display(num);

    }

    public void display(int number){

        TextView displayInteger =findViewById(R.id.quanitynum);

        if (number<0){
          num=0;

        displayInteger.setText("" + num);}
        else {
            displayInteger.setText("" + number);
        }

    }
    public void order(View view){

        int sum;
        sum=10*num;
        TextView displayInteger =findViewById(R.id.priceone);

        displayInteger.setText("" + sum);




    }

}

