package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AfrikaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView afrikaZKResultsonuc,afrikaZKResulteniyi;
    ImageButton afrikaZKresultyenidendenebtn,afrikaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_zk_result);
        init();
        afrikaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("afrikaZKpuan",0));
        if (dataHelper.receiveDataInt("afrikaZKeniyi",0)<dataHelper.receiveDataInt("afrikaZKpuan",0)){
            dataHelper.saveDataInt("afrikaZKeniyi",dataHelper.receiveDataInt("afrikaZKpuan",0));
        }
        afrikaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("afrikaZKeniyi",0));

        afrikaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrikaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        afrikaZKResultsonuc=(TextView) findViewById(R.id.afrikaZKResultsonuc);
        afrikaZKResulteniyi=(TextView) findViewById(R.id.afrikaZKResulteniyi);
        afrikaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.afrikaZKresultyenidendenebtn);
        afrikaZKresulthomebtn=(ImageButton) findViewById(R.id.afrikaZKresulthomebtn);
    }
}
