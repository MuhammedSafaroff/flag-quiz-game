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

public class AsyaActivity extends AppCompatActivity {


    RelativeLayout asyaDY,asya4u1b,asya4b1u,asyaAlti,asyaTablo,asyaZK;
    TextView asyaDYscor,asya4u1bscor,asya4b1uscor,asyaAltiscor,asyaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya);
        init();

        asyaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AsyaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asya4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Asya1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asya4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Asya4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asyaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AsyaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asyaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        asyaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        asyaDY=(RelativeLayout)findViewById(R.id.asyaDY);
        asya4u1b=(RelativeLayout)findViewById(R.id.asya4u1b);
        asya4b1u=(RelativeLayout)findViewById(R.id.asya4b1u);
        asyaAlti=(RelativeLayout)findViewById(R.id.asyaAlti);
        asyaTablo=(RelativeLayout)findViewById(R.id.asyaTablo);
        asyaZK=(RelativeLayout)findViewById(R.id.asyaZK);

        asyaDYscor=(TextView) findViewById(R.id.asyaDYscor);
        asya4u1bscor=(TextView) findViewById(R.id.asya4u1bscor);
        asya4b1uscor=(TextView) findViewById(R.id.asya4b1uscor);
        asyaAltiscor=(TextView) findViewById(R.id.asyaAltiscor);
        asyaZKscor=(TextView) findViewById(R.id.asyaZKscor);

        asyaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("asyaDYeniyi",0)));
        asya4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("asya1B4Ueniyi",0)));
        asya4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("asya4B1Ueniyi",0)));
        asyaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("asyaAltieniyi",0)));
        asyaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("asyaZKeniyi",0)));

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
