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

public class HepsiActivity extends AppCompatActivity {

    RelativeLayout hepsiDY,hepsi4u1b,hepsi4b1u,hepsiAlti,hepsiZK;
    TextView hepsiDYscor,hepsi4u1bscor,hepsi4b1uscor,hepsiAltiscor,hepsiZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi);
        init();

        hepsiDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,HepsiDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsi4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Hepsi1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsi4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Hepsi4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsiAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,HepsiAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsiZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,HepsiZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
    }
    public void init(){
        hepsiDY=(RelativeLayout)findViewById(R.id.hepsiDY);
        hepsi4u1b=(RelativeLayout)findViewById(R.id.hepsi4u1b);
        hepsi4b1u=(RelativeLayout)findViewById(R.id.hepsi4b1u);
        hepsiAlti=(RelativeLayout)findViewById(R.id.hepsiAlti);
        hepsiZK=(RelativeLayout)findViewById(R.id.hepsiZK);

        hepsiDYscor=(TextView) findViewById(R.id.hepsiDYscor);
        hepsi4u1bscor=(TextView) findViewById(R.id.hepsi4u1bscor);
        hepsi4b1uscor=(TextView) findViewById(R.id.hepsi4b1uscor);
        hepsiAltiscor=(TextView) findViewById(R.id.hepsiAltiscor);
        hepsiZKscor=(TextView) findViewById(R.id.hepsiZKscor);

        hepsiDYscor.setText(String.valueOf(dataHelper.receiveDataInt("hepsiDYeniyi",0)));
        hepsi4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("hepsi1B4Ueniyi",0)));
        hepsi4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("hepsi4B1Ueniyi",0)));
        hepsiAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("hepsiAltieniyi",0)));
        hepsiZKscor.setText(String.valueOf(dataHelper.receiveDataInt("hepsiZKeniyi",0)));

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
