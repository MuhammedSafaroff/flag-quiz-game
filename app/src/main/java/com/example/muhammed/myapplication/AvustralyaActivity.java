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

public class AvustralyaActivity extends AppCompatActivity {


    RelativeLayout avustralyaDY,avustralya4u1b,avustralya4b1u,avustralyaAlti,avustralyaTablo,avustralyaZK;
    TextView avustralyaDYscor,avustralya4u1bscor,avustralya4b1uscor,avustralyaAltiscor,avustralyaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya);
        init();

        avustralyaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AvustralyaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralya4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Avustralya1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralya4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Avustralya4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralyaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AvustralyaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralyaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        avustralyaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        avustralyaDY=(RelativeLayout)findViewById(R.id.avustralyaDY);
        avustralya4u1b=(RelativeLayout)findViewById(R.id.avustralya4u1b);
        avustralya4b1u=(RelativeLayout)findViewById(R.id.avustralya4b1u);
        avustralyaAlti=(RelativeLayout)findViewById(R.id.avustralyaAlti);
        avustralyaTablo=(RelativeLayout)findViewById(R.id.avustralyaTablo);
        avustralyaZK=(RelativeLayout)findViewById(R.id.avustralyaZK);

        avustralyaDYscor=(TextView) findViewById(R.id.avustralyaDYscor);
        avustralya4u1bscor=(TextView) findViewById(R.id.avustralya4u1bscor);
        avustralya4b1uscor=(TextView) findViewById(R.id.avustralya4b1uscor);
        avustralyaAltiscor=(TextView) findViewById(R.id.avustralyaAltiscor);
        avustralyaZKscor=(TextView) findViewById(R.id.avustralyaZKscor);

        avustralyaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("avustralyaDYeniyi",0)));
        avustralya4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("avustralya1B4Ueniyi",0)));
        avustralya4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("avustralya4B1Ueniyi",0)));
        avustralyaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("avustralyaAltieniyi",0)));
        avustralyaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("avustralyaZKeniyi",0)));

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
