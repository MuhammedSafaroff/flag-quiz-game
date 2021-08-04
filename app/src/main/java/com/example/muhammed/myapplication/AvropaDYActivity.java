package com.example.muhammed.myapplication;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AvropaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView avropaDYpuan,avropaDYisim;
    ImageButton avropabtnyanlis,avropabtndogru;
    ImageView avropaDYresim,avropaDYcan1,avropaDYcan2,avropaDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_dy);
        init();
        final int bayraqArray[]=new int[]{R.drawable.aland_island,R.drawable.albania,R.drawable.andorra,R.drawable.armenia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.belarus,R.drawable.belgium,R.drawable.bosnia_and_herzegovina,R.drawable.bulgaria,R.drawable.croatia,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.denmark,R.drawable.england,R.drawable.estonia,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.finland,R.drawable.france,R.drawable.georgia,R.drawable.germany,R.drawable.gibraltar,R.drawable.greece,R.drawable.guernsey,R.drawable.hungary,R.drawable.iceland,R.drawable.ireland,R.drawable.isle_of_man,R.drawable.italy,R.drawable.jersey,R.drawable.kazakhstan,R.drawable.kosovo,R.drawable.latvia,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.north_macedonia,R.drawable.malta,R.drawable.moldova,R.drawable.monaco,R.drawable.montenegro,R.drawable.netherlands,R.drawable.northern_ireland,R.drawable.norway,R.drawable.poland,R.drawable.portugal,R.drawable.romania,R.drawable.russia,R.drawable.san_marino,R.drawable.scotland,R.drawable.serbia,R.drawable.slovakia,R.drawable.slovenia,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.turkey,R.drawable.ukraine,R.drawable.united_kingdom,R.drawable.vatican_city,R.drawable.wales};
        final String olkeArray[]=new String[]{getString(R.string.aland_island),getString(R.string.albania),getString(R.string.andorra),getString(R.string.armenia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.bosnia_and_herzegovina),getString(R.string.bulgaria),getString(R.string.croatia),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.denmark),getString(R.string.england),getString(R.string.estonia),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.finland),getString(R.string.france),getString(R.string.georgia),getString(R.string.germany),getString(R.string.gibraltar),getString(R.string.greece),getString(R.string.guernsey),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.ireland),getString(R.string.isle_of_man),getString(R.string.italy),getString(R.string.jersey),getString(R.string.kazakhstan),getString(R.string.kosovo),getString(R.string.latvia),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.north_macedonia),getString(R.string.malta),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.montenegro),getString(R.string.netherlands),getString(R.string.northern_ireland),getString(R.string.norway),getString(R.string.poland),getString(R.string.portugal),getString(R.string.romania),getString(R.string.russia),getString(R.string.san_marino),getString(R.string.scotland),getString(R.string.serbia),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.spain),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.turkey),getString(R.string.ukraine),getString(R.string.united_kingdom),getString(R.string.vatican_city),getString(R.string.wales)};

        avropaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            avropaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            avropaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            avropaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            avropaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        avropabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    avropaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avropaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avropaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("avropaDYpuan",puan);
                        startActivity(new Intent(context, AvropaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avropaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avropaDYisim.setText(olkeArray[ulkesay]);

                            if (bayraqsay==ulkesay){
                                durum=true;
                            }else {
                                durum=false;
                            }
                        }

                    }


                }
            }
        });

        avropabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    avropaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avropaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avropaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avropaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avropaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("avropaDYpuan",puan);
                        startActivity(new Intent(context, AvropaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avropaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            avropaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avropaDYisim.setText(olkeArray[ulkesay]);

                            if (bayraqsay==ulkesay){
                                durum=true;
                            }else {
                                durum=false;
                            }
                        }

                    }

                }
            }
        });






    }

    public void init(){
        avropaDYpuan = (TextView)findViewById(R.id.avropaDYpuan);
        avropaDYisim = (TextView)findViewById(R.id.avropaDYisim);
        avropabtnyanlis = (ImageButton) findViewById(R.id.avropabtnyanlis);
        avropabtndogru = (ImageButton) findViewById(R.id.avropabtndogru);
        avropaDYresim = (ImageView) findViewById(R.id.avropaDYresim);
        avropaDYcan1 = (ImageView) findViewById(R.id.avropaDYcan1);
        avropaDYcan2 = (ImageView) findViewById(R.id.avropaDYcan2);
        avropaDYcan3 = (ImageView) findViewById(R.id.avropaDYcan3);
    }
}
