package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GamerikaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerikaDYResultsonuc,gamerikaDYResulteniyi;
    ImageButton gamerikaDYresultyenidendenebtn,gamerikaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_dy_result);
        init();
        gamerikaDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("gamerikaDYpuan",0));
        if (dataHelper.receiveDataInt("gamerikaDYeniyi",0)<dataHelper.receiveDataInt("gamerikaDYpuan",0)){
            dataHelper.saveDataInt("gamerikaDYeniyi",dataHelper.receiveDataInt("gamerikaDYpuan",0));
        }
        gamerikaDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("gamerikaDYeniyi",0));

        gamerikaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerikaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        gamerikaDYResultsonuc=(TextView) findViewById(R.id.gamerikaDYResultsonuc);
        gamerikaDYResulteniyi=(TextView) findViewById(R.id.gamerikaDYResulteniyi);
        gamerikaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.gamerikaDYresultyenidendenebtn);
        gamerikaDYresulthomebtn=(ImageButton) findViewById(R.id.gamerikaDYresulthomebtn);
    }
}
