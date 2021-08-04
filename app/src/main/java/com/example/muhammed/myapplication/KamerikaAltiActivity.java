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

public class KamerikaAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();

    TextView kamerikaAltipuan,kamerikaAltiisim;
    LinearLayout kamerikaAltibtn1li,kamerikaAltibtn2li,kamerikaAltibtn3li,kamerikaAltibtn4li,kamerikaAltibtn5li,kamerikaAltibtn6li;
    ImageView kamerikaAltibtn1image,kamerikaAltibtn2image,kamerikaAltibtn3image,kamerikaAltibtn4image,kamerikaAltibtn5image,kamerikaAltibtn6image,kamerikaAltican1,kamerikaAltican2,kamerikaAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_alti);
        init();
        final int bayraqArray[]=new int[]{R.drawable.anguilla,R.drawable.antigua_and_barbuda,R.drawable.aruba,R.drawable.barbados,R.drawable.belize,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.canada,R.drawable.cayman_islands,R.drawable.costa_rica,R.drawable.cuba,R.drawable.curacao,R.drawable.dominica,R.drawable.dominican_republic,R.drawable.el_salvador,R.drawable.greenland,R.drawable.grenada,R.drawable.guadeloupe,R.drawable.guatemala,R.drawable.haiti,R.drawable.honduras,R.drawable.jamaica,R.drawable.martinique,R.drawable.mexico,R.drawable.montserrat,R.drawable.nicaragua,R.drawable.panama,R.drawable.puerto_rico,R.drawable.saint_lucia,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.saint_kitts_and_nevis,R.drawable.saint_vincent_and_the_grenadines,R.drawable.the_bahamas,R.drawable.trinidad_and_tobago,R.drawable.turks_and_caicos_islands,R.drawable.united_states,R.drawable.us_virgin_islands};
        final String olkeArray[]=new String[]{getString(R.string.anguilla),getString(R.string.antigua_and_barbuda),getString(R.string.aruba),getString(R.string.barbados),getString(R.string.belize),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.canada),getString(R.string.cayman_islands),getString(R.string.costa_rica),getString(R.string.cuba),getString(R.string.curacao),getString(R.string.dominica),getString(R.string.dominican_republic),getString(R.string.el_salvador),getString(R.string.greenland),getString(R.string.grenada),getString(R.string.guadeloupe),getString(R.string.guatemala),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.jamaica),getString(R.string.martinique),getString(R.string.mexico),getString(R.string.montserrat),getString(R.string.nicaragua),getString(R.string.panama),getString(R.string.puerto_rico),getString(R.string.saint_lucia),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.the_bahamas),getString(R.string.trinidad_and_tobago),getString(R.string.turks_and_caicos_islands),getString(R.string.united_states),getString(R.string.us_virgin_islands)};
        kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("kamerikaAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        kamerikaAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn1li.setVisibility(View.INVISIBLE);
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
                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        kamerikaAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn2li.setVisibility(View.INVISIBLE);

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
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        kamerikaAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn3li.setVisibility(View.INVISIBLE);

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
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        kamerikaAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn4li.setVisibility(View.INVISIBLE);

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
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        kamerikaAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn5li.setVisibility(View.INVISIBLE);

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
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        kamerikaAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(kamerikaAltiisim.getText().toString())){

                    kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn1li.setPadding(20,20,20,20);
                    kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn2li.setPadding(20,20,20,20);
                    kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn3li.setPadding(20,20,20,20);
                    kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn4li.setPadding(20,20,20,20);
                    kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn5li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);

                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);
                    kamerikaAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("kamerikaAltipuan",puan);
                    kamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            kamerikaAltibtn6li.setVisibility(View.INVISIBLE);

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
                    kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    kamerikaAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        kamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,KamerikaAltiResultActivity.class));
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
                kamerikaAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                kamerikaAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                kamerikaAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                kamerikaAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                kamerikaAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                kamerikaAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        kamerikaAltipuan=(TextView) findViewById(R.id.kamerikaAltipuan);
        kamerikaAltiisim=(TextView) findViewById(R.id.kamerikaAltiisim);

        kamerikaAltibtn1li=(LinearLayout) findViewById(R.id.kamerikaAltibtn1li);
        kamerikaAltibtn2li=(LinearLayout) findViewById(R.id.kamerikaAltibtn2li);
        kamerikaAltibtn3li=(LinearLayout) findViewById(R.id.kamerikaAltibtn3li);
        kamerikaAltibtn4li=(LinearLayout) findViewById(R.id.kamerikaAltibtn4li);
        kamerikaAltibtn5li=(LinearLayout) findViewById(R.id.kamerikaAltibtn5li);
        kamerikaAltibtn6li=(LinearLayout) findViewById(R.id.kamerikaAltibtn6li);

        kamerikaAltibtn1image=(ImageView) findViewById(R.id.kamerikaAltibtn1image);
        kamerikaAltibtn2image=(ImageView) findViewById(R.id.kamerikaAltibtn2image);
        kamerikaAltibtn3image=(ImageView) findViewById(R.id.kamerikaAltibtn3image);
        kamerikaAltibtn4image=(ImageView) findViewById(R.id.kamerikaAltibtn4image);
        kamerikaAltibtn5image=(ImageView) findViewById(R.id.kamerikaAltibtn5image);
        kamerikaAltibtn6image=(ImageView) findViewById(R.id.kamerikaAltibtn6image);

        kamerikaAltican1=(ImageView) findViewById(R.id.kamerikaAltican1);
        kamerikaAltican2=(ImageView) findViewById(R.id.kamerikaAltican2);
        kamerikaAltican3=(ImageView) findViewById(R.id.kamerikaAltican3);

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
        kamerikaAltibtn1li.setVisibility(View.VISIBLE);
        kamerikaAltibtn2li.setVisibility(View.VISIBLE);
        kamerikaAltibtn3li.setVisibility(View.VISIBLE);
        kamerikaAltibtn4li.setVisibility(View.VISIBLE);
        kamerikaAltibtn5li.setVisibility(View.VISIBLE);
        kamerikaAltibtn6li.setVisibility(View.VISIBLE);

        kamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn1li.setPadding(20,20,20,20);
        kamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn2li.setPadding(20,20,20,20);
        kamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn3li.setPadding(20,20,20,20);
        kamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn4li.setPadding(20,20,20,20);
        kamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn5li.setPadding(20,20,20,20);
        kamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        kamerikaAltibtn6li.setPadding(20,20,20,20);

        kamerikaAltibtn1li.setEnabled(true);
        kamerikaAltibtn2li.setEnabled(true);
        kamerikaAltibtn3li.setEnabled(true);
        kamerikaAltibtn4li.setEnabled(true);
        kamerikaAltibtn5li.setEnabled(true);
        kamerikaAltibtn6li.setEnabled(true);

        kamerikaAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        kamerikaAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        kamerikaAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        kamerikaAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        kamerikaAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        kamerikaAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
