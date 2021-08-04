package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AfrikaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView afrikaDYResultsonuc,afrikaDYResulteniyi;
    ImageButton afrikaDYresultyenidendenebtn,afrikaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_dy_result);
        init();
        afrikaDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("afrikaDYpuan",0));
        if (dataHelper.receiveDataInt("afrikaDYeniyi",0)<dataHelper.receiveDataInt("afrikaDYpuan",0)){
            dataHelper.saveDataInt("afrikaDYeniyi",dataHelper.receiveDataInt("afrikaDYpuan",0));
        }
        afrikaDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("afrikaDYeniyi",0));

        afrikaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrikaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        afrikaDYResultsonuc=(TextView) findViewById(R.id.afrikaDYResultsonuc);
        afrikaDYResulteniyi=(TextView) findViewById(R.id.afrikaDYResulteniyi);
        afrikaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.afrikaDYresultyenidendenebtn);
        afrikaDYresulthomebtn=(ImageButton) findViewById(R.id.afrikaDYresulthomebtn);
    }
}
