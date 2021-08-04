package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Avropa1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView avropa1B4UResultsonuc,avropa1B4UResulteniyi;
    ImageButton avropa1B4Uresultyenidendenebtn,avropa1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_1b4u_result);
        init();
        avropa1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("avropa1B4Upuan",0));
        if (dataHelper.receiveDataInt("avropa1B4Ueniyi",0)<dataHelper.receiveDataInt("avropa1B4Upuan",0)){
            dataHelper.saveDataInt("avropa1B4Ueniyi",dataHelper.receiveDataInt("avropa1B4Upuan",0));
        }
        avropa1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("avropa1B4Ueniyi",0));

        avropa1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Avropa1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropa1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        avropa1B4UResultsonuc=(TextView) findViewById(R.id.avropa1B4UResultsonuc);
        avropa1B4UResulteniyi=(TextView) findViewById(R.id.avropa1B4UResulteniyi);
        avropa1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.avropa1B4Uresultyenidendenebtn);
        avropa1B4Uresulthomebtn=(ImageButton) findViewById(R.id.avropa1B4Uresulthomebtn);
    }
}
