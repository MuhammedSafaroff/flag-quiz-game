package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class GamerikaActivity extends AppCompatActivity {


    RelativeLayout gamerikaDY,gamerika4u1b,gamerika4b1u,gamerikaAlti,gamerikaTablo,gamerikaZK;
    TextView gamerikaDYscor,gamerika4u1bscor,gamerika4b1uscor,gamerikaAltiscor,gamerikaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika);
        init();

        gamerikaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,GamerikaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerika4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Gamerika1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerika4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Gamerika4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerikaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,GamerikaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerikaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        gamerikaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        gamerikaDY=(RelativeLayout)findViewById(R.id.gamerikaDY);
        gamerika4u1b=(RelativeLayout)findViewById(R.id.gamerika4u1b);
        gamerika4b1u=(RelativeLayout)findViewById(R.id.gamerika4b1u);
        gamerikaAlti=(RelativeLayout)findViewById(R.id.gamerikaAlti);
        gamerikaTablo=(RelativeLayout)findViewById(R.id.gamerikaTablo);
        gamerikaZK=(RelativeLayout)findViewById(R.id.gamerikaZK);

        gamerikaDYscor=(TextView) findViewById(R.id.gamerikaDYscor);
        gamerika4u1bscor=(TextView) findViewById(R.id.gamerika4u1bscor);
        gamerika4b1uscor=(TextView) findViewById(R.id.gamerika4b1uscor);
        gamerikaAltiscor=(TextView) findViewById(R.id.gamerikaAltiscor);
        gamerikaZKscor=(TextView) findViewById(R.id.gamerikaZKscor);

        gamerikaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("gamerikaDYeniyi",0)));
        gamerika4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("gamerika1B4Ueniyi",0)));
        gamerika4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("gamerika4B1Ueniyi",0)));
        gamerikaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("gamerikaAltieniyi",0)));
        gamerikaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("gamerikaZKeniyi",0)));

    }
    private void reklam(){
        //reklam

        MobileAds.initialize(this,
                getString(R.string.reklam_id));
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.reklam_gecis));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
                super.onAdLoaded();
            }
        });

    }

}
