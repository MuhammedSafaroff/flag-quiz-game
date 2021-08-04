package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AvropaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avropaZKResultsonuc,avropaZKResulteniyi;
    ImageButton avropaZKresultyenidendenebtn,avropaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_zk_result);
        init();
        avropaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avropaZKpuan",0));
        if (dataHelper.receiveDataInt("avropaZKeniyi",0)<dataHelper.receiveDataInt("avropaZKpuan",0)){
            dataHelper.saveDataInt("avropaZKeniyi",dataHelper.receiveDataInt("avropaZKpuan",0));
        }
        avropaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avropaZKeniyi",0));

        avropaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvropaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avropaZKResultsonuc=(TextView) findViewById(R.id.avropaZKResultsonuc);
        avropaZKResulteniyi=(TextView) findViewById(R.id.avropaZKResulteniyi);
        avropaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.avropaZKresultyenidendenebtn);
        avropaZKresulthomebtn=(ImageButton) findViewById(R.id.avropaZKresulthomebtn);
    }
}
