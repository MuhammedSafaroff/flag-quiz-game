package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AsyaZKResultActivity extends AppCompatActivity {
    Context context=this;
    TextView asyaZKResultsonuc,asyaZKResulteniyi;
    ImageButton asyaZKresultyenidendenebtn,asyaZKresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_zk_result);
        init();
        asyaZKResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("asyaZKpuan",0));
        if (dataHelper.receiveDataInt("asyaZKeniyi",0)<dataHelper.receiveDataInt("asyaZKpuan",0)){
            dataHelper.saveDataInt("asyaZKeniyi",dataHelper.receiveDataInt("asyaZKpuan",0));
        }
        asyaZKResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("asyaZKeniyi",0));

        asyaZKresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaZKActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asyaZKresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        asyaZKResultsonuc=(TextView) findViewById(R.id.asyaZKResultsonuc);
        asyaZKResulteniyi=(TextView) findViewById(R.id.asyaZKResulteniyi);
        asyaZKresultyenidendenebtn=(ImageButton) findViewById(R.id.asyaZKresultyenidendenebtn);
        asyaZKresulthomebtn=(ImageButton) findViewById(R.id.asyaZKresulthomebtn);
    }
}
