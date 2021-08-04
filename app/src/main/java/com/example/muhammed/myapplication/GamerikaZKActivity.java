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
import java.util.Random;

public class GamerikaZKActivity extends AppCompatActivity {
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
    TextView saniye,gamerikaZKDYpuan,gamerikaZKDYisim,gamerikaZK4B1Upuan,gamerikaZK4B1Uisim,gamerikaZK1B4Upuan,gamerikaZKAltipuan,gamerikaZKAltiisim;
    ImageView gamerikaZKDYcan1,gamerikaZKDYcan2,gamerikaZKDYcan3,gamerikaZKDYresim,gamerikaZK4B1Ucan1,gamerikaZK4B1Ucan2,
            gamerikaZK4B1Ucan3,gamerikaZK1B4Ucan1,gamerikaZK1B4Ucan2,gamerikaZK1B4Ucan3,gamerikaZK1B4Uresim,gamerikaZKAltibtn1image,gamerikaZKAltibtn2image,
            gamerikaZKAltibtn3image,gamerikaZKAltibtn4image,gamerikaZKAltibtn5image,gamerikaZKAltibtn6image,gamerikaZKAltican1,gamerikaZKAltican2,gamerikaZKAltican3;
    ImageButton gamerikaZKbtnyanlis,gamerikaZKbtndogru;
    LinearLayout gamerikaZKAltibtn1li,gamerikaZKAltibtn2li,gamerikaZKAltibtn3li,gamerikaZKAltibtn4li,gamerikaZKAltibtn5li,gamerikaZKAltibtn6li,gamerikaZK1B4ULinear,gamerikaZK4B1Ulinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int bayraqArray1[]=new int[]{R.drawable.argentina,R.drawable.bolivia,R.drawable.brazil,R.drawable.chile,R.drawable.colombia,R.drawable.ecuador,R.drawable.french_guiana,R.drawable.guyana,R.drawable.paraguay,R.drawable.peru,R.drawable.suriname,R.drawable.uruguay,R.drawable.venezuela};
        final String olkeArray1[]=new String[]{getString(R.string.argentina),getString(R.string.bolivia),getString(R.string.brazil),getString(R.string.chile),getString(R.string.colombia),getString(R.string.ecuador),getString(R.string.french_guiana),getString(R.string.guyana),getString(R.string.paraguay),getString(R.string.peru),getString(R.string.suriname),getString(R.string.uruguay),getString(R.string.venezuela)};

        timeleftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

        funksiyaKZ(bayraqArray1,olkeArray1);







    }

    public void init(){
        gamerikaZKDYpuan = (TextView) findViewById(R.id.gamerikaZKDYpuan);
        saniye = (TextView) findViewById(R.id.saniye);
        gamerikaZKDYisim = (TextView) findViewById(R.id.gamerikaZKDYisim);
        gamerikaZK4B1Upuan = (TextView) findViewById(R.id.gamerikaZK4B1Upuan);
        gamerikaZK4B1Uisim = (TextView) findViewById(R.id.gamerikaZK4B1Uisim);
        gamerikaZK1B4Upuan = (TextView) findViewById(R.id.gamerikaZK1B4Upuan);
        gamerikaZKAltipuan = (TextView) findViewById(R.id.gamerikaZKAltipuan);
        gamerikaZKAltiisim = (TextView) findViewById(R.id.gamerikaZKAltiisim);

        gamerikaZKDYcan1 = (ImageView) findViewById(R.id.gamerikaZKDYcan1);
        gamerikaZKDYcan2 = (ImageView) findViewById(R.id.gamerikaZKDYcan2);
        gamerikaZKDYcan3 = (ImageView) findViewById(R.id.gamerikaZKDYcan3);
        gamerikaZKDYresim = (ImageView) findViewById(R.id.gamerikaZKDYresim);
        gamerikaZK4B1Ucan1 = (ImageView) findViewById(R.id.gamerikaZK4B1Ucan1);
        gamerikaZK4B1Ucan2 = (ImageView) findViewById(R.id.gamerikaZK4B1Ucan2);
        gamerikaZK4B1Ucan3 = (ImageView) findViewById(R.id.gamerikaZK4B1Ucan3);

        gamerikaZK1B4Ucan1 = (ImageView) findViewById(R.id.gamerikaZK1B4Ucan1);
        gamerikaZK1B4Ucan2 = (ImageView) findViewById(R.id.gamerikaZK1B4Ucan2);
        gamerikaZK1B4Ucan3 = (ImageView) findViewById(R.id.gamerikaZK1B4Ucan3);

        gamerikaZK1B4Uresim = (ImageView) findViewById(R.id.gamerikaZK1B4Uresim);
        gamerikaZKAltibtn1image = (ImageView) findViewById(R.id.gamerikaZKAltibtn1image);
        gamerikaZKAltibtn2image = (ImageView) findViewById(R.id.gamerikaZKAltibtn2image);
        gamerikaZKAltibtn3image = (ImageView) findViewById(R.id.gamerikaZKAltibtn3image);
        gamerikaZKAltibtn4image = (ImageView) findViewById(R.id.gamerikaZKAltibtn4image);
        gamerikaZKAltibtn5image = (ImageView) findViewById(R.id.gamerikaZKAltibtn5image);
        gamerikaZKAltibtn6image = (ImageView) findViewById(R.id.gamerikaZKAltibtn6image);

        gamerikaZKAltican1 = (ImageView) findViewById(R.id.gamerikaZKAltican1);
        gamerikaZKAltican2 = (ImageView) findViewById(R.id.gamerikaZKAltican2);
        gamerikaZKAltican3 = (ImageView) findViewById(R.id.gamerikaZKAltican3);

        gamerikaZKbtnyanlis = (ImageButton) findViewById(R.id.gamerikaZKbtnyanlis);
        gamerikaZKbtndogru = (ImageButton) findViewById(R.id.gamerikaZKbtndogru);

        gamerikaZKAltibtn1li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn1li);
        gamerikaZKAltibtn2li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn2li);
        gamerikaZKAltibtn3li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn3li);
        gamerikaZKAltibtn4li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn4li);
        gamerikaZKAltibtn5li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn5li);
        gamerikaZKAltibtn6li = (LinearLayout) findViewById(R.id.gamerikaZKAltibtn6li);
        gamerikaZK1B4ULinear = (LinearLayout) findViewById(R.id.gamerikaZK1B4ULinear);
        gamerikaZK4B1Ulinear = (LinearLayout) findViewById(R.id.gamerikaZK4B1Ulinear);
    }

    public void funksiyaKZ(final int[] bayraqArray,final String[] olkeArray){



        viewsay=random.nextInt(4);
        if (viewsay==0){
            setContentView(R.layout.activity_gamerika_dy_zk);
            init();
            if (can==2){
                gamerikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){
                gamerikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                gamerikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            gamerikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

            say=random.nextInt(5);
            bayraqsay=random.nextInt(bayraqArray.length);
            ulkesay=random.nextInt(olkeArray.length);

            if (say==0 || say==1 || say==2){
                gamerikaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                gamerikaZKDYisim.setText(olkeArray[bayraqsay]);
                durum=true;
            }else {
                gamerikaZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                gamerikaZKDYisim.setText(olkeArray[ulkesay]);

                if (bayraqsay==ulkesay){
                    durum=true;
                }else {
                    durum=false;
                }

            }

            gamerikaZKbtndogru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (durum){
                        puan++;
                        gamerikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("gamerikaZKpuan",puan);
                            startActivity(new Intent(context, GamerikaZKResultActivity.class));
                            finish();
                            overridePendingTransition(R.anim.right_in,R.anim.left_out);
                        }else{

                            funksiyaKZ(bayraqArray,olkeArray);


                        }


                    }
                }
            });

            gamerikaZKbtnyanlis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!durum){
                        puan++;

                        gamerikaZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;

                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            gamerikaZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("gamerikaZKpuan",puan);
                            startActivity(new Intent(context, GamerikaZKResultActivity.class));
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
            setContentView(R.layout.activity_gamerika_alti_zk);
            init();
            if (can==2){
                gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){

                gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropZKpuan",puan);
            arr.add(0);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            bayraqelaveet(bayraqArray);


            gamerikaZKAltibtn1li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant1].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn1li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn1li.setVisibility(View.INVISIBLE);
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
                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

//        btn1
            gamerikaZKAltibtn2li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant2].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn2li.setVisibility(View.INVISIBLE);

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
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            gamerikaZKAltibtn3li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant3].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler3 = new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn3li.setVisibility(View.INVISIBLE);

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
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            gamerikaZKAltibtn4li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant4].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                        Handler handler4 = new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn4li.setVisibility(View.INVISIBLE);

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
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            gamerikaZKAltibtn5li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant5].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler5 = new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn5li.setVisibility(View.INVISIBLE);

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
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            gamerikaZKAltibtn6li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant6].equals(gamerikaZKAltiisim.getText().toString())){

                        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);
                        gamerikaZKAltibtn6li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("gamerikaZKpuan",puan);
                        gamerikaZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler6 = new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gamerikaZKAltibtn6li.setVisibility(View.INVISIBLE);

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
                        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        gamerikaZKAltibtn6li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            gamerikaZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
            setContentView(R.layout.activity_gamerika_1b4u_zk);
            init();
            if (can==2){
                gamerikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){

                gamerikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                gamerikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            gamerikaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("gamerikaZKpuan",puan);
            esasFunk(bayraqArray,olkeArray);

            updateCountDownText();


        }


        if (viewsay==3){
            setContentView(R.layout.activity_gamerika_4b1u_zk);
            init();
            if (can==2){
                gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){
                gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            gamerikaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("gamerikaZKpuan",puan);
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
        gamerikaZK1B4Uresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqolke]));



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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }

                }
            });
            gamerikaZK1B4ULinear.addView(btn1);


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
                dataHelper.saveDataInt("gamerikaZKpuan",puan);
                gamerikaZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                btn2.setTextColor(Color.WHITE);
                btn2.setEnabled(false);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gamerikaZK1B4ULinear.removeAllViews();
                        funksiyaKZ(bayraqArray,olkeArray);
                    }
                },600);




            }
        });

        gamerikaZK1B4ULinear.addView(btn2);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);
                            }
                        },600);
                    }

                }
            });
            gamerikaZK1B4ULinear.addView(btn3);

        }
    }

    public void funk4b1u(final int[] bayraqArray, final String[] olkeArray){
        rand(sayi);
        linearrand=random.nextInt(4);
        btnrand=random.nextInt(4);
        gamerikaZK4B1Uisim.setText(olkeArray[bayraqolke]);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler2=new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
            gamerikaZK4B1Ulinear.addView(lilayer1);

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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler3=new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
                gamerikaZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                dataHelper.saveDataInt("gamerikaZKpuan",puan);
                libutton2_1.setEnabled(false);
                libutton2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                Handler handler7=new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        gamerikaZK4B1Ulinear.removeAllViews();
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler4=new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
        gamerikaZK4B1Ulinear.addView(lilayer2);




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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler5=new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        gamerikaZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler6=new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,GamerikaZKResultActivity.class));
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
            gamerikaZK4B1Ulinear.addView(lilayer3);
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
                gamerikaZKAltiisim.setText(olkeArray[variant1]);
            }else if (arr.get(i)==1){
                gamerikaZKAltiisim.setText(olkeArray[variant2]);
            }else if (arr.get(i)==2){
                gamerikaZKAltiisim.setText(olkeArray[variant3]);
            }else if (arr.get(i)==3){
                gamerikaZKAltiisim.setText(olkeArray[variant4]);
            }else if (arr.get(i)==4){
                gamerikaZKAltiisim.setText(olkeArray[variant5]);
            }else if (arr.get(i)==5){
                gamerikaZKAltiisim.setText(olkeArray[variant6]);
            }
            i++;
            durum1=false;

        }
    }

    public void bayraqelaveet(int[] bayraqArray){
        rand1(sayi);
        i=0;
        gamerikaZKAltibtn1li.setVisibility(View.VISIBLE);
        gamerikaZKAltibtn2li.setVisibility(View.VISIBLE);
        gamerikaZKAltibtn3li.setVisibility(View.VISIBLE);
        gamerikaZKAltibtn4li.setVisibility(View.VISIBLE);
        gamerikaZKAltibtn5li.setVisibility(View.VISIBLE);
        gamerikaZKAltibtn6li.setVisibility(View.VISIBLE);

        gamerikaZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn1li.setPadding(20,20,20,20);
        gamerikaZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn2li.setPadding(20,20,20,20);
        gamerikaZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn3li.setPadding(20,20,20,20);
        gamerikaZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn4li.setPadding(20,20,20,20);
        gamerikaZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn5li.setPadding(20,20,20,20);
        gamerikaZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        gamerikaZKAltibtn6li.setPadding(20,20,20,20);

        gamerikaZKAltibtn1li.setEnabled(true);
        gamerikaZKAltibtn2li.setEnabled(true);
        gamerikaZKAltibtn3li.setEnabled(true);
        gamerikaZKAltibtn4li.setEnabled(true);
        gamerikaZKAltibtn5li.setEnabled(true);
        gamerikaZKAltibtn6li.setEnabled(true);

        gamerikaZKAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant1]));
        gamerikaZKAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
        gamerikaZKAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
        gamerikaZKAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
        gamerikaZKAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant5]));
        gamerikaZKAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant6]));

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
                startActivity(new Intent(context,GamerikaZKResultActivity.class));
                finish();
            }
        }.start();

    }

}
