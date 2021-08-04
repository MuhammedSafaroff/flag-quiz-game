package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Avropa4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avropa4B1UResultsonuc,avropa4B1UResulteniyi;
    ImageButton avropa4B1Uresultyenidendenebtn,avropa4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_4b1u_result);
        init();
        avropa4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avropa4B1Upuan",0));
        if (dataHelper.receiveDataInt("avropa4B1Ueniyi",0)<dataHelper.receiveDataInt("avropa4B1Upuan",0)){
            dataHelper.saveDataInt("avropa4B1Ueniyi",dataHelper.receiveDataInt("avropa4B1Upuan",0));
        }
        avropa4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avropa4B1Ueniyi",0));

        avropa4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Avropa4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropa4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avropa4B1UResultsonuc=(TextView) findViewById(R.id.avropa4B1UResultsonuc);
        avropa4B1UResulteniyi=(TextView) findViewById(R.id.avropa4B1UResulteniyi);
        avropa4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.avropa4B1Uresultyenidendenebtn);
        avropa4B1Uresulthomebtn=(ImageButton) findViewById(R.id.avropa4B1Uresulthomebtn);
    }
}
