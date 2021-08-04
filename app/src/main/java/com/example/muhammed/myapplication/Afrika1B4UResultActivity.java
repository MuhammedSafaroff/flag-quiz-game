package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Afrika1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView afrika1B4UResultsonuc,afrika1B4UResulteniyi;
    ImageButton afrika1B4Uresultyenidendenebtn,afrika1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_1b4u_result);
        init();
        afrika1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("afrika1B4Upuan",0));
        if (dataHelper.receiveDataInt("afrika1B4Ueniyi",0)<dataHelper.receiveDataInt("afrika1B4Upuan",0)){
            dataHelper.saveDataInt("afrika1B4Ueniyi",dataHelper.receiveDataInt("afrika1B4Upuan",0));
        }
        afrika1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("afrika1B4Ueniyi",0));

        afrika1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Afrika1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrika1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        afrika1B4UResultsonuc=(TextView) findViewById(R.id.afrika1B4UResultsonuc);
        afrika1B4UResulteniyi=(TextView) findViewById(R.id.afrika1B4UResulteniyi);
        afrika1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.afrika1B4Uresultyenidendenebtn);
        afrika1B4Uresulthomebtn=(ImageButton) findViewById(R.id.afrika1B4Uresulthomebtn);
    }
}
