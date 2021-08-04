package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
        RelativeLayout avrupa,asya,kamerika,gamerika,afrika,avustralya,hepsi,ayarlar;
        Context context= this;
        Typeface font;
        TextView girisbasliq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        avrupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvrupaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        asya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AsyaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        kamerika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,KamerikaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        gamerika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,GamerikaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        afrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AfrikaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        avustralya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,AvustralyaActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });

        hepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,HepsiActivity.class));
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
            }
        });


    }

    public void init(){
        avrupa = (RelativeLayout) findViewById(R.id.avrupa);
        asya = (RelativeLayout) findViewById(R.id.asya);
        kamerika = (RelativeLayout) findViewById(R.id.kamerika);
        gamerika = (RelativeLayout) findViewById(R.id.gamerika);
        afrika = (RelativeLayout) findViewById(R.id.afrika);
        avustralya = (RelativeLayout) findViewById(R.id.avustralya);
        hepsi = (RelativeLayout) findViewById(R.id.hepsi);
        ayarlar = (RelativeLayout) findViewById(R.id.ayarlar);
        girisbasliq = (TextView) findViewById(R.id.girisbasliq);
        font = Typeface.createFromAsset(getAssets(),"fonts/FredokaOneRegular.ttf");
        girisbasliq.setTypeface(font);
    }
}
