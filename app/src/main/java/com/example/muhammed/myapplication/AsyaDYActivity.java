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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class AsyaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView asyaDYpuan,asyaDYisim;
    ImageButton asyabtnyanlis,asyabtndogru;
    ImageView asyaDYresim,asyaDYcan1,asyaDYcan2,asyaDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_dy);
        init();
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final int bayraqArray[]=new int[]{R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.brunei,R.drawable.cambodia,R.drawable.republic_of_china,R.drawable.christmas_island,R.drawable.cocos_islands,R.drawable.georgia,R.drawable.hong_kong,R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,R.drawable.israel,R.drawable.japan,R.drawable.jordan,R.drawable.kazakhstan,R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.lebanon,R.drawable.macau,R.drawable.malaysia,R.drawable.maldives,R.drawable.mongolia,R.drawable.myanmar,R.drawable.nepal,R.drawable.north_korea,R.drawable.oman,R.drawable.pakistan,R.drawable.philippines,R.drawable.qatar,R.drawable.russia,R.drawable.saudi_arabia,R.drawable.singapore,R.drawable.south_korea,R.drawable.sri_lanka,R.drawable.palestine,R.drawable.syria,R.drawable.taiwan,R.drawable.tajikistan,R.drawable.thailand,R.drawable.east_timor,R.drawable.turkey,R.drawable.turkmenistan,R.drawable.united_arab_emirates,R.drawable.uzbekistan,R.drawable.vietnam,R.drawable.yemen};

        final String olkeArray[]=new String[]{getString(R.string.afghanistan),getString(R.string.armenia),getString(R.string.azerbaijan),getString(R.string.bahrain),getString(R.string.bangladesh),getString(R.string.bhutan),getString(R.string.brunei),getString(R.string.cambodia),getString(R.string.republic_of_china),getString(R.string.christmas_island),getString(R.string.cocos_islands),getString(R.string.georgia),getString(R.string.hong_kong),getString(R.string.india),getString(R.string.indonesia),getString(R.string.iran),getString(R.string.iraq),getString(R.string.israel),getString(R.string.japan),getString(R.string.jordan),getString(R.string.kazakhstan),getString(R.string.kuwait),getString(R.string.kyrgyzstan),getString(R.string.laos),getString(R.string.lebanon),getString(R.string.macau),getString(R.string.malaysia),getString(R.string.maldives),getString(R.string.mongolia),getString(R.string.myanmar),getString(R.string.nepal),getString(R.string.north_korea),getString(R.string.oman),getString(R.string.pakistan),getString(R.string.philippines),getString(R.string.qatar),getString(R.string.russia),getString(R.string.saudi_arabia),getString(R.string.singapore),getString(R.string.south_korea),getString(R.string.sri_lanka),getString(R.string.palestine),getString(R.string.syria),getString(R.string.taiwan),getString(R.string.tajikistan),getString(R.string.thailand),getString(R.string.east_timor),getString(R.string.turkey),getString(R.string.turkmenistan),getString(R.string.united_arab_emirates),getString(R.string.uzbekistan),getString(R.string.vietnam),getString(R.string.yemen)};

        asyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            asyaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            asyaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            asyaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            asyaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        asyabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    asyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        asyaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        asyaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("asyaDYpuan",puan);
                        startActivity(new Intent(context, AsyaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            asyaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            asyaDYisim.setText(olkeArray[ulkesay]);

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

        asyabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    asyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        asyaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        asyaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(asyaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        asyaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("asyaDYpuan",puan);
                        startActivity(new Intent(context, AsyaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            asyaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            asyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            asyaDYisim.setText(olkeArray[ulkesay]);

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
        asyaDYpuan = (TextView)findViewById(R.id.asyaDYpuan);
        asyaDYisim = (TextView)findViewById(R.id.asyaDYisim);
        asyabtnyanlis = (ImageButton) findViewById(R.id.asyabtnyanlis);
        asyabtndogru = (ImageButton) findViewById(R.id.asyabtndogru);
        asyaDYresim = (ImageView) findViewById(R.id.asyaDYresim);
        asyaDYcan1 = (ImageView) findViewById(R.id.asyaDYcan1);
        asyaDYcan2 = (ImageView) findViewById(R.id.asyaDYcan2);
        asyaDYcan3 = (ImageView) findViewById(R.id.asyaDYcan3);
    }
}
