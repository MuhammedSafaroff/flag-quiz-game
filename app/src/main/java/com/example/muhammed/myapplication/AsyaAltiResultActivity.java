package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AsyaAltiResultActivity extends AppCompatActivity {
    Context context=this;
    TextView asyaAltiResultsonuc,asyaAltiResulteniyi;
    ImageButton asyaAltiresultyenidendenebtn,asyaAltiresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_alti_result);
        init();
        asyaAltiResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("asyaAltipuan",0));
        if (dataHelper.receiveDataInt("asyaAltieniyi",0)<dataHelper.receiveDataInt("asyaAltipuan",0)){
            dataHelper.saveDataInt("asyaAltieniyi",dataHelper.receiveDataInt("asyaAltipuan",0));
        }
        asyaAltiResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("asyaAltieniyi",0));

        asyaAltiresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaAltiActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asyaAltiresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        asyaAltiResultsonuc=(TextView) findViewById(R.id.asyaAltiResultsonuc);
        asyaAltiResulteniyi=(TextView) findViewById(R.id.asyaAltiResulteniyi);
        asyaAltiresultyenidendenebtn=(ImageButton) findViewById(R.id.asyaAltiresultyenidendenebtn);
        asyaAltiresulthomebtn=(ImageButton) findViewById(R.id.asyaAltiresulthomebtn);
    }
}
