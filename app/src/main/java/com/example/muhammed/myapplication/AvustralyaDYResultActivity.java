package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvustralyaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralyaDYResultsonuc,avustralyaDYResulteniyi;
    ImageButton avustralyaDYresultyenidendenebtn,avustralyaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_dy_result);
        init();
        avustralyaDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avustralyaDYpuan",0));
        if (dataHelper.receiveDataInt("avustralyaDYeniyi",0)<dataHelper.receiveDataInt("avustralyaDYpuan",0)){
            dataHelper.saveDataInt("avustralyaDYeniyi",dataHelper.receiveDataInt("avustralyaDYpuan",0));
        }
        avustralyaDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avustralyaDYeniyi",0));

        avustralyaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralyaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avustralyaDYResultsonuc=(TextView) findViewById(R.id.avustralyaDYResultsonuc);
        avustralyaDYResulteniyi=(TextView) findViewById(R.id.avustralyaDYResulteniyi);
        avustralyaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.avustralyaDYresultyenidendenebtn);
        avustralyaDYresulthomebtn=(ImageButton) findViewById(R.id.avustralyaDYresulthomebtn);
    }
}
