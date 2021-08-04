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

public class AfrikaActivity extends AppCompatActivity {


    RelativeLayout afrikaDY,afrika4u1b,afrika4b1u,afrikaAlti,afrikaTablo,afrikaZK;
    TextView afrikaDYscor,afrika4u1bscor,afrika4b1uscor,afrikaAltiscor,afrikaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika);
        init();

        afrikaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AfrikaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrika4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Afrika1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrika4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Afrika4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrikaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AfrikaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrikaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        afrikaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        afrikaDY=(RelativeLayout)findViewById(R.id.afrikaDY);
        afrika4u1b=(RelativeLayout)findViewById(R.id.afrika4u1b);
        afrika4b1u=(RelativeLayout)findViewById(R.id.afrika4b1u);
        afrikaAlti=(RelativeLayout)findViewById(R.id.afrikaAlti);
        afrikaTablo=(RelativeLayout)findViewById(R.id.afrikaTablo);
        afrikaZK=(RelativeLayout)findViewById(R.id.afrikaZK);

        afrikaDYscor=(TextView) findViewById(R.id.afrikaDYscor);
        afrika4u1bscor=(TextView) findViewById(R.id.afrika4u1bscor);
        afrika4b1uscor=(TextView) findViewById(R.id.afrika4b1uscor);
        afrikaAltiscor=(TextView) findViewById(R.id.afrikaAltiscor);
        afrikaZKscor=(TextView) findViewById(R.id.afrikaZKscor);

        afrikaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("afrikaDYeniyi",0)));
        afrika4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("afrika1B4Ueniyi",0)));
        afrika4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("afrika4B1Ueniyi",0)));
        afrikaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("afrikaAltieniyi",0)));
        afrikaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("afrikaZKeniyi",0)));

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
