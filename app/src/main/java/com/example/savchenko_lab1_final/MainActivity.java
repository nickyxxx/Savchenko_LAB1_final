package com.example.savchenko_lab1_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textChanger(View view)
    {
        TextView text = (TextView) findViewById(R.id.text1);
        if(text.getText() == "Welcome!") text.setText("HURRRAYYY!!!");
        else text.setText("Welcome!");
    }

   public void colorChanger (View view)
    {
        TextView text = (TextView) findViewById(R.id.text1);
        if(text.getCurrentTextColor() == Color.parseColor("#0F9D58"))
        {
            text.setTextColor(Color.parseColor("#FF0000"));
        }
        else text.setTextColor(Color.parseColor("#0F9D58"));

    }


}