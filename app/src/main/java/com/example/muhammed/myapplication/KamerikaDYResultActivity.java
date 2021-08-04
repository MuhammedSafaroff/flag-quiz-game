package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class KamerikaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerikaDYResultsonuc,kamerikaDYResulteniyi;
    ImageButton kamerikaDYresultyenidendenebtn,kamerikaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_dy_result);
        init();
        kamerikaDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("kamerikaDYpuan",0));
        if (dataHelper.receiveDataInt("kamerikaDYeniyi",0)<dataHelper.receiveDataInt("kamerikaDYpuan",0)){
            dataHelper.saveDataInt("kamerikaDYeniyi",dataHelper.receiveDataInt("kamerikaDYpuan",0));
        }
        kamerikaDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("kamerikaDYeniyi",0));

        kamerikaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerikaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        kamerikaDYResultsonuc=(TextView) findViewById(R.id.kamerikaDYResultsonuc);
        kamerikaDYResulteniyi=(TextView) findViewById(R.id.kamerikaDYResulteniyi);
        kamerikaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.kamerikaDYresultyenidendenebtn);
        kamerikaDYresulthomebtn=(ImageButton) findViewById(R.id.kamerikaDYresulthomebtn);
    }
}
