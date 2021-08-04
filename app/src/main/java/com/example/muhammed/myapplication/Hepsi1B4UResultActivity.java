package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hepsi1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsi1B4UResultsonuc,hepsi1B4UResulteniyi;
    ImageButton hepsi1B4Uresultyenidendenebtn,hepsi1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_1b4u_result);
        init();
        hepsi1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("hepsi1B4Upuan",0));
        if (dataHelper.receiveDataInt("hepsi1B4Ueniyi",0)<dataHelper.receiveDataInt("hepsi1B4Upuan",0)){
            dataHelper.saveDataInt("hepsi1B4Ueniyi",dataHelper.receiveDataInt("hepsi1B4Upuan",0));
        }
        hepsi1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("hepsi1B4Ueniyi",0));

        hepsi1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Hepsi1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsi1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        hepsi1B4UResultsonuc=(TextView) findViewById(R.id.hepsi1B4UResultsonuc);
        hepsi1B4UResulteniyi=(TextView) findViewById(R.id.hepsi1B4UResulteniyi);
        hepsi1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.hepsi1B4Uresultyenidendenebtn);
        hepsi1B4Uresulthomebtn=(ImageButton) findViewById(R.id.hepsi1B4Uresulthomebtn);
    }
}
