package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GamerikaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerikaZKResultsonuc,gamerikaZKResulteniyi;
    ImageButton gamerikaZKresultyenidendenebtn,gamerikaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_zk_result);
        init();
        gamerikaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("gamerikaZKpuan",0));
        if (dataHelper.receiveDataInt("gamerikaZKeniyi",0)<dataHelper.receiveDataInt("gamerikaZKpuan",0)){
            dataHelper.saveDataInt("gamerikaZKeniyi",dataHelper.receiveDataInt("gamerikaZKpuan",0));
        }
        gamerikaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("gamerikaZKeniyi",0));

        gamerikaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerikaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        gamerikaZKResultsonuc=(TextView) findViewById(R.id.gamerikaZKResultsonuc);
        gamerikaZKResulteniyi=(TextView) findViewById(R.id.gamerikaZKResulteniyi);
        gamerikaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.gamerikaZKresultyenidendenebtn);
        gamerikaZKresulthomebtn=(ImageButton) findViewById(R.id.gamerikaZKresulthomebtn);
    }
}
