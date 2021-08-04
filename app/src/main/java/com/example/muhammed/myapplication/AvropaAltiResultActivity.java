package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvropaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avropaAltiResultsonuc,avropaAltiResulteniyi;
    ImageButton avropaAltiresultyenidendenebtn,avropaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_alti_result);
        init();
        avropaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avropaAltipuan",0));
        if (dataHelper.receiveDataInt("avropaAltieniyi",0)<dataHelper.receiveDataInt("avropaAltipuan",0)){
            dataHelper.saveDataInt("avropaAltieniyi",dataHelper.receiveDataInt("avropaAltipuan",0));
        }
        avropaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avropaAltieniyi",0));

        avropaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvropaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avropaAltiResultsonuc=(TextView) findViewById(R.id.avropaAltiResultsonuc);
        avropaAltiResulteniyi=(TextView) findViewById(R.id.avropaAltiResulteniyi);
        avropaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.avropaAltiresultyenidendenebtn);
        avropaAltiresulthomebtn=(ImageButton) findViewById(R.id.avropaAltiresulthomebtn);
    }
}
