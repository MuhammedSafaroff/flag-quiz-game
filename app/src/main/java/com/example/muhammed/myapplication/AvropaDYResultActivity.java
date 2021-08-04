package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvropaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView aDYResultsonuc,aDYResulteniyi;
    ImageButton avropaDYresultyenidendenebtn,avropaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_avropa_dy);
        init();
        aDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avropaDYpuan",0));
        if (dataHelper.receiveDataInt("avropaDYeniyi",0)<dataHelper.receiveDataInt("avropaDYpuan",0)){
            dataHelper.saveDataInt("avropaDYeniyi",dataHelper.receiveDataInt("avropaDYpuan",0));
        }
        aDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avropaDYeniyi",0));

        avropaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvropaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        aDYResultsonuc=(TextView) findViewById(R.id.aDYResultsonuc);
        aDYResulteniyi=(TextView) findViewById(R.id.aDYResulteniyi);
        avropaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.avropaDYresultyenidendenebtn);
        avropaDYresulthomebtn=(ImageButton) findViewById(R.id.avropaDYresulthomebtn);
    }
}
