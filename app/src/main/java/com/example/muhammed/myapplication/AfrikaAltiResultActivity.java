package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AfrikaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView afrikaAltiResultsonuc,afrikaAltiResulteniyi;
    ImageButton afrikaAltiresultyenidendenebtn,afrikaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_alti_result);
        init();
        afrikaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("afrikaAltipuan",0));
        if (dataHelper.receiveDataInt("afrikaAltieniyi",0)<dataHelper.receiveDataInt("afrikaAltipuan",0)){
            dataHelper.saveDataInt("afrikaAltieniyi",dataHelper.receiveDataInt("afrikaAltipuan",0));
        }
        afrikaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("afrikaAltieniyi",0));

        afrikaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrikaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        afrikaAltiResultsonuc=(TextView) findViewById(R.id.afrikaAltiResultsonuc);
        afrikaAltiResulteniyi=(TextView) findViewById(R.id.afrikaAltiResulteniyi);
        afrikaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.afrikaAltiresultyenidendenebtn);
        afrikaAltiresulthomebtn=(ImageButton) findViewById(R.id.afrikaAltiresulthomebtn);
    }
}
