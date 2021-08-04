package com.example.muhammed.myapplication;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AfrikaZKActivity extends AppCompatActivity {
    Context context=this;
    Random random = new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    boolean durum1=true;
    ArrayList<Integer> arr= new ArrayList<>();
    DataHelper dataHelper=new DataHelper(context);
    int viewsay;
    int puan=0;
    int can=3;
    int bayraqolke,variant1,variant2,variant3,variant4,variant5,variant6,forsayi,linearrand,btnrand,i;
    int sayi;
    private AdView mAdView;
    long COUNTDOWN_IN_MILLIS=91000;
    CountDownTimer countDownTimer;
    long timeleftInMillis;
    TextView saniye,afrikaZKDYpuan,afrikaZKDYisim,afrikaZK4B1Upuan,afrikaZK4B1Uisim,afrikaZK1B4Upuan,afrikaZKAltipuan,afrikaZKAltiisim;
    ImageView afrikaZKDYcan1,afrikaZKDYcan2,afrikaZKDYcan3,afrikaZKDYresim,afrikaZK4B1Ucan1,afrikaZK4B1Ucan2,
            afrikaZK4B1Ucan3,afrikaZK1B4Ucan1,afrikaZK1B4Ucan2,afrikaZK1B4Ucan3,afrikaZK1B4Uresim,afrikaZKAltibtn1image,afrikaZKAltibtn2image,
            afrikaZKAltibtn3image,afrikaZKAltibtn4image,afrikaZKAltibtn5image,afrikaZKAltibtn6image,afrikaZKAltican1,afrikaZKAltican2,afrikaZKAltican3;
    ImageButton afrikaZKbtnyanlis,afrikaZKbtndogru;
    LinearLayout afrikaZKAltibtn1li,afrikaZKAltibtn2li,afrikaZKAltibtn3li,afrikaZKAltibtn4li,afrikaZKAltibtn5li,afrikaZKAltibtn6li,afrikaZK1B4ULinear,afrikaZK4B1Ulinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int bayraqArray1[]=new int[]{R.drawable.algeria,R.drawable.angola,R.drawable.benin,R.drawable.botswana,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cape_verde,R.drawable.cameroon,R.drawable.central_african_republic,R.drawable.chad,R.drawable.comoros,R.drawable.cote_dlvoire,R.drawable.democratic_republic_of_the_congo,R.drawable.djibouti,R.drawable.egypt,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.ethiopia,R.drawable.gabon,R.drawable.ghana,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.kenya,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.madagascar,R.drawable.malawi,R.drawable.mali,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mayotte,R.drawable.morocco,R.drawable.mozambique,R.drawable.namibia,R.drawable.niger,R.drawable.nigeria,R.drawable.republic_of_the_congo,R.drawable.reunion,R.drawable.rwanda,R.drawable.sao_tome_and_principe,R.drawable.senegal,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.somalia,R.drawable.south_africa,R.drawable.sudan,R.drawable.swaziland,R.drawable.tanzania,R.drawable.the_gambia,R.drawable.togo,R.drawable.tunisia,R.drawable.uganda,R.drawable.zambia,R.drawable.zimbabwe};
        final String olkeArray1[]=new String[]{getString(R.string.algeria),getString(R.string.angola),getString(R.string.benin),getString(R.string.botswana),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cape_verde),getString(R.string.cameroon),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.comoros),getString(R.string.cote_dlvoire),getString(R.string.democratic_republic_of_the_congo),getString(R.string.djibouti),getString(R.string.egypt),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.ethiopia),getString(R.string.gabon),getString(R.string.ghana),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.kenya),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.mali),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mayotte),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.namibia),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.republic_of_the_congo),getString(R.string.reunion),getString(R.string.rwanda),getString(R.string.sao_tome_and_principe),getString(R.string.senegal),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.sudan),getString(R.string.swaziland),getString(R.string.tanzania),getString(R.string.the_gambia),getString(R.string.togo),getString(R.string.tunisia),getString(R.string.uganda),getString(R.string.zambia),getString(R.string.zimbabwe)};

        timeleftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

        funksiyaKZ(bayraqArray1,olkeArray1);







    }

    public void init(){
        afrikaZKDYpuan = (TextView) findViewById(R.id.afrikaZKDYpuan);
        saniye = (TextView) findViewById(R.id.saniye);
        afrikaZKDYisim = (TextView) findViewById(R.id.afrikaZKDYisim);
        afrikaZK4B1Upuan = (TextView) findViewById(R.id.afrikaZK4B1Upuan);
        afrikaZK4B1Uisim = (TextView) findViewById(R.id.afrikaZK4B1Uisim);
        afrikaZK1B4Upuan = (TextView) findViewById(R.id.afrikaZK1B4Upuan);
        afrikaZKAltipuan = (TextView) findViewById(R.id.afrikaZKAltipuan);
        afrikaZKAltiisim = (TextView) findViewById(R.id.afrikaZKAltiisim);

        afrikaZKDYcan1 = (ImageView) findViewById(R.id.afrikaZKDYcan1);
        afrikaZKDYcan2 = (ImageView) findViewById(R.id.afrikaZKDYcan2);
        afrikaZKDYcan3 = (ImageView) findViewById(R.id.afrikaZKDYcan3);
        afrikaZKDYresim = (ImageView) findViewById(R.id.afrikaZKDYresim);
        afrikaZK4B1Ucan1 = (ImageView) findViewById(R.id.afrikaZK4B1Ucan1);
        afrikaZK4B1Ucan2 = (ImageView) findViewById(R.id.afrikaZK4B1Ucan2);
        afrikaZK4B1Ucan3 = (ImageView) findViewById(R.id.afrikaZK4B1Ucan3);

        afrikaZK1B4Ucan1 = (ImageView) findViewById(R.id.afrikaZK1B4Ucan1);
        afrikaZK1B4Ucan2 = (ImageView) findViewById(R.id.afrikaZK1B4Ucan2);
        afrikaZK1B4Ucan3 = (ImageView) findViewById(R.id.afrikaZK1B4Ucan3);

        afrikaZK1B4Uresim = (ImageView) findViewById(R.id.afrikaZK1B4Uresim);
        afrikaZKAltibtn1image = (ImageView) findViewById(R.id.afrikaZKAltibtn1image);
        afrikaZKAltibtn2image = (ImageView) findViewById(R.id.afrikaZKAltibtn2image);
        afrikaZKAltibtn3image = (ImageView) findViewById(R.id.afrikaZKAltibtn3image);
        afrikaZKAltibtn4image = (ImageView) findViewById(R.id.afrikaZKAltibtn4image);
        afrikaZKAltibtn5image = (ImageView) findViewById(R.id.afrikaZKAltibtn5image);
        afrikaZKAltibtn6image = (ImageView) findViewById(R.id.afrikaZKAltibtn6image);

        afrikaZKAltican1 = (ImageView) findViewById(R.id.afrikaZKAltican1);
        afrikaZKAltican2 = (ImageView) findViewById(R.id.afrikaZKAltican2);
        afrikaZKAltican3 = (ImageView) findViewById(R.id.afrikaZKAltican3);

        afrikaZKbtnyanlis = (ImageButton) findViewById(R.id.afrikaZKbtnyanlis);
        afrikaZKbtndogru = (ImageButton) findViewById(R.id.afrikaZKbtndogru);

        afrikaZKAltibtn1li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn1li);
        afrikaZKAltibtn2li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn2li);
        afrikaZKAltibtn3li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn3li);
        afrikaZKAltibtn4li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn4li);
        afrikaZKAltibtn5li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn5li);
        afrikaZKAltibtn6li = (LinearLayout) findViewById(R.id.afrikaZKAltibtn6li);
        afrikaZK1B4ULinear = (LinearLayout) findViewById(R.id.afrikaZK1B4ULinear);
        afrikaZK4B1Ulinear = (LinearLayout) findViewById(R.id.afrikaZK4B1Ulinear);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void funksiyaKZ(final int[] bayraqArray,final String[] olkeArray){



        viewsay=random.nextInt(4);
        if (viewsay==0){
            setContentView(R.layout.activity_afrika_dy_zk);
            init();
            if (can==2){
                afrikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){
                afrikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                afrikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            afrikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

            say=random.nextInt(5);
            bayraqsay=random.nextInt(bayraqArray.length);
            ulkesay=random.nextInt(olkeArray.length);

            if (say==0 || say==1 || say==2){
                afrikaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                afrikaZKDYisim.setText(olkeArray[bayraqsay]);
                durum=true;
            }else {
                afrikaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                afrikaZKDYisim.setText(olkeArray[ulkesay]);

                if (bayraqsay==ulkesay){
                    durum=true;
                }else {
                    durum=false;
                }

            }

            afrikaZKbtndogru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (durum){
                        puan++;
                        afrikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("afrikaZKpuan",puan);
                            startActivity(new Intent(context, AfrikaZKResultActivity.class));
                            finish();
                            overridePendingTransition(R.anim.right_in,R.anim.left_out);
                        }else{

                            funksiyaKZ(bayraqArray,olkeArray);


                        }


                    }
                }
            });

            afrikaZKbtnyanlis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!durum){
                        puan++;

                        afrikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;

                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            afrikaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("afrikaZKpuan",puan);
                            startActivity(new Intent(context, AfrikaZKResultActivity.class));
                            finish();
                            overridePendingTransition(R.anim.right_in,R.anim.left_out);
                        }else{
                            funksiyaKZ(bayraqArray,olkeArray);


                        }

                    }
                }
            });
            updateCountDownText();

        }


        if (viewsay==1){
            setContentView(R.layout.activity_afrika_alti_zk);
            init();
            if (can==2){
                afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){

                afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropZKpuan",puan);
            arr.add(0);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            bayraqelaveet(bayraqArray);


            afrikaZKAltibtn1li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant1].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn1li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn1li.setVisibility(View.INVISIBLE);
                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);

                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

//        btn1
            afrikaZKAltibtn2li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant2].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn2li.setVisibility(View.INVISIBLE);

                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);
                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            afrikaZKAltibtn3li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant3].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler3 = new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn3li.setVisibility(View.INVISIBLE);

                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);
                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            afrikaZKAltibtn4li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant4].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                        Handler handler4 = new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn4li.setVisibility(View.INVISIBLE);

                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);
                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            afrikaZKAltibtn5li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant5].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler5 = new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn5li.setVisibility(View.INVISIBLE);

                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);
                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            afrikaZKAltibtn6li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant6].equals(afrikaZKAltiisim.getText().toString())){

                        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn1li.setPadding(20,20,20,20);
                        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn2li.setPadding(20,20,20,20);
                        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn3li.setPadding(20,20,20,20);
                        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn4li.setPadding(20,20,20,20);
                        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn5li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);

                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);
                        afrikaZKAltibtn6li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("afrikaZKpuan",puan);
                        afrikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler6 = new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                afrikaZKAltibtn6li.setVisibility(View.INVISIBLE);

                                if (i==6){
                                    durum1=true;
                                    arr.clear();
                                    funksiyaKZ(bayraqArray,olkeArray);
                                }else {
                                    durum1=true;
                                    funksiyaDovr(olkeArray);
                                }
                            }
                        },300);
                    }else {
                        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        afrikaZKAltibtn6li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            afrikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });


            funksiyaDovr(olkeArray);
            updateCountDownText();




        }


        if (viewsay==2){
            setContentView(R.layout.activity_afrika_1b4u_zk);
            init();
            if (can==2){
                afrikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){

                afrikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                afrikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            afrikaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("afrikaZKpuan",puan);
            esasFunk(bayraqArray,olkeArray);

            updateCountDownText();


        }


        if (viewsay==3){
            setContentView(R.layout.activity_afrika_4b1u_zk);
            init();
            if (can==2){
                afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){
                afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            afrikaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("afrikaZKpuan",puan);
            //bas
            funk4b1u(bayraqArray,olkeArray);
            updateCountDownText();

        }
    }

    public void rand(int say){

        bayraqolke=random.nextInt(say);
        variant2=random.nextInt(say);
        variant3=random.nextInt(say);
        variant4=random.nextInt(say);

        if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
            bayraqolke=random.nextInt(say);
            variant2=random.nextInt(say);
            variant3=random.nextInt(say);
            variant4=random.nextInt(say);

            if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                bayraqolke=random.nextInt(say);
                variant2=random.nextInt(say);
                variant3=random.nextInt(say);
                variant4=random.nextInt(say);

                if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                    bayraqolke=random.nextInt(say);
                    variant2=random.nextInt(say);
                    variant3=random.nextInt(say);
                    variant4=random.nextInt(say);

                    if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                        bayraqolke=random.nextInt(say);
                        variant2=random.nextInt(say);
                        variant3=random.nextInt(say);
                        variant4=random.nextInt(say);

                        if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                            bayraqolke=random.nextInt(say);
                            variant2=random.nextInt(say);
                            variant3=random.nextInt(say);
                            variant4=random.nextInt(say);

                            if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                bayraqolke=random.nextInt(say);
                                variant2=random.nextInt(say);
                                variant3=random.nextInt(say);
                                variant4=random.nextInt(say);

                                if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                    bayraqolke=random.nextInt(say);
                                    variant2=random.nextInt(say);
                                    variant3=random.nextInt(say);
                                    variant4=random.nextInt(say);

                                    if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                        bayraqolke=random.nextInt(say);
                                        variant2=random.nextInt(say);
                                        variant3=random.nextInt(say);
                                        variant4=random.nextInt(say);

                                        if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                            bayraqolke=random.nextInt(say);
                                            variant2=random.nextInt(say);
                                            variant3=random.nextInt(say);
                                            variant4=random.nextInt(say);

                                            if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                bayraqolke=random.nextInt(say);
                                                variant2=random.nextInt(say);
                                                variant3=random.nextInt(say);
                                                variant4=random.nextInt(say);

                                                if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                    bayraqolke=random.nextInt(say);
                                                    variant2=random.nextInt(say);
                                                    variant3=random.nextInt(say);
                                                    variant4=random.nextInt(say);

                                                    if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                        bayraqolke=random.nextInt(say);
                                                        variant2=random.nextInt(say);
                                                        variant3=random.nextInt(say);
                                                        variant4=random.nextInt(say);

                                                        if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                            bayraqolke=random.nextInt(say);
                                                            variant2=random.nextInt(say);
                                                            variant3=random.nextInt(say);
                                                            variant4=random.nextInt(say);

                                                            if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                                bayraqolke=random.nextInt(say);
                                                                variant2=random.nextInt(say);
                                                                variant3=random.nextInt(say);
                                                                variant4=random.nextInt(say);

                                                                if (bayraqolke==variant2 || bayraqolke==variant3 || bayraqolke==variant4 || variant2==variant3 || variant2==variant4 || variant3==variant4){
                                                                    bayraqolke=random.nextInt(say);
                                                                    variant2=random.nextInt(say);
                                                                    variant3=random.nextInt(say);
                                                                    variant4=random.nextInt(say);


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

    public void esasFunk(final int[] bayraqArray, final String[] olkeArray){

        rand(sayi);
        afrikaZK1B4Uresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqolke]));



        forsayi=random.nextInt(4);
        for (int i=0;i<3-forsayi;i++){

            final Button btn1 = new Button(context);
            LinearLayout.LayoutParams params1 =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params1.setMargins(0,0,0,10);
            params1.weight=1;
            btn1.setLayoutParams(params1);
            btn1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton2));
            btn1.setTextColor(Color.BLACK);
            btn1.setTextSize(16);
            btn1.setId(i*5+1); // 1 , 6,11
            int idler=btn1.getId();
            if (idler==1){
                btn1.setText(olkeArray[variant2]);
            }
            if (idler==6){
                btn1.setText(olkeArray[variant3]);
            }
            if (idler==11){
                btn1.setText(olkeArray[variant4]);
            }

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    can--;
                    btn1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    btn1.setTextColor(Color.WHITE);
                    btn1.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }

                }
            });
            afrikaZK1B4ULinear.addView(btn1);


        }
        ///esas

        final Button btn2 = new Button(context);
        LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(0,0,0,10);
        params.weight=1;
        btn2.setLayoutParams(params);
        btn2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton2));
        btn2.setTextColor(Color.BLACK);
        btn2.setTextSize(16);
        btn2.setText(olkeArray[bayraqolke]);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puan++;
                dataHelper.saveDataInt("afrikaZKpuan",puan);
                afrikaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                btn2.setTextColor(Color.WHITE);
                btn2.setEnabled(false);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        afrikaZK1B4ULinear.removeAllViews();
                        funksiyaKZ(bayraqArray,olkeArray);
                    }
                },600);




            }
        });

        afrikaZK1B4ULinear.addView(btn2);


        //esas

        for (int i=0;i<forsayi;i++){

            final Button btn3 = new Button(context);
            LinearLayout.LayoutParams params2 =new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params2.setMargins(0,0,0,10);
            params2.weight=1;
            btn3.setLayoutParams(params2);
            btn3.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton2));
            btn3.setTextColor(Color.BLACK);
            btn3.setTextSize(16);
            btn3.setId(i*6+2); // 2 , 8,14
            int idler2=btn3.getId();
            if (idler2==2){
                btn3.setText(olkeArray[variant4]);
            }
            if (idler2==8){
                btn3.setText(olkeArray[variant3]);
            }
            if (idler2==14){
                btn3.setText(olkeArray[variant2]);
            }
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    can--;
                    btn3.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    btn3.setTextColor(Color.WHITE);
                    btn3.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);
                            }
                        },600);
                    }

                }
            });
            afrikaZK1B4ULinear.addView(btn3);

        }
    }

    public void funk4b1u(final int[] bayraqArray, final String[] olkeArray){
        rand(sayi);
        linearrand=random.nextInt(4);
        btnrand=random.nextInt(4);
        afrikaZK4B1Uisim.setText(olkeArray[bayraqolke]);


        if (linearrand==0 || linearrand==2){

            LinearLayout lilayer1 = new LinearLayout(context);
            LinearLayout.LayoutParams params1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams params1_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            params1.weight=1;
            params1.setMargins(3,3,3,3);
            lilayer1.setLayoutParams(params1);
            //

            final LinearLayout libutton1_1 = new LinearLayout(context);
            libutton1_1.setLayoutParams(params1);
            libutton1_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton1_1.setClickable(true);
            libutton1_1.setPadding(10,10,10,10);
            libutton1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton1_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton1_1.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer1.addView(libutton1_1);

            ImageView img1_1=new ImageView(context);
            img1_1.setLayoutParams(params1_1);
            img1_1.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
            libutton1_1.addView(img1_1);

            //
            final LinearLayout libutton1_2 = new LinearLayout(context);
            libutton1_2.setLayoutParams(params1);
            libutton1_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton1_2.setClickable(true);
            libutton1_2.setPadding(10,10,10,10);
            libutton1_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton1_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton1_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler2=new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer1.addView(libutton1_2);

            ImageView img1_2=new ImageView(context);
            img1_2.setLayoutParams(params1_1);
            img1_2.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
            libutton1_2.addView(img1_2);


            //
            afrikaZK4B1Ulinear.addView(lilayer1);

        }
//        yukari

        LinearLayout lilayer2 = new LinearLayout(context);
        LinearLayout.LayoutParams params2= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams params2_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        params2.weight=1;
        params2.setMargins(3,3,3,3);
        lilayer2.setLayoutParams(params2);
        //

        if (btnrand==0 || btnrand==2){
            final LinearLayout libutton2_2 = new LinearLayout(context);
            libutton2_2.setLayoutParams(params2);
            libutton2_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton2_2.setClickable(true);
            libutton2_2.setPadding(10,10,10,10);
            libutton2_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton2_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton2_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler3=new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer2.addView(libutton2_2);

            ImageView img2_2=new ImageView(context);
            img2_2.setLayoutParams(params2_1);
            img2_2.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
            libutton2_2.addView(img2_2);
        }

        final LinearLayout libutton2_1 = new LinearLayout(context);
        libutton2_1.setLayoutParams(params2);
        libutton2_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
        libutton2_1.setClickable(true);
        libutton2_1.setPadding(10,10,10,10);
        libutton2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puan++;
                afrikaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                dataHelper.saveDataInt("afrikaZKpuan",puan);
                libutton2_1.setEnabled(false);
                libutton2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                Handler handler7=new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        afrikaZK4B1Ulinear.removeAllViews();
                        funksiyaKZ(bayraqArray,olkeArray);
                        //overridePendingTransition(R.anim.right_in,R.anim.left_out);

                    }
                },600);
            }
        });
        lilayer2.addView(libutton2_1);

        ImageView img2_1=new ImageView(context);
        img2_1.setLayoutParams(params2_1);
        img2_1.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqolke]));
        libutton2_1.addView(img2_1);

        if (btnrand==1 || btnrand==3){
            final LinearLayout libutton2_3 = new LinearLayout(context);
            libutton2_3.setLayoutParams(params2);
            libutton2_3.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton2_3.setClickable(true);
            libutton2_3.setPadding(10,10,10,10);
            libutton2_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton2_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton2_3.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler4=new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer2.addView(libutton2_3);

            ImageView img2_3=new ImageView(context);
            img2_3.setLayoutParams(params2_1);
            img2_3.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
            libutton2_3.addView(img2_3);
        }


        //
        afrikaZK4B1Ulinear.addView(lilayer2);




//        asagi
        if (linearrand==1 || linearrand==3){

            LinearLayout lilayer3 = new LinearLayout(context);
            LinearLayout.LayoutParams params3= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            LinearLayout.LayoutParams params3_1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
            params3.weight=1;
            params3.setMargins(3,3,3,3);
            lilayer3.setLayoutParams(params3);
            //

            final LinearLayout libutton3_1 = new LinearLayout(context);
            libutton3_1.setLayoutParams(params3);
            libutton3_1.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton3_1.setClickable(true);
            libutton3_1.setPadding(10,10,10,10);
            libutton3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton3_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton3_1.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler5=new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer3.addView(libutton3_1);

            ImageView img3_1=new ImageView(context);
            img3_1.setLayoutParams(params3_1);
            img3_1.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
            libutton3_1.addView(img3_1);

            //
            final LinearLayout libutton3_2 = new LinearLayout(context);
            libutton3_2.setLayoutParams(params3);
            libutton3_2.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.agbutton));
            libutton3_2.setClickable(true);
            libutton3_2.setPadding(10,10,10,10);
            libutton3_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    libutton3_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    can--;
                    libutton3_2.setEnabled(false);
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        afrikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler6=new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }
                }
            });
            lilayer3.addView(libutton3_2);

            ImageView img3_2=new ImageView(context);
            img3_2.setLayoutParams(params3_1);
            img3_2.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
            libutton3_2.addView(img3_2);


            //
            afrikaZK4B1Ulinear.addView(lilayer3);
        }
    }

    public void rand1(int say){
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

    private void funksiyaDovr(String[] olkeArray) {
        while (durum1){
            if (arr.get(i)==0){
                afrikaZKAltiisim.setText(olkeArray[variant1]);
            }else if (arr.get(i)==1){
                afrikaZKAltiisim.setText(olkeArray[variant2]);
            }else if (arr.get(i)==2){
                afrikaZKAltiisim.setText(olkeArray[variant3]);
            }else if (arr.get(i)==3){
                afrikaZKAltiisim.setText(olkeArray[variant4]);
            }else if (arr.get(i)==4){
                afrikaZKAltiisim.setText(olkeArray[variant5]);
            }else if (arr.get(i)==5){
                afrikaZKAltiisim.setText(olkeArray[variant6]);
            }
            i++;
            durum1=false;

        }
    }

    public void bayraqelaveet(int[] bayraqArray){
        rand1(sayi);
        i=0;
        afrikaZKAltibtn1li.setVisibility(View.VISIBLE);
        afrikaZKAltibtn2li.setVisibility(View.VISIBLE);
        afrikaZKAltibtn3li.setVisibility(View.VISIBLE);
        afrikaZKAltibtn4li.setVisibility(View.VISIBLE);
        afrikaZKAltibtn5li.setVisibility(View.VISIBLE);
        afrikaZKAltibtn6li.setVisibility(View.VISIBLE);

        afrikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn1li.setPadding(20,20,20,20);
        afrikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn2li.setPadding(20,20,20,20);
        afrikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn3li.setPadding(20,20,20,20);
        afrikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn4li.setPadding(20,20,20,20);
        afrikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn5li.setPadding(20,20,20,20);
        afrikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        afrikaZKAltibtn6li.setPadding(20,20,20,20);

        afrikaZKAltibtn1li.setEnabled(true);
        afrikaZKAltibtn2li.setEnabled(true);
        afrikaZKAltibtn3li.setEnabled(true);
        afrikaZKAltibtn4li.setEnabled(true);
        afrikaZKAltibtn5li.setEnabled(true);
        afrikaZKAltibtn6li.setEnabled(true);

        afrikaZKAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant1]));
        afrikaZKAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
        afrikaZKAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
        afrikaZKAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
        afrikaZKAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant5]));
        afrikaZKAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant6]));

        Collections.shuffle(arr);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
    }

    private void updateCountDownText() {
        int seconds = (int)(timeleftInMillis/1000);
        saniye.setText(String.valueOf(seconds));

        if (timeleftInMillis<10000){
            saniye.setTextColor(Color.RED);
        }else {
            saniye.setTextColor(Color.WHITE);
        }
    }


    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeleftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeleftInMillis=millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeleftInMillis=0;
                updateCountDownText();
                startActivity(new Intent(context,AfrikaZKResultActivity.class));
                finish();
            }
        }.start();

    }

}