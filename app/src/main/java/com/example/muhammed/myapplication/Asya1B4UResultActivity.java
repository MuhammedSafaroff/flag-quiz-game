package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Asya1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView asya1B4UResultsonuc,asya1B4UResulteniyi;
    ImageButton asya1B4Uresultyenidendenebtn,asya1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_1b4u_result);
        init();
        asya1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("asya1B4Upuan",0));
        if (dataHelper.receiveDataInt("asya1B4Ueniyi",0)<dataHelper.receiveDataInt("asya1B4Upuan",0)){
            dataHelper.saveDataInt("asya1B4Ueniyi",dataHelper.receiveDataInt("asya1B4Upuan",0));
        }
        asya1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("asya1B4Ueniyi",0));

        asya1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Asya1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asya1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        asya1B4UResultsonuc=(TextView) findViewById(R.id.asya1B4UResultsonuc);
        asya1B4UResulteniyi=(TextView) findViewById(R.id.asya1B4UResulteniyi);
        asya1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.asya1B4Uresultyenidendenebtn);
        asya1B4Uresulthomebtn=(ImageButton) findViewById(R.id.asya1B4Uresulthomebtn);
    }
}
