package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hepsi4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsi4B1UResultsonuc,hepsi4B1UResulteniyi;
    ImageButton hepsi4B1Uresultyenidendenebtn,hepsi4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_4b1u_result);
        init();
        hepsi4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("hepsi4B1Upuan",0));
        if (dataHelper.receiveDataInt("hepsi4B1Ueniyi",0)<dataHelper.receiveDataInt("hepsi4B1Upuan",0)){
            dataHelper.saveDataInt("hepsi4B1Ueniyi",dataHelper.receiveDataInt("hepsi4B1Upuan",0));
        }
        hepsi4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("hepsi4B1Ueniyi",0));

        hepsi4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Hepsi4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsi4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        hepsi4B1UResultsonuc=(TextView) findViewById(R.id.hepsi4B1UResultsonuc);
        hepsi4B1UResulteniyi=(TextView) findViewById(R.id.hepsi4B1UResulteniyi);
        hepsi4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.hepsi4B1Uresultyenidendenebtn);
        hepsi4B1Uresulthomebtn=(ImageButton) findViewById(R.id.hepsi4B1Uresulthomebtn);
    }
}
