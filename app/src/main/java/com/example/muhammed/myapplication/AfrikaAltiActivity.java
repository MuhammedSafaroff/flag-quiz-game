package com.example.muhammed.myapplication;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AfrikaAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();
    private AdView mAdView;
    TextView afrikaAltipuan,afrikaAltiisim;
    LinearLayout afrikaAltibtn1li,afrikaAltibtn2li,afrikaAltibtn3li,afrikaAltibtn4li,afrikaAltibtn5li,afrikaAltibtn6li;
    ImageView afrikaAltibtn1image,afrikaAltibtn2image,afrikaAltibtn3image,afrikaAltibtn4image,afrikaAltibtn5image,afrikaAltibtn6image,afrikaAltican1,afrikaAltican2,afrikaAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_alti);
        init();
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final int bayraqArray[]=new int[]{R.drawable.algeria,R.drawable.angola,R.drawable.benin,R.drawable.botswana,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cape_verde,R.drawable.cameroon,R.drawable.central_african_republic,R.drawable.chad,R.drawable.comoros,R.drawable.cote_dlvoire,R.drawable.democratic_republic_of_the_congo,R.drawable.djibouti,R.drawable.egypt,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.ethiopia,R.drawable.gabon,R.drawable.ghana,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.kenya,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.madagascar,R.drawable.malawi,R.drawable.mali,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mayotte,R.drawable.morocco,R.drawable.mozambique,R.drawable.namibia,R.drawable.niger,R.drawable.nigeria,R.drawable.republic_of_the_congo,R.drawable.reunion,R.drawable.rwanda,R.drawable.sao_tome_and_principe,R.drawable.senegal,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.somalia,R.drawable.south_africa,R.drawable.sudan,R.drawable.swaziland,R.drawable.tanzania,R.drawable.the_gambia,R.drawable.togo,R.drawable.tunisia,R.drawable.uganda,R.drawable.zambia,R.drawable.zimbabwe};
        final String olkeArray[]=new String[]{getString(R.string.algeria),getString(R.string.angola),getString(R.string.benin),getString(R.string.botswana),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cape_verde),getString(R.string.cameroon),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.comoros),getString(R.string.cote_dlvoire),getString(R.string.democratic_republic_of_the_congo),getString(R.string.djibouti),getString(R.string.egypt),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.ethiopia),getString(R.string.gabon),getString(R.string.ghana),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.kenya),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.mali),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mayotte),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.namibia),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.republic_of_the_congo),getString(R.string.reunion),getString(R.string.rwanda),getString(R.string.sao_tome_and_principe),getString(R.string.senegal),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.sudan),getString(R.string.swaziland),getString(R.string.tanzania),getString(R.string.the_gambia),getString(R.string.togo),getString(R.string.tunisia),getString(R.string.uganda),getString(R.string.zambia),getString(R.string.zimbabwe)};
        afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("afrikaAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        afrikaAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn1li.setVisibility(View.INVISIBLE);
                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        afrikaAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn2li.setVisibility(View.INVISIBLE);

                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        afrikaAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn3li.setVisibility(View.INVISIBLE);

                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        afrikaAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn4li.setVisibility(View.INVISIBLE);

                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        afrikaAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn5li.setVisibility(View.INVISIBLE);

                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        afrikaAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(afrikaAltiisim.getText().toString())){

                    afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn1li.setPadding(20,20,20,20);
                    afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn2li.setPadding(20,20,20,20);
                    afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn3li.setPadding(20,20,20,20);
                    afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn4li.setPadding(20,20,20,20);
                    afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn5li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    afrikaAltibtn6li.setPadding(20,20,20,20);

                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    afrikaAltibtn6li.setPadding(20,20,20,20);
                    afrikaAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("afrikaAltipuan",puan);
                    afrikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            afrikaAltibtn6li.setVisibility(View.INVISIBLE);

                            if (i==6){
                                bayraqelaveet(bayraqArray);
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }else {
                                durum=true;
                                funksiyaDovr(olkeArray);
                            }
                        }
                    },300);
                }else {
                    afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    afrikaAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        afrikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });


        funksiyaDovr(olkeArray);




    }

    private void funksiyaDovr(String[] olkeArray1) {
        while (durum){
            if (arr.get(i)==0){
                afrikaAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                afrikaAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                afrikaAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                afrikaAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                afrikaAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                afrikaAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        afrikaAltipuan=(TextView) findViewById(R.id.afrikaAltipuan);
        afrikaAltiisim=(TextView) findViewById(R.id.afrikaAltiisim);

        afrikaAltibtn1li=(LinearLayout) findViewById(R.id.afrikaAltibtn1li);
        afrikaAltibtn2li=(LinearLayout) findViewById(R.id.afrikaAltibtn2li);
        afrikaAltibtn3li=(LinearLayout) findViewById(R.id.afrikaAltibtn3li);
        afrikaAltibtn4li=(LinearLayout) findViewById(R.id.afrikaAltibtn4li);
        afrikaAltibtn5li=(LinearLayout) findViewById(R.id.afrikaAltibtn5li);
        afrikaAltibtn6li=(LinearLayout) findViewById(R.id.afrikaAltibtn6li);

        afrikaAltibtn1image=(ImageView) findViewById(R.id.afrikaAltibtn1image);
        afrikaAltibtn2image=(ImageView) findViewById(R.id.afrikaAltibtn2image);
        afrikaAltibtn3image=(ImageView) findViewById(R.id.afrikaAltibtn3image);
        afrikaAltibtn4image=(ImageView) findViewById(R.id.afrikaAltibtn4image);
        afrikaAltibtn5image=(ImageView) findViewById(R.id.afrikaAltibtn5image);
        afrikaAltibtn6image=(ImageView) findViewById(R.id.afrikaAltibtn6image);

        afrikaAltican1=(ImageView) findViewById(R.id.afrikaAltican1);
        afrikaAltican2=(ImageView) findViewById(R.id.afrikaAltican2);
        afrikaAltican3=(ImageView) findViewById(R.id.afrikaAltican3);

    }

    public void rand(int say){
        variant1=random.nextInt(say);
        variant2=random.nextInt(say);
        variant3=random.nextInt(say);
        variant4=random.nextInt(say);
        variant5=random.nextInt(say);
        variant6=random.nextInt(say);

        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
            variant1=random.nextInt(say);
            variant2=random.nextInt(say);
            variant3=random.nextInt(say);
            variant4=random.nextInt(say);
            variant5=random.nextInt(say);
            variant6=random.nextInt(say);

            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                variant1=random.nextInt(say);
                variant2=random.nextInt(say);
                variant3=random.nextInt(say);
                variant4=random.nextInt(say);
                variant5=random.nextInt(say);
                variant6=random.nextInt(say);

                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                    variant1=random.nextInt(say);
                    variant2=random.nextInt(say);
                    variant3=random.nextInt(say);
                    variant4=random.nextInt(say);
                    variant5=random.nextInt(say);
                    variant6=random.nextInt(say);

                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                        variant1=random.nextInt(say);
                        variant2=random.nextInt(say);
                        variant3=random.nextInt(say);
                        variant4=random.nextInt(say);
                        variant5=random.nextInt(say);
                        variant6=random.nextInt(say);

                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                            variant1=random.nextInt(say);
                            variant2=random.nextInt(say);
                            variant3=random.nextInt(say);
                            variant4=random.nextInt(say);
                            variant5=random.nextInt(say);
                            variant6=random.nextInt(say);

                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                variant1=random.nextInt(say);
                                variant2=random.nextInt(say);
                                variant3=random.nextInt(say);
                                variant4=random.nextInt(say);
                                variant5=random.nextInt(say);
                                variant6=random.nextInt(say);

                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                    variant1=random.nextInt(say);
                                    variant2=random.nextInt(say);
                                    variant3=random.nextInt(say);
                                    variant4=random.nextInt(say);
                                    variant5=random.nextInt(say);
                                    variant6=random.nextInt(say);

                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                        variant1=random.nextInt(say);
                                        variant2=random.nextInt(say);
                                        variant3=random.nextInt(say);
                                        variant4=random.nextInt(say);
                                        variant5=random.nextInt(say);
                                        variant6=random.nextInt(say);

                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                            variant1=random.nextInt(say);
                                            variant2=random.nextInt(say);
                                            variant3=random.nextInt(say);
                                            variant4=random.nextInt(say);
                                            variant5=random.nextInt(say);
                                            variant6=random.nextInt(say);

                                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                variant1=random.nextInt(say);
                                                variant2=random.nextInt(say);
                                                variant3=random.nextInt(say);
                                                variant4=random.nextInt(say);
                                                variant5=random.nextInt(say);
                                                variant6=random.nextInt(say);

                                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                    variant1=random.nextInt(say);
                                                    variant2=random.nextInt(say);
                                                    variant3=random.nextInt(say);
                                                    variant4=random.nextInt(say);
                                                    variant5=random.nextInt(say);
                                                    variant6=random.nextInt(say);

                                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                        variant1=random.nextInt(say);
                                                        variant2=random.nextInt(say);
                                                        variant3=random.nextInt(say);
                                                        variant4=random.nextInt(say);
                                                        variant5=random.nextInt(say);
                                                        variant6=random.nextInt(say);

                                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                            variant1=random.nextInt(say);
                                                            variant2=random.nextInt(say);
                                                            variant3=random.nextInt(say);
                                                            variant4=random.nextInt(say);
                                                            variant5=random.nextInt(say);
                                                            variant6=random.nextInt(say);

                                                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                variant1=random.nextInt(say);
                                                                variant2=random.nextInt(say);
                                                                variant3=random.nextInt(say);
                                                                variant4=random.nextInt(say);
                                                                variant5=random.nextInt(say);
                                                                variant6=random.nextInt(say);

                                                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                    variant1=random.nextInt(say);
                                                                    variant2=random.nextInt(say);
                                                                    variant3=random.nextInt(say);
                                                                    variant4=random.nextInt(say);
                                                                    variant5=random.nextInt(say);
                                                                    variant6=random.nextInt(say);

                                                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                        variant1=random.nextInt(say);
                                                                        variant2=random.nextInt(say);
                                                                        variant3=random.nextInt(say);
                                                                        variant4=random.nextInt(say);
                                                                        variant5=random.nextInt(say);
                                                                        variant6=random.nextInt(say);

                                                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                            variant1=random.nextInt(say);
                                                                            variant2=random.nextInt(say);
                                                                            variant3=random.nextInt(say);
                                                                            variant4=random.nextInt(say);
                                                                            variant5=random.nextInt(say);
                                                                            variant6=random.nextInt(say);

                                                                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                variant1=random.nextInt(say);
                                                                                variant2=random.nextInt(say);
                                                                                variant3=random.nextInt(say);
                                                                                variant4=random.nextInt(say);
                                                                                variant5=random.nextInt(say);
                                                                                variant6=random.nextInt(say);

                                                                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                    variant1=random.nextInt(say);
                                                                                    variant2=random.nextInt(say);
                                                                                    variant3=random.nextInt(say);
                                                                                    variant4=random.nextInt(say);
                                                                                    variant5=random.nextInt(say);
                                                                                    variant6=random.nextInt(say);

                                                                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                        variant1=random.nextInt(say);
                                                                                        variant2=random.nextInt(say);
                                                                                        variant3=random.nextInt(say);
                                                                                        variant4=random.nextInt(say);
                                                                                        variant5=random.nextInt(say);
                                                                                        variant6=random.nextInt(say);

                                                                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                            variant1=random.nextInt(say);
                                                                                            variant2=random.nextInt(say);
                                                                                            variant3=random.nextInt(say);
                                                                                            variant4=random.nextInt(say);
                                                                                            variant5=random.nextInt(say);
                                                                                            variant6=random.nextInt(say);

                                                                                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                variant1=random.nextInt(say);
                                                                                                variant2=random.nextInt(say);
                                                                                                variant3=random.nextInt(say);
                                                                                                variant4=random.nextInt(say);
                                                                                                variant5=random.nextInt(say);
                                                                                                variant6=random.nextInt(say);

                                                                                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                    variant1=random.nextInt(say);
                                                                                                    variant2=random.nextInt(say);
                                                                                                    variant3=random.nextInt(say);
                                                                                                    variant4=random.nextInt(say);
                                                                                                    variant5=random.nextInt(say);
                                                                                                    variant6=random.nextInt(say);

                                                                                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                        variant1=random.nextInt(say);
                                                                                                        variant2=random.nextInt(say);
                                                                                                        variant3=random.nextInt(say);
                                                                                                        variant4=random.nextInt(say);
                                                                                                        variant5=random.nextInt(say);
                                                                                                        variant6=random.nextInt(say);

                                                                                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                            variant1=random.nextInt(say);
                                                                                                            variant2=random.nextInt(say);
                                                                                                            variant3=random.nextInt(say);
                                                                                                            variant4=random.nextInt(say);
                                                                                                            variant5=random.nextInt(say);
                                                                                                            variant6=random.nextInt(say);

                                                                                                            if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                                variant1=random.nextInt(say);
                                                                                                                variant2=random.nextInt(say);
                                                                                                                variant3=random.nextInt(say);
                                                                                                                variant4=random.nextInt(say);
                                                                                                                variant5=random.nextInt(say);
                                                                                                                variant6=random.nextInt(say);

                                                                                                                if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                                    variant1=random.nextInt(say);
                                                                                                                    variant2=random.nextInt(say);
                                                                                                                    variant3=random.nextInt(say);
                                                                                                                    variant4=random.nextInt(say);
                                                                                                                    variant5=random.nextInt(say);
                                                                                                                    variant6=random.nextInt(say);

                                                                                                                    if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                                        variant1=random.nextInt(say);
                                                                                                                        variant2=random.nextInt(say);
                                                                                                                        variant3=random.nextInt(say);
                                                                                                                        variant4=random.nextInt(say);
                                                                                                                        variant5=random.nextInt(say);
                                                                                                                        variant6=random.nextInt(say);

                                                                                                                        if (variant1==variant2 || variant1==variant3 || variant1==variant4 || variant1==variant5 || variant1==variant6 || variant2==variant3 || variant2==variant4 || variant2==variant5 || variant2==variant6 || variant3==variant4 || variant3==variant5 || variant3==variant6 || variant4==variant5 || variant4==variant6 || variant5==variant6){
                                                                                                                            variant1=random.nextInt(say);
                                                                                                                            variant2=random.nextInt(say);
                                                                                                                            variant3=random.nextInt(say);
                                                                                                                            variant4=random.nextInt(say);
                                                                                                                            variant5=random.nextInt(say);
                                                                                                                            variant6=random.nextInt(say);



                                                                                                                        }

                                                                                                                    }

                                                                                                                }

                                                                                                            }

                                                                                                        }

                                                                                                    }

                                                                                                }

                                                                                            }

                                                                                        }

                                                                                    }

                                                                                }

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }



    }

    public void bayraqelaveet(int[] bayraqArray2){
        rand(sayi);
        i=0;
        afrikaAltibtn1li.setVisibility(View.VISIBLE);
        afrikaAltibtn2li.setVisibility(View.VISIBLE);
        afrikaAltibtn3li.setVisibility(View.VISIBLE);
        afrikaAltibtn4li.setVisibility(View.VISIBLE);
        afrikaAltibtn5li.setVisibility(View.VISIBLE);
        afrikaAltibtn6li.setVisibility(View.VISIBLE);

        afrikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn1li.setPadding(20,20,20,20);
        afrikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn2li.setPadding(20,20,20,20);
        afrikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn3li.setPadding(20,20,20,20);
        afrikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn4li.setPadding(20,20,20,20);
        afrikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn5li.setPadding(20,20,20,20);
        afrikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaAltibtn6li.setPadding(20,20,20,20);

        afrikaAltibtn1li.setEnabled(true);
        afrikaAltibtn2li.setEnabled(true);
        afrikaAltibtn3li.setEnabled(true);
        afrikaAltibtn4li.setEnabled(true);
        afrikaAltibtn5li.setEnabled(true);
        afrikaAltibtn6li.setEnabled(true);

        afrikaAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        afrikaAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        afrikaAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        afrikaAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        afrikaAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        afrikaAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
