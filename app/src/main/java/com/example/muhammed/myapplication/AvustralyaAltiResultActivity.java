package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvustralyaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralyaAltiResultsonuc,avustralyaAltiResulteniyi;
    ImageButton avustralyaAltiresultyenidendenebtn,avustralyaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_alti_result);
        init();
        avustralyaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avustralyaAltipuan",0));
        if (dataHelper.receiveDataInt("avustralyaAltieniyi",0)<dataHelper.receiveDataInt("avustralyaAltipuan",0)){
            dataHelper.saveDataInt("avustralyaAltieniyi",dataHelper.receiveDataInt("avustralyaAltipuan",0));
        }
        avustralyaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avustralyaAltieniyi",0));

        avustralyaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralyaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avustralyaAltiResultsonuc=(TextView) findViewById(R.id.avustralyaAltiResultsonuc);
        avustralyaAltiResulteniyi=(TextView) findViewById(R.id.avustralyaAltiResulteniyi);
        avustralyaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.avustralyaAltiresultyenidendenebtn);
        avustralyaAltiresulthomebtn=(ImageButton) findViewById(R.id.avustralyaAltiresulthomebtn);
    }
}
