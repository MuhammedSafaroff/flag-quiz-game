package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Kamerika4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerika4B1UResultsonuc,kamerika4B1UResulteniyi;
    ImageButton kamerika4B1Uresultyenidendenebtn,kamerika4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_4b1u_result);
        init();
        kamerika4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("kamerika4B1Upuan",0));
        if (dataHelper.receiveDataInt("kamerika4B1Ueniyi",0)<dataHelper.receiveDataInt("kamerika4B1Upuan",0)){
            dataHelper.saveDataInt("kamerika4B1Ueniyi",dataHelper.receiveDataInt("kamerika4B1Upuan",0));
        }
        kamerika4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("kamerika4B1Ueniyi",0));

        kamerika4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Kamerika4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerika4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        kamerika4B1UResultsonuc=(TextView) findViewById(R.id.kamerika4B1UResultsonuc);
        kamerika4B1UResulteniyi=(TextView) findViewById(R.id.kamerika4B1UResulteniyi);
        kamerika4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.kamerika4B1Uresultyenidendenebtn);
        kamerika4B1Uresulthomebtn=(ImageButton) findViewById(R.id.kamerika4B1Uresulthomebtn);
    }
}
