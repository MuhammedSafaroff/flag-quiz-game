package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HepsiDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsiDYResultsonuc,hepsiDYResulteniyi;
    ImageButton hepsiDYresultyenidendenebtn,hepsiDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_dy_result);
        init();
        hepsiDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("hepsiDYpuan",0));
        if (dataHelper.receiveDataInt("hepsiDYeniyi",0)<dataHelper.receiveDataInt("hepsiDYpuan",0)){
            dataHelper.saveDataInt("hepsiDYeniyi",dataHelper.receiveDataInt("hepsiDYpuan",0));
        }
        hepsiDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("hepsiDYeniyi",0));

        hepsiDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,HepsiDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsiDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        hepsiDYResultsonuc=(TextView) findViewById(R.id.hepsiDYResultsonuc);
        hepsiDYResulteniyi=(TextView) findViewById(R.id.hepsiDYResulteniyi);
        hepsiDYresultyenidendenebtn=(ImageButton) findViewById(R.id.hepsiDYresultyenidendenebtn);
        hepsiDYresulthomebtn=(ImageButton) findViewById(R.id.hepsiDYresulthomebtn);
    }
}
