package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AsyaDYResultActivity extends AppCompatActivity {
    Context context=this;
    TextView asyaDYResultsonuc,asyaDYResulteniyi;
    ImageButton asyaDYresultyenidendenebtn,asyaDYresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_asya_dy);
        init();
        asyaDYResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("asyaDYpuan",0));
        if (dataHelper.receiveDataInt("asyaDYeniyi",0)<dataHelper.receiveDataInt("asyaDYpuan",0)){
            dataHelper.saveDataInt("asyaDYeniyi",dataHelper.receiveDataInt("asyaDYpuan",0));
        }
        asyaDYResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("asyaDYeniyi",0));

        asyaDYresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaDYActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asyaDYresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        asyaDYResultsonuc=(TextView) findViewById(R.id.asyaDYResultsonuc);
        asyaDYResulteniyi=(TextView) findViewById(R.id.asyaDYResulteniyi);
        asyaDYresultyenidendenebtn=(ImageButton) findViewById(R.id.asyaDYresultyenidendenebtn);
        asyaDYresulthomebtn=(ImageButton) findViewById(R.id.asyaDYresulthomebtn);
    }
}
