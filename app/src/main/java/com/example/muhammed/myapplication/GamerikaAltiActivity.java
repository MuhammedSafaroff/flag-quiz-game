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

public class GamerikaAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();

    TextView gamerikaAltipuan,gamerikaAltiisim;
    LinearLayout gamerikaAltibtn1li,gamerikaAltibtn2li,gamerikaAltibtn3li,gamerikaAltibtn4li,gamerikaAltibtn5li,gamerikaAltibtn6li;
    ImageView gamerikaAltibtn1image,gamerikaAltibtn2image,gamerikaAltibtn3image,gamerikaAltibtn4image,gamerikaAltibtn5image,gamerikaAltibtn6image,gamerikaAltican1,gamerikaAltican2,gamerikaAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_alti);
        init();
        final int bayraqArray[]=new int[]{R.drawable.argentina,R.drawable.bolivia,R.drawable.brazil,R.drawable.chile,R.drawable.colombia,R.drawable.ecuador,R.drawable.french_guiana,R.drawable.guyana,R.drawable.paraguay,R.drawable.peru,R.drawable.suriname,R.drawable.uruguay,R.drawable.venezuela};
        final String olkeArray[]=new String[]{getString(R.string.argentina),getString(R.string.bolivia),getString(R.string.brazil),getString(R.string.chile),getString(R.string.colombia),getString(R.string.ecuador),getString(R.string.french_guiana),getString(R.string.guyana),getString(R.string.paraguay),getString(R.string.peru),getString(R.string.suriname),getString(R.string.uruguay),getString(R.string.venezuela)};
        gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("gamerikaAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        gamerikaAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn1li.setVisibility(View.INVISIBLE);
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
                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        gamerikaAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn2li.setVisibility(View.INVISIBLE);

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
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        gamerikaAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn3li.setVisibility(View.INVISIBLE);

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
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        gamerikaAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn4li.setVisibility(View.INVISIBLE);

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
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        gamerikaAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn5li.setVisibility(View.INVISIBLE);

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
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        gamerikaAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(gamerikaAltiisim.getText().toString())){

                    gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn1li.setPadding(20,20,20,20);
                    gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn2li.setPadding(20,20,20,20);
                    gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn3li.setPadding(20,20,20,20);
                    gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn4li.setPadding(20,20,20,20);
                    gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn5li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);

                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);
                    gamerikaAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("gamerikaAltipuan",puan);
                    gamerikaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gamerikaAltibtn6li.setVisibility(View.INVISIBLE);

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
                    gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    gamerikaAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        gamerikaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaAltiResultActivity.class));
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
                gamerikaAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                gamerikaAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                gamerikaAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                gamerikaAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                gamerikaAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                gamerikaAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        gamerikaAltipuan=(TextView) findViewById(R.id.gamerikaAltipuan);
        gamerikaAltiisim=(TextView) findViewById(R.id.gamerikaAltiisim);

        gamerikaAltibtn1li=(LinearLayout) findViewById(R.id.gamerikaAltibtn1li);
        gamerikaAltibtn2li=(LinearLayout) findViewById(R.id.gamerikaAltibtn2li);
        gamerikaAltibtn3li=(LinearLayout) findViewById(R.id.gamerikaAltibtn3li);
        gamerikaAltibtn4li=(LinearLayout) findViewById(R.id.gamerikaAltibtn4li);
        gamerikaAltibtn5li=(LinearLayout) findViewById(R.id.gamerikaAltibtn5li);
        gamerikaAltibtn6li=(LinearLayout) findViewById(R.id.gamerikaAltibtn6li);

        gamerikaAltibtn1image=(ImageView) findViewById(R.id.gamerikaAltibtn1image);
        gamerikaAltibtn2image=(ImageView) findViewById(R.id.gamerikaAltibtn2image);
        gamerikaAltibtn3image=(ImageView) findViewById(R.id.gamerikaAltibtn3image);
        gamerikaAltibtn4image=(ImageView) findViewById(R.id.gamerikaAltibtn4image);
        gamerikaAltibtn5image=(ImageView) findViewById(R.id.gamerikaAltibtn5image);
        gamerikaAltibtn6image=(ImageView) findViewById(R.id.gamerikaAltibtn6image);

        gamerikaAltican1=(ImageView) findViewById(R.id.gamerikaAltican1);
        gamerikaAltican2=(ImageView) findViewById(R.id.gamerikaAltican2);
        gamerikaAltican3=(ImageView) findViewById(R.id.gamerikaAltican3);

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
        gamerikaAltibtn1li.setVisibility(View.VISIBLE);
        gamerikaAltibtn2li.setVisibility(View.VISIBLE);
        gamerikaAltibtn3li.setVisibility(View.VISIBLE);
        gamerikaAltibtn4li.setVisibility(View.VISIBLE);
        gamerikaAltibtn5li.setVisibility(View.VISIBLE);
        gamerikaAltibtn6li.setVisibility(View.VISIBLE);

        gamerikaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn1li.setPadding(20,20,20,20);
        gamerikaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn2li.setPadding(20,20,20,20);
        gamerikaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn3li.setPadding(20,20,20,20);
        gamerikaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn4li.setPadding(20,20,20,20);
        gamerikaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn5li.setPadding(20,20,20,20);
        gamerikaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaAltibtn6li.setPadding(20,20,20,20);

        gamerikaAltibtn1li.setEnabled(true);
        gamerikaAltibtn2li.setEnabled(true);
        gamerikaAltibtn3li.setEnabled(true);
        gamerikaAltibtn4li.setEnabled(true);
        gamerikaAltibtn5li.setEnabled(true);
        gamerikaAltibtn6li.setEnabled(true);

        gamerikaAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        gamerikaAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        gamerikaAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        gamerikaAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        gamerikaAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        gamerikaAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
