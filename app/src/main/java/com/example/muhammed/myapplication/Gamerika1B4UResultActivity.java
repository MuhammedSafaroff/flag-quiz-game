package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Gamerika1B4UResultActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerika1B4UResultsonuc,gamerika1B4UResulteniyi;
    ImageButton gamerika1B4Uresultyenidendenebtn,gamerika1B4Uresulthomebtn;
    DataHelper dataHelper = new DataHelper(context);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_1b4u_result);
        init();
        gamerika1B4UResultsonuc.setText(getString(R.string.sonuc)+" "+dataHelper.receiveDataInt("gamerika1B4Upuan",0));
        if (dataHelper.receiveDataInt("gamerika1B4Ueniyi",0)<dataHelper.receiveDataInt("gamerika1B4Upuan",0)){
            dataHelper.saveDataInt("gamerika1B4Ueniyi",dataHelper.receiveDataInt("gamerika1B4Upuan",0));
        }
        gamerika1B4UResulteniyi.setText(getString(R.string.en_iyi)+" "+dataHelper.receiveDataInt("gamerika1B4Ueniyi",0));

        gamerika1B4Uresultyenidendenebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,Gamerika1B4UActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerika1B4Uresulthomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });




    }
    public void init(){
        gamerika1B4UResultsonuc=(TextView) findViewById(R.id.gamerika1B4UResultsonuc);
        gamerika1B4UResulteniyi=(TextView) findViewById(R.id.gamerika1B4UResulteniyi);
        gamerika1B4Uresultyenidendenebtn=(ImageButton) findViewById(R.id.gamerika1B4Uresultyenidendenebtn);
        gamerika1B4Uresulthomebtn=(ImageButton) findViewById(R.id.gamerika1B4Uresulthomebtn);
    }
}
