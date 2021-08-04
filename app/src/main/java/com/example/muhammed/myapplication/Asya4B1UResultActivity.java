package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Asya4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView asya4B1UResultsonuc,asya4B1UResulteniyi;
    ImageButton asya4B1Uresultyenidendenebtn,asya4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_4b1u_result);
        init();
        asya4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("asya4B1Upuan",0));
        if (dataHelper.receiveDataInt("asya4B1Ueniyi",0)<dataHelper.receiveDataInt("asya4B1Upuan",0)){
            dataHelper.saveDataInt("asya4B1Ueniyi",dataHelper.receiveDataInt("asya4B1Upuan",0));
        }
        asya4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("asya4B1Ueniyi",0));

        asya4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Asya4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asya4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        asya4B1UResultsonuc=(TextView) findViewById(R.id.asya4B1UResultsonuc);
        asya4B1UResulteniyi=(TextView) findViewById(R.id.asya4B1UResulteniyi);
        asya4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.asya4B1Uresultyenidendenebtn);
        asya4B1Uresulthomebtn=(ImageButton) findViewById(R.id.asya4B1Uresulthomebtn);
    }
}
