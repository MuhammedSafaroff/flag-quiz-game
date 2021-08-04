package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HepsiZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsiZKResultsonuc,hepsiZKResulteniyi;
    ImageButton hepsiZKresultyenidendenebtn,hepsiZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_zk_result);
        init();
        hepsiZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("hepsiZKpuan",0));
        if (dataHelper.receiveDataInt("hepsiZKeniyi",0)<dataHelper.receiveDataInt("hepsiZKpuan",0)){
            dataHelper.saveDataInt("hepsiZKeniyi",dataHelper.receiveDataInt("hepsiZKpuan",0));
        }
        hepsiZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("hepsiZKeniyi",0));

        hepsiZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,HepsiZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsiZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        hepsiZKResultsonuc=(TextView) findViewById(R.id.hepsiZKResultsonuc);
        hepsiZKResulteniyi=(TextView) findViewById(R.id.hepsiZKResulteniyi);
        hepsiZKresultyenidendenebtn=(ImageButton) findViewById(R.id.hepsiZKresultyenidendenebtn);
        hepsiZKresulthomebtn=(ImageButton) findViewById(R.id.hepsiZKresulthomebtn);
    }
}
