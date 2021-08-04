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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

public class AvropaZKActivity extends AppCompatActivity {
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
    long COUNTDOWN_IN_MILLIS=91000;
    CountDownTimer countDownTimer;
    long timeleftInMillis;
    TextView saniye,avropaZKDYpuan,avropaZKDYisim,avropaZK4B1Upuan,avropaZK4B1Uisim,avropaZK1B4Upuan,avropaZKAltipuan,avropaZKAltiisim;
    ImageView avropaZKDYcan1,avropaZKDYcan2,avropaZKDYcan3,avropaZKDYresim,avropaZK4B1Ucan1,avropaZK4B1Ucan2,
            avropaZK4B1Ucan3,avropaZK1B4Ucan1,avropaZK1B4Ucan2,avropaZK1B4Ucan3,avropaZK1B4Uresim,avropaZKAltibtn1image,avropaZKAltibtn2image,
            avropaZKAltibtn3image,avropaZKAltibtn4image,avropaZKAltibtn5image,avropaZKAltibtn6image,avropaZKAltican1,avropaZKAltican2,avropaZKAltican3;
    ImageButton avropaZKbtnyanlis,avropaZKbtndogru;
    LinearLayout avropaZKAltibtn1li,avropaZKAltibtn2li,avropaZKAltibtn3li,avropaZKAltibtn4li,avropaZKAltibtn5li,avropaZKAltibtn6li,avropaZK1B4ULinear,avropaZK4B1Ulinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int bayraqArray1[]=new int[]{R.drawable.aland_island,R.drawable.albania,R.drawable.andorra,R.drawable.armenia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.belarus,R.drawable.belgium,R.drawable.bosnia_and_herzegovina,R.drawable.bulgaria,R.drawable.croatia,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.denmark,R.drawable.england,R.drawable.estonia,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.finland,R.drawable.france,R.drawable.georgia,R.drawable.germany,R.drawable.gibraltar,R.drawable.greece,R.drawable.guernsey,R.drawable.hungary,R.drawable.iceland,R.drawable.ireland,R.drawable.isle_of_man,R.drawable.italy,R.drawable.jersey,R.drawable.kazakhstan,R.drawable.kosovo,R.drawable.latvia,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.north_macedonia,R.drawable.malta,R.drawable.moldova,R.drawable.monaco,R.drawable.montenegro,R.drawable.netherlands,R.drawable.northern_ireland,R.drawable.norway,R.drawable.poland,R.drawable.portugal,R.drawable.romania,R.drawable.russia,R.drawable.san_marino,R.drawable.scotland,R.drawable.serbia,R.drawable.slovakia,R.drawable.slovenia,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.turkey,R.drawable.ukraine,R.drawable.united_kingdom,R.drawable.vatican_city,R.drawable.wales};
        final String olkeArray1[]=new String[]{getString(R.string.aland_island),getString(R.string.albania),getString(R.string.andorra),getString(R.string.armenia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.bosnia_and_herzegovina),getString(R.string.bulgaria),getString(R.string.croatia),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.denmark),getString(R.string.england),getString(R.string.estonia),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.finland),getString(R.string.france),getString(R.string.georgia),getString(R.string.germany),getString(R.string.gibraltar),getString(R.string.greece),getString(R.string.guernsey),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.ireland),getString(R.string.isle_of_man),getString(R.string.italy),getString(R.string.jersey),getString(R.string.kazakhstan),getString(R.string.kosovo),getString(R.string.latvia),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.north_macedonia),getString(R.string.malta),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.montenegro),getString(R.string.netherlands),getString(R.string.northern_ireland),getString(R.string.norway),getString(R.string.poland),getString(R.string.portugal),getString(R.string.romania),getString(R.string.russia),getString(R.string.san_marino),getString(R.string.scotland),getString(R.string.serbia),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.spain),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.turkey),getString(R.string.ukraine),getString(R.string.united_kingdom),getString(R.string.vatican_city),getString(R.string.wales)};

        timeleftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

        funksiyaKZ(bayraqArray1,olkeArray1);







    }

    public void init(){
        avropaZKDYpuan = (TextView) findViewById(R.id.avropaZKDYpuan);
        saniye = (TextView) findViewById(R.id.saniye);
        avropaZKDYisim = (TextView) findViewById(R.id.avropaZKDYisim);
        avropaZK4B1Upuan = (TextView) findViewById(R.id.avropaZK4B1Upuan);
        avropaZK4B1Uisim = (TextView) findViewById(R.id.avropaZK4B1Uisim);
        avropaZK1B4Upuan = (TextView) findViewById(R.id.avropaZK1B4Upuan);
        avropaZKAltipuan = (TextView) findViewById(R.id.avropaZKAltipuan);
        avropaZKAltiisim = (TextView) findViewById(R.id.avropaZKAltiisim);

        avropaZKDYcan1 = (ImageView) findViewById(R.id.avropaZKDYcan1);
        avropaZKDYcan2 = (ImageView) findViewById(R.id.avropaZKDYcan2);
        avropaZKDYcan3 = (ImageView) findViewById(R.id.avropaZKDYcan3);
        avropaZKDYresim = (ImageView) findViewById(R.id.avropaZKDYresim);
        avropaZK4B1Ucan1 = (ImageView) findViewById(R.id.avropaZK4B1Ucan1);
        avropaZK4B1Ucan2 = (ImageView) findViewById(R.id.avropaZK4B1Ucan2);
        avropaZK4B1Ucan3 = (ImageView) findViewById(R.id.avropaZK4B1Ucan3);

        avropaZK1B4Ucan1 = (ImageView) findViewById(R.id.avropaZK1B4Ucan1);
        avropaZK1B4Ucan2 = (ImageView) findViewById(R.id.avropaZK1B4Ucan2);
        avropaZK1B4Ucan3 = (ImageView) findViewById(R.id.avropaZK1B4Ucan3);

        avropaZK1B4Uresim = (ImageView) findViewById(R.id.avropaZK1B4Uresim);
        avropaZKAltibtn1image = (ImageView) findViewById(R.id.avropaZKAltibtn1image);
        avropaZKAltibtn2image = (ImageView) findViewById(R.id.avropaZKAltibtn2image);
        avropaZKAltibtn3image = (ImageView) findViewById(R.id.avropaZKAltibtn3image);
        avropaZKAltibtn4image = (ImageView) findViewById(R.id.avropaZKAltibtn4image);
        avropaZKAltibtn5image = (ImageView) findViewById(R.id.avropaZKAltibtn5image);
        avropaZKAltibtn6image = (ImageView) findViewById(R.id.avropaZKAltibtn6image);

        avropaZKAltican1 = (ImageView) findViewById(R.id.avropaZKAltican1);
        avropaZKAltican2 = (ImageView) findViewById(R.id.avropaZKAltican2);
        avropaZKAltican3 = (ImageView) findViewById(R.id.avropaZKAltican3);

        avropaZKbtnyanlis = (ImageButton) findViewById(R.id.avropaZKbtnyanlis);
        avropaZKbtndogru = (ImageButton) findViewById(R.id.avropaZKbtndogru);

        avropaZKAltibtn1li = (LinearLayout) findViewById(R.id.avropaZKAltibtn1li);
        avropaZKAltibtn2li = (LinearLayout) findViewById(R.id.avropaZKAltibtn2li);
        avropaZKAltibtn3li = (LinearLayout) findViewById(R.id.avropaZKAltibtn3li);
        avropaZKAltibtn4li = (LinearLayout) findViewById(R.id.avropaZKAltibtn4li);
        avropaZKAltibtn5li = (LinearLayout) findViewById(R.id.avropaZKAltibtn5li);
        avropaZKAltibtn6li = (LinearLayout) findViewById(R.id.avropaZKAltibtn6li);
        avropaZK1B4ULinear = (LinearLayout) findViewById(R.id.avropaZK1B4ULinear);
        avropaZK4B1Ulinear = (LinearLayout) findViewById(R.id.avropaZK4B1Ulinear);
    }

    public void funksiyaKZ(final int[] bayraqArray,final String[] olkeArray){



        viewsay=random.nextInt(4);
        if (viewsay==0){
            setContentView(R.layout.activity_avropa_dy_zk);
            init();
            if (can==2){
                avropaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){
                avropaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                avropaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            avropaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

            say=random.nextInt(5);
            bayraqsay=random.nextInt(bayraqArray.length);
            ulkesay=random.nextInt(olkeArray.length);

            if (say==0 || say==1 || say==2){
                avropaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                avropaZKDYisim.setText(olkeArray[bayraqsay]);
                durum=true;
            }else {
                avropaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                avropaZKDYisim.setText(olkeArray[ulkesay]);

                if (bayraqsay==ulkesay){
                    durum=true;
                }else {
                    durum=false;
                }

            }

            avropaZKbtndogru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (durum){
                        puan++;
                        avropaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("avropaZKpuan",puan);
                            startActivity(new Intent(context, AvropaZKResultActivity.class));
                            finish();
                            overridePendingTransition(R.anim.right_in,R.anim.left_out);
                        }else{

                            funksiyaKZ(bayraqArray,olkeArray);


                        }


                    }
                }
            });

            avropaZKbtnyanlis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!durum){
                        puan++;

                        avropaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;

                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            avropaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("avropaZKpuan",puan);
                            startActivity(new Intent(context, AvropaZKResultActivity.class));
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
            setContentView(R.layout.activity_avropa_alti_zk);
            init();
            if (can==2){
                avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){

                avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropZKpuan",puan);
            arr.add(0);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            bayraqelaveet(bayraqArray);


            avropaZKAltibtn1li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant1].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn1li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn1li.setVisibility(View.INVISIBLE);
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
                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

//        btn1
            avropaZKAltibtn2li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant2].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn2li.setVisibility(View.INVISIBLE);

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
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            avropaZKAltibtn3li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant3].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler3 = new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn3li.setVisibility(View.INVISIBLE);

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
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            avropaZKAltibtn4li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant4].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                        Handler handler4 = new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn4li.setVisibility(View.INVISIBLE);

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
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            avropaZKAltibtn5li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant5].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler5 = new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn5li.setVisibility(View.INVISIBLE);

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
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            avropaZKAltibtn6li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant6].equals(avropaZKAltiisim.getText().toString())){

                        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn1li.setPadding(20,20,20,20);
                        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn2li.setPadding(20,20,20,20);
                        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn3li.setPadding(20,20,20,20);
                        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn4li.setPadding(20,20,20,20);
                        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn5li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);

                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);
                        avropaZKAltibtn6li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("avropaZKpuan",puan);
                        avropaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler6 = new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                avropaZKAltibtn6li.setVisibility(View.INVISIBLE);

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
                        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        avropaZKAltibtn6li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            avropaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,AvropaZKResultActivity.class));
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
            setContentView(R.layout.activity_avropa_1b4u_zk);
            init();
            if (can==2){
                avropaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){

                avropaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                avropaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            avropaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropaZKpuan",puan);
            esasFunk(bayraqArray,olkeArray);

            updateCountDownText();


        }


        if (viewsay==3){
            setContentView(R.layout.activity_avropa_4b1u_zk);
            init();
            if (can==2){
                avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){
                avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            avropaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropaZKpuan",puan);
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
        avropaZK1B4Uresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqolke]));



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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }

                }
            });
            avropaZK1B4ULinear.addView(btn1);


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
                dataHelper.saveDataInt("avropaZKpuan",puan);
                avropaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                btn2.setTextColor(Color.WHITE);
                btn2.setEnabled(false);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        avropaZK1B4ULinear.removeAllViews();
                        funksiyaKZ(bayraqArray,olkeArray);
                    }
                },600);




            }
        });

        avropaZK1B4ULinear.addView(btn2);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);
                            }
                        },600);
                    }

                }
            });
            avropaZK1B4ULinear.addView(btn3);

        }
    }

    public void funk4b1u(final int[] bayraqArray, final String[] olkeArray){
        rand(sayi);
        linearrand=random.nextInt(4);
        btnrand=random.nextInt(4);
        avropaZK4B1Uisim.setText(olkeArray[bayraqolke]);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler2=new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
            avropaZK4B1Ulinear.addView(lilayer1);

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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler3=new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
                avropaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                dataHelper.saveDataInt("avropaZKpuan",puan);
                libutton2_1.setEnabled(false);
                libutton2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                Handler handler7=new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        avropaZK4B1Ulinear.removeAllViews();
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler4=new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
        avropaZK4B1Ulinear.addView(lilayer2);




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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler5=new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        avropaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler6=new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaZKResultActivity.class));
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
            avropaZK4B1Ulinear.addView(lilayer3);
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
                avropaZKAltiisim.setText(olkeArray[variant1]);
            }else if (arr.get(i)==1){
                avropaZKAltiisim.setText(olkeArray[variant2]);
            }else if (arr.get(i)==2){
                avropaZKAltiisim.setText(olkeArray[variant3]);
            }else if (arr.get(i)==3){
                avropaZKAltiisim.setText(olkeArray[variant4]);
            }else if (arr.get(i)==4){
                avropaZKAltiisim.setText(olkeArray[variant5]);
            }else if (arr.get(i)==5){
                avropaZKAltiisim.setText(olkeArray[variant6]);
            }
            i++;
            durum1=false;

        }
    }

    public void bayraqelaveet(int[] bayraqArray){
        rand1(sayi);
        i=0;
        avropaZKAltibtn1li.setVisibility(View.VISIBLE);
        avropaZKAltibtn2li.setVisibility(View.VISIBLE);
        avropaZKAltibtn3li.setVisibility(View.VISIBLE);
        avropaZKAltibtn4li.setVisibility(View.VISIBLE);
        avropaZKAltibtn5li.setVisibility(View.VISIBLE);
        avropaZKAltibtn6li.setVisibility(View.VISIBLE);

        avropaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn1li.setPadding(20,20,20,20);
        avropaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn2li.setPadding(20,20,20,20);
        avropaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn3li.setPadding(20,20,20,20);
        avropaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn4li.setPadding(20,20,20,20);
        avropaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn5li.setPadding(20,20,20,20);
        avropaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaZKAltibtn6li.setPadding(20,20,20,20);

        avropaZKAltibtn1li.setEnabled(true);
        avropaZKAltibtn2li.setEnabled(true);
        avropaZKAltibtn3li.setEnabled(true);
        avropaZKAltibtn4li.setEnabled(true);
        avropaZKAltibtn5li.setEnabled(true);
        avropaZKAltibtn6li.setEnabled(true);

        avropaZKAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant1]));
        avropaZKAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
        avropaZKAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
        avropaZKAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
        avropaZKAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant5]));
        avropaZKAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant6]));

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
                startActivity(new Intent(context,AvropaZKResultActivity.class));
                finish();
            }
        }.start();

    }

}
