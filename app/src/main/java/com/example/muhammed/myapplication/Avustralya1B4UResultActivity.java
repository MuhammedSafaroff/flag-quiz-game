package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Avustralya1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralya1B4UResultsonuc,avustralya1B4UResulteniyi;
    ImageButton avustralya1B4Uresultyenidendenebtn,avustralya1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_1b4u_result);
        init();
        avustralya1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avustralya1B4Upuan",0));
        if (dataHelper.receiveDataInt("avustralya1B4Ueniyi",0)<dataHelper.receiveDataInt("avustralya1B4Upuan",0)){
            dataHelper.saveDataInt("avustralya1B4Ueniyi",dataHelper.receiveDataInt("avustralya1B4Upuan",0));
        }
        avustralya1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avustralya1B4Ueniyi",0));

        avustralya1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Avustralya1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralya1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avustralya1B4UResultsonuc=(TextView) findViewById(R.id.avustralya1B4UResultsonuc);
        avustralya1B4UResulteniyi=(TextView) findViewById(R.id.avustralya1B4UResulteniyi);
        avustralya1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.avustralya1B4Uresultyenidendenebtn);
        avustralya1B4Uresulthomebtn=(ImageButton) findViewById(R.id.avustralya1B4Uresulthomebtn);
    }
}
