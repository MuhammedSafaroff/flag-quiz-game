package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Afrika4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView afrika4B1UResultsonuc,afrika4B1UResulteniyi;
    ImageButton afrika4B1Uresultyenidendenebtn,afrika4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_4b1u_result);
        init();
        afrika4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("afrika4B1Upuan",0));
        if (dataHelper.receiveDataInt("afrika4B1Ueniyi",0)<dataHelper.receiveDataInt("afrika4B1Upuan",0)){
            dataHelper.saveDataInt("afrika4B1Ueniyi",dataHelper.receiveDataInt("afrika4B1Upuan",0));
        }
        afrika4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("afrika4B1Ueniyi",0));

        afrika4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Afrika4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrika4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        afrika4B1UResultsonuc=(TextView) findViewById(R.id.afrika4B1UResultsonuc);
        afrika4B1UResulteniyi=(TextView) findViewById(R.id.afrika4B1UResulteniyi);
        afrika4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.afrika4B1Uresultyenidendenebtn);
        afrika4B1Uresulthomebtn=(ImageButton) findViewById(R.id.afrika4B1Uresulthomebtn);
    }
}
