package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvustralyaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralyaZKResultsonuc,avustralyaZKResulteniyi;
    ImageButton avustralyaZKresultyenidendenebtn,avustralyaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_zk_result);
        init();
        avustralyaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avustralyaZKpuan",0));
        if (dataHelper.receiveDataInt("avustralyaZKeniyi",0)<dataHelper.receiveDataInt("avustralyaZKpuan",0)){
            dataHelper.saveDataInt("avustralyaZKeniyi",dataHelper.receiveDataInt("avustralyaZKpuan",0));
        }
        avustralyaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avustralyaZKeniyi",0));

        avustralyaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralyaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avustralyaZKResultsonuc=(TextView) findViewById(R.id.avustralyaZKResultsonuc);
        avustralyaZKResulteniyi=(TextView) findViewById(R.id.avustralyaZKResulteniyi);
        avustralyaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.avustralyaZKresultyenidendenebtn);
        avustralyaZKresulthomebtn=(ImageButton) findViewById(R.id.avustralyaZKresulthomebtn);
    }
}
