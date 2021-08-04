package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class HepsiAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsiAltiResultsonuc,hepsiAltiResulteniyi;
    ImageButton hepsiAltiresultyenidendenebtn,hepsiAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_alti_result);
        init();
        hepsiAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("hepsiAltipuan",0));
        if (dataHelper.receiveDataInt("hepsiAltieniyi",0)<dataHelper.receiveDataInt("hepsiAltipuan",0)){
            dataHelper.saveDataInt("hepsiAltieniyi",dataHelper.receiveDataInt("hepsiAltipuan",0));
        }
        hepsiAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("hepsiAltieniyi",0));

        hepsiAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,HepsiAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsiAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        hepsiAltiResultsonuc=(TextView) findViewById(R.id.hepsiAltiResultsonuc);
        hepsiAltiResulteniyi=(TextView) findViewById(R.id.hepsiAltiResulteniyi);
        hepsiAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.hepsiAltiresultyenidendenebtn);
        hepsiAltiresulthomebtn=(ImageButton) findViewById(R.id.hepsiAltiresulthomebtn);
    }
}
