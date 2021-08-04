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

public class KamerikaActivity extends AppCompatActivity {


    RelativeLayout kamerikaDY,kamerika4u1b,kamerika4b1u,kamerikaAlti,kamerikaTablo,kamerikaZK;
    TextView kamerikaDYscor,kamerika4u1bscor,kamerika4b1uscor,kamerikaAltiscor,kamerikaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika);
        init();

        kamerikaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,KamerikaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerika4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Kamerika1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerika4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Kamerika4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerikaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,KamerikaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerikaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        kamerikaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        kamerikaDY=(RelativeLayout)findViewById(R.id.kamerikaDY);
        kamerika4u1b=(RelativeLayout)findViewById(R.id.kamerika4u1b);
        kamerika4b1u=(RelativeLayout)findViewById(R.id.kamerika4b1u);
        kamerikaAlti=(RelativeLayout)findViewById(R.id.kamerikaAlti);
        kamerikaTablo=(RelativeLayout)findViewById(R.id.kamerikaTablo);
        kamerikaZK=(RelativeLayout)findViewById(R.id.kamerikaZK);

        kamerikaDYscor=(TextView) findViewById(R.id.kamerikaDYscor);
        kamerika4u1bscor=(TextView) findViewById(R.id.kamerika4u1bscor);
        kamerika4b1uscor=(TextView) findViewById(R.id.kamerika4b1uscor);
        kamerikaAltiscor=(TextView) findViewById(R.id.kamerikaAltiscor);
        kamerikaZKscor=(TextView) findViewById(R.id.kamerikaZKscor);

        kamerikaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("kamerikaDYeniyi",0)));
        kamerika4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("kamerika1B4Ueniyi",0)));
        kamerika4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("kamerika4B1Ueniyi",0)));
        kamerikaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("kamerikaAltieniyi",0)));
        kamerikaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("kamerikaZKeniyi",0)));

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
