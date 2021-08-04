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

public class AvustralyaAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();

    TextView avustralyaAltipuan,avustralyaAltiisim;
    LinearLayout avustralyaAltibtn1li,avustralyaAltibtn2li,avustralyaAltibtn3li,avustralyaAltibtn4li,avustralyaAltibtn5li,avustralyaAltibtn6li;
    ImageView avustralyaAltibtn1image,avustralyaAltibtn2image,avustralyaAltibtn3image,avustralyaAltibtn4image,avustralyaAltibtn5image,avustralyaAltibtn6image,avustralyaAltican1,avustralyaAltican2,avustralyaAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_alti);
        init();
        final int bayraqArray[]=new int[]{R.drawable.american_samoa,R.drawable.australia,R.drawable.cook_islands,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.french_polyensia,R.drawable.guam,R.drawable.kiribati,R.drawable.marshall_islands,R.drawable.nauru,R.drawable.new_caledonia,R.drawable.new_zealand,R.drawable.niue,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.palau,R.drawable.papua_new_guinea,R.drawable.samoa,R.drawable.solomon_islands,R.drawable.tokelau,R.drawable.tonga,R.drawable.tuvalu,R.drawable.vanuatu,R.drawable.wallis_and_futuna};
        final String olkeArray[]=new String[]{getString(R.string.american_samoa),getString(R.string.australia),getString(R.string.cook_islands),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.kiribati),getString(R.string.marshall_islands),getString(R.string.nauru),getString(R.string.new_caledonia),getString(R.string.new_zealand),getString(R.string.niue),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.palau),getString(R.string.papua_new_guinea),getString(R.string.samoa),getString(R.string.solomon_islands),getString(R.string.tokelau),getString(R.string.tonga),getString(R.string.tuvalu),getString(R.string.vanuatu),getString(R.string.wallis_and_futuna)};
        avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("avustralyaAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        avustralyaAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn1li.setVisibility(View.INVISIBLE);
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
                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        avustralyaAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn2li.setVisibility(View.INVISIBLE);

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
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avustralyaAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn3li.setVisibility(View.INVISIBLE);

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
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avustralyaAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn4li.setVisibility(View.INVISIBLE);

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
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avustralyaAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn5li.setVisibility(View.INVISIBLE);

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
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        avustralyaAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(avustralyaAltiisim.getText().toString())){

                    avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn1li.setPadding(20,20,20,20);
                    avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn2li.setPadding(20,20,20,20);
                    avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn3li.setPadding(20,20,20,20);
                    avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn4li.setPadding(20,20,20,20);
                    avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn5li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);

                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);
                    avustralyaAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("avustralyaAltipuan",puan);
                    avustralyaAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            avustralyaAltibtn6li.setVisibility(View.INVISIBLE);

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
                    avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    avustralyaAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        avustralyaAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,AvustralyaAltiResultActivity.class));
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
                avustralyaAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                avustralyaAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                avustralyaAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                avustralyaAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                avustralyaAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                avustralyaAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        avustralyaAltipuan=(TextView) findViewById(R.id.avustralyaAltipuan);
        avustralyaAltiisim=(TextView) findViewById(R.id.avustralyaAltiisim);

        avustralyaAltibtn1li=(LinearLayout) findViewById(R.id.avustralyaAltibtn1li);
        avustralyaAltibtn2li=(LinearLayout) findViewById(R.id.avustralyaAltibtn2li);
        avustralyaAltibtn3li=(LinearLayout) findViewById(R.id.avustralyaAltibtn3li);
        avustralyaAltibtn4li=(LinearLayout) findViewById(R.id.avustralyaAltibtn4li);
        avustralyaAltibtn5li=(LinearLayout) findViewById(R.id.avustralyaAltibtn5li);
        avustralyaAltibtn6li=(LinearLayout) findViewById(R.id.avustralyaAltibtn6li);

        avustralyaAltibtn1image=(ImageView) findViewById(R.id.avustralyaAltibtn1image);
        avustralyaAltibtn2image=(ImageView) findViewById(R.id.avustralyaAltibtn2image);
        avustralyaAltibtn3image=(ImageView) findViewById(R.id.avustralyaAltibtn3image);
        avustralyaAltibtn4image=(ImageView) findViewById(R.id.avustralyaAltibtn4image);
        avustralyaAltibtn5image=(ImageView) findViewById(R.id.avustralyaAltibtn5image);
        avustralyaAltibtn6image=(ImageView) findViewById(R.id.avustralyaAltibtn6image);

        avustralyaAltican1=(ImageView) findViewById(R.id.avustralyaAltican1);
        avustralyaAltican2=(ImageView) findViewById(R.id.avustralyaAltican2);
        avustralyaAltican3=(ImageView) findViewById(R.id.avustralyaAltican3);

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
        avustralyaAltibtn1li.setVisibility(View.VISIBLE);
        avustralyaAltibtn2li.setVisibility(View.VISIBLE);
        avustralyaAltibtn3li.setVisibility(View.VISIBLE);
        avustralyaAltibtn4li.setVisibility(View.VISIBLE);
        avustralyaAltibtn5li.setVisibility(View.VISIBLE);
        avustralyaAltibtn6li.setVisibility(View.VISIBLE);

        avustralyaAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn1li.setPadding(20,20,20,20);
        avustralyaAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn2li.setPadding(20,20,20,20);
        avustralyaAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn3li.setPadding(20,20,20,20);
        avustralyaAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn4li.setPadding(20,20,20,20);
        avustralyaAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn5li.setPadding(20,20,20,20);
        avustralyaAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        avustralyaAltibtn6li.setPadding(20,20,20,20);

        avustralyaAltibtn1li.setEnabled(true);
        avustralyaAltibtn2li.setEnabled(true);
        avustralyaAltibtn3li.setEnabled(true);
        avustralyaAltibtn4li.setEnabled(true);
        avustralyaAltibtn5li.setEnabled(true);
        avustralyaAltibtn6li.setEnabled(true);

        avustralyaAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        avustralyaAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        avustralyaAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        avustralyaAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        avustralyaAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        avustralyaAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
