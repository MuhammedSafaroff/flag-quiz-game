package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Kamerika1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerika1B4UResultsonuc,kamerika1B4UResulteniyi;
    ImageButton kamerika1B4Uresultyenidendenebtn,kamerika1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_1b4u_result);
        init();
        kamerika1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("kamerika1B4Upuan",0));
        if (dataHelper.receiveDataInt("kamerika1B4Ueniyi",0)<dataHelper.receiveDataInt("kamerika1B4Upuan",0)){
            dataHelper.saveDataInt("kamerika1B4Ueniyi",dataHelper.receiveDataInt("kamerika1B4Upuan",0));
        }
        kamerika1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("kamerika1B4Ueniyi",0));

        kamerika1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Kamerika1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerika1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        kamerika1B4UResultsonuc=(TextView) findViewById(R.id.kamerika1B4UResultsonuc);
        kamerika1B4UResulteniyi=(TextView) findViewById(R.id.kamerika1B4UResulteniyi);
        kamerika1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.kamerika1B4Uresultyenidendenebtn);
        kamerika1B4Uresulthomebtn=(ImageButton) findViewById(R.id.kamerika1B4Uresulthomebtn);
    }
}
