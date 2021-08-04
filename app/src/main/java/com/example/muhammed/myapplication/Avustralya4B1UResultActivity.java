package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Avustralya4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralya4B1UResultsonuc,avustralya4B1UResulteniyi;
    ImageButton avustralya4B1Uresultyenidendenebtn,avustralya4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_4b1u_result);
        init();
        avustralya4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avustralya4B1Upuan",0));
        if (dataHelper.receiveDataInt("avustralya4B1Ueniyi",0)<dataHelper.receiveDataInt("avustralya4B1Upuan",0)){
            dataHelper.saveDataInt("avustralya4B1Ueniyi",dataHelper.receiveDataInt("avustralya4B1Upuan",0));
        }
        avustralya4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avustralya4B1Ueniyi",0));

        avustralya4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Avustralya4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralya4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avustralya4B1UResultsonuc=(TextView) findViewById(R.id.avustralya4B1UResultsonuc);
        avustralya4B1UResulteniyi=(TextView) findViewById(R.id.avustralya4B1UResulteniyi);
        avustralya4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.avustralya4B1Uresultyenidendenebtn);
        avustralya4B1Uresulthomebtn=(ImageButton) findViewById(R.id.avustralya4B1Uresulthomebtn);
    }
}
