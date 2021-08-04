package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gamerika4B1UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerika4B1UResultsonuc,gamerika4B1UResulteniyi;
    ImageButton gamerika4B1Uresultyenidendenebtn,gamerika4B1Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_4b1u_result);
        init();
        gamerika4B1UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("gamerika4B1Upuan",0));
        if (dataHelper.receiveDataInt("gamerika4B1Ueniyi",0)<dataHelper.receiveDataInt("gamerika4B1Upuan",0)){
            dataHelper.saveDataInt("gamerika4B1Ueniyi",dataHelper.receiveDataInt("gamerika4B1Upuan",0));
        }
        gamerika4B1UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("gamerika4B1Ueniyi",0));

        gamerika4B1Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Gamerika4B1UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerika4B1Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        gamerika4B1UResultsonuc=(TextView) findViewById(R.id.gamerika4B1UResultsonuc);
        gamerika4B1UResulteniyi=(TextView) findViewById(R.id.gamerika4B1UResulteniyi);
        gamerika4B1Uresultyenidendenebtn=(ImageButton) findViewById(R.id.gamerika4B1Uresultyenidendenebtn);
        gamerika4B1Uresulthomebtn=(ImageButton) findViewById(R.id.gamerika4B1Uresulthomebtn);
    }
}
