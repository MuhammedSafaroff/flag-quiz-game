package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GamerikaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerikaAltiResultsonuc,gamerikaAltiResulteniyi;
    ImageButton gamerikaAltiresultyenidendenebtn,gamerikaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_alti_result);
        init();
        gamerikaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("gamerikaAltipuan",0));
        if (dataHelper.receiveDataInt("gamerikaAltieniyi",0)<dataHelper.receiveDataInt("gamerikaAltipuan",0)){
            dataHelper.saveDataInt("gamerikaAltieniyi",dataHelper.receiveDataInt("gamerikaAltipuan",0));
        }
        gamerikaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("gamerikaAltieniyi",0));

        gamerikaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerikaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        gamerikaAltiResultsonuc=(TextView) findViewById(R.id.gamerikaAltiResultsonuc);
        gamerikaAltiResulteniyi=(TextView) findViewById(R.id.gamerikaAltiResulteniyi);
        gamerikaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.gamerikaAltiresultyenidendenebtn);
        gamerikaAltiresulthomebtn=(ImageButton) findViewById(R.id.gamerikaAltiresulthomebtn);
    }
}
