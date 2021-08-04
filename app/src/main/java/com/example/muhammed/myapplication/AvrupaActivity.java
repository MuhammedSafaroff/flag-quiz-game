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

public class AvrupaActivity extends AppCompatActivity {


    RelativeLayout avropaDY,avropa4u1b,avropa4b1u,avropaAlti,avropaTablo,avropaZK;
    TextView avropaDYscor,avropa4u1bscor,avropa4b1uscor,avropaAltiscor,avropaZKscor;
    Context context=this;
    DataHelper dataHelper = new DataHelper(context);
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avrupa);
        init();

        avropaDY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AvropaDYActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropa4u1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Avropa1B4UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropa4b1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,Avropa4B1UActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropaAlti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,AvropaAltiActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avropaTablo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvropaTabloActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });
        avropaZK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvropaZKActivity.class));
                reklam();
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

    }
    public void init(){
        avropaDY=(RelativeLayout)findViewById(R.id.avropaDY);
        avropa4u1b=(RelativeLayout)findViewById(R.id.avropa4u1b);
        avropa4b1u=(RelativeLayout)findViewById(R.id.avropa4b1u);
        avropaAlti=(RelativeLayout)findViewById(R.id.avropaAlti);
        avropaTablo=(RelativeLayout)findViewById(R.id.avropaTablo);
        avropaZK=(RelativeLayout)findViewById(R.id.avropaZK);

        avropaDYscor=(TextView) findViewById(R.id.avropaDYscor);
        avropa4u1bscor=(TextView) findViewById(R.id.avropa4u1bscor);
        avropa4b1uscor=(TextView) findViewById(R.id.avropa4b1uscor);
        avropaAltiscor=(TextView) findViewById(R.id.avropaAltiscor);
        avropaZKscor=(TextView) findViewById(R.id.avropaZKscor);

        avropaDYscor.setText(String.valueOf(dataHelper.receiveDataInt("avropaDYeniyi",0)));
        avropa4u1bscor.setText(String.valueOf(dataHelper.receiveDataInt("avropa1B4Ueniyi",0)));
        avropa4b1uscor.setText(String.valueOf(dataHelper.receiveDataInt("avropa4B1Ueniyi",0)));
        avropaAltiscor.setText(String.valueOf(dataHelper.receiveDataInt("avropaAltieniyi",0)));
        avropaZKscor.setText(String.valueOf(dataHelper.receiveDataInt("avropaZKeniyi",0)));

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
