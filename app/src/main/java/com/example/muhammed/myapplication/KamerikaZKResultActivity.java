package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class KamerikaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerikaZKResultsonuc,kamerikaZKResulteniyi;
    ImageButton kamerikaZKresultyenidendenebtn,kamerikaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_zk_result);
        init();
        kamerikaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("kamerikaZKpuan",0));
        if (dataHelper.receiveDataInt("kamerikaZKeniyi",0)<dataHelper.receiveDataInt("kamerikaZKpuan",0)){
            dataHelper.saveDataInt("kamerikaZKeniyi",dataHelper.receiveDataInt("kamerikaZKpuan",0));
        }
        kamerikaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("kamerikaZKeniyi",0));

        kamerikaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerikaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        kamerikaZKResultsonuc=(TextView) findViewById(R.id.kamerikaZKResultsonuc);
        kamerikaZKResulteniyi=(TextView) findViewById(R.id.kamerikaZKResulteniyi);
        kamerikaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.kamerikaZKresultyenidendenebtn);
        kamerikaZKresulthomebtn=(ImageButton) findViewById(R.id.kamerikaZKresulthomebtn);
    }
}
