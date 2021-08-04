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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AvropaAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();

    TextView avropaAltipuan,avropaAltiisim;
    LinearLayout avropaAltibtn1li,avropaAltibtn2li,avropaAltibtn3li,avropaAltibtn4li,avropaAltibtn5li,avropaAltibtn6li;
    ImageView avropaAltibtn1image,avropaAltibtn2image,avropaAltibtn3image,avropaAltibtn4image,avropaAltibtn5image,avropaAltibtn6image,avropaAltican1,avropaAltican2,avropaAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_alti);
        init();
        final int bayraqArray[]=new int[]{R.drawable.aland_island,R.drawable.albania,R.drawable.andorra,R.drawable.armenia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.belarus,R.drawable.belgium,R.drawable.bosnia_and_herzegovina,R.drawable.bulgaria,R.drawable.croatia,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.denmark,R.drawable.england,R.drawable.estonia,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.finland,R.drawable.france,R.drawable.georgia,R.drawable.germany,R.drawable.gibraltar,R.drawable.greece,R.drawable.guernsey,R.drawable.hungary,R.drawable.iceland,R.drawable.ireland,R.drawable.isle_of_man,R.drawable.italy,R.drawable.jersey,R.drawable.kazakhstan,R.drawable.kosovo,R.drawable.latvia,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.north_macedonia,R.drawable.malta,R.drawable.moldova,R.drawable.monaco,R.drawable.montenegro,R.drawable.netherlands,R.drawable.northern_ireland,R.drawable.norway,R.drawable.poland,R.drawable.portugal,R.drawable.romania,R.drawable.russia,R.drawable.san_marino,R.drawable.scotland,R.drawable.serbia,R.drawable.slovakia,R.drawable.slovenia,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.turkey,R.drawable.ukraine,R.drawable.united_kingdom,R.drawable.vatican_city,R.drawable.wales};
        final String olkeArray[]=new String[]{getString(R.string.aland_island),getString(R.string.albania),getString(R.string.andorra),getString(R.string.armenia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.bosnia_and_herzegovina),getString(R.string.bulgaria),getString(R.string.croatia),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.denmark),getString(R.string.england),getString(R.string.estonia),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.finland),getString(R.string.france),getString(R.string.georgia),getString(R.string.germany),getString(R.string.gibraltar),getString(R.string.greece),getString(R.string.guernsey),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.ireland),getString(R.string.isle_of_man),getString(R.string.italy),getString(R.string.jersey),getString(R.string.kazakhstan),getString(R.string.kosovo),getString(R.string.latvia),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.north_macedonia),getString(R.string.malta),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.montenegro),getString(R.string.netherlands),getString(R.string.northern_ireland),getString(R.string.norway),getString(R.string.poland),getString(R.string.portugal),getString(R.string.romania),getString(R.string.russia),getString(R.string.san_marino),getString(R.string.scotland),getString(R.string.serbia),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.spain),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.turkey),getString(R.string.ukraine),getString(R.string.united_kingdom),getString(R.string.vatican_city),getString(R.string.wales)};
        avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("avropaAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        avropaAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn1li.setVisibility(View.INVISIBLE);
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
                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        avropaAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn2li.setVisibility(View.INVISIBLE);

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
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avropaAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn3li.setVisibility(View.INVISIBLE);

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
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avropaAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn4li.setVisibility(View.INVISIBLE);

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
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avropaAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn5li.setVisibility(View.INVISIBLE);

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
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avropaAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(avropaAltiisim.getText().toString())){

                    avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn1li.setPadding(20,20,20,20);
                    avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn2li.setPadding(20,20,20,20);
                    avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn3li.setPadding(20,20,20,20);
                    avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn4li.setPadding(20,20,20,20);
                    avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn5li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avropaAltibtn6li.setPadding(20,20,20,20);

                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avropaAltibtn6li.setPadding(20,20,20,20);
                    avropaAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avropaAltipuan",puan);
                    avropaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avropaAltibtn6li.setVisibility(View.INVISIBLE);

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
                    avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avropaAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avropaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvropaAltiResultActivity.class));
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
                avropaAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                avropaAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                avropaAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                avropaAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                avropaAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                avropaAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        avropaAltipuan=(TextView) findViewById(R.id.avropaAltipuan);
        avropaAltiisim=(TextView) findViewById(R.id.avropaAltiisim);

        avropaAltibtn1li=(LinearLayout) findViewById(R.id.avropaAltibtn1li);
        avropaAltibtn2li=(LinearLayout) findViewById(R.id.avropaAltibtn2li);
        avropaAltibtn3li=(LinearLayout) findViewById(R.id.avropaAltibtn3li);
        avropaAltibtn4li=(LinearLayout) findViewById(R.id.avropaAltibtn4li);
        avropaAltibtn5li=(LinearLayout) findViewById(R.id.avropaAltibtn5li);
        avropaAltibtn6li=(LinearLayout) findViewById(R.id.avropaAltibtn6li);

        avropaAltibtn1image=(ImageView) findViewById(R.id.avropaAltibtn1image);
        avropaAltibtn2image=(ImageView) findViewById(R.id.avropaAltibtn2image);
        avropaAltibtn3image=(ImageView) findViewById(R.id.avropaAltibtn3image);
        avropaAltibtn4image=(ImageView) findViewById(R.id.avropaAltibtn4image);
        avropaAltibtn5image=(ImageView) findViewById(R.id.avropaAltibtn5image);
        avropaAltibtn6image=(ImageView) findViewById(R.id.avropaAltibtn6image);

        avropaAltican1=(ImageView) findViewById(R.id.avropaAltican1);
        avropaAltican2=(ImageView) findViewById(R.id.avropaAltican2);
        avropaAltican3=(ImageView) findViewById(R.id.avropaAltican3);

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
        avropaAltibtn1li.setVisibility(View.VISIBLE);
        avropaAltibtn2li.setVisibility(View.VISIBLE);
        avropaAltibtn3li.setVisibility(View.VISIBLE);
        avropaAltibtn4li.setVisibility(View.VISIBLE);
        avropaAltibtn5li.setVisibility(View.VISIBLE);
        avropaAltibtn6li.setVisibility(View.VISIBLE);

        avropaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn1li.setPadding(20,20,20,20);
        avropaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn2li.setPadding(20,20,20,20);
        avropaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn3li.setPadding(20,20,20,20);
        avropaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn4li.setPadding(20,20,20,20);
        avropaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn5li.setPadding(20,20,20,20);
        avropaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avropaAltibtn6li.setPadding(20,20,20,20);

        avropaAltibtn1li.setEnabled(true);
        avropaAltibtn2li.setEnabled(true);
        avropaAltibtn3li.setEnabled(true);
        avropaAltibtn4li.setEnabled(true);
        avropaAltibtn5li.setEnabled(true);
        avropaAltibtn6li.setEnabled(true);

        avropaAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        avropaAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        avropaAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        avropaAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        avropaAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        avropaAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
