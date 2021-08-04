package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class KamerikaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerikaAltiResultsonuc,kamerikaAltiResulteniyi;
    ImageButton kamerikaAltiresultyenidendenebtn,kamerikaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_alti_result);
        init();
        kamerikaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("kamerikaAltipuan",0));
        if (dataHelper.receiveDataInt("kamerikaAltieniyi",0)<dataHelper.receiveDataInt("kamerikaAltipuan",0)){
            dataHelper.saveDataInt("kamerikaAltieniyi",dataHelper.receiveDataInt("kamerikaAltipuan",0));
        }
        kamerikaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("kamerikaAltieniyi",0));

        kamerikaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerikaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        kamerikaAltiResultsonuc=(TextView) findViewById(R.id.kamerikaAltiResultsonuc);
        kamerikaAltiResulteniyi=(TextView) findViewById(R.id.kamerikaAltiResulteniyi);
        kamerikaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.kamerikaAltiresultyenidendenebtn);
        kamerikaAltiresulthomebtn=(ImageButton) findViewById(R.id.kamerikaAltiresulthomebtn);
    }
}
