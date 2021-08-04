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

public class KamerikaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView kamerikaDYpuan,kamerikaDYisim;
    ImageButton kamerikabtnyanlis,kamerikabtndogru;
    ImageView kamerikaDYresim,kamerikaDYcan1,kamerikaDYcan2,kamerikaDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_dy);
        init();
        final int bayraqArray[]=new int[]{R.drawable.anguilla,R.drawable.antigua_and_barbuda,R.drawable.aruba,R.drawable.barbados,R.drawable.belize,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.canada,R.drawable.cayman_islands,R.drawable.costa_rica,R.drawable.cuba,R.drawable.curacao,R.drawable.dominica,R.drawable.dominican_republic,R.drawable.el_salvador,R.drawable.greenland,R.drawable.grenada,R.drawable.guadeloupe,R.drawable.guatemala,R.drawable.haiti,R.drawable.honduras,R.drawable.jamaica,R.drawable.martinique,R.drawable.mexico,R.drawable.montserrat,R.drawable.nicaragua,R.drawable.panama,R.drawable.puerto_rico,R.drawable.saint_lucia,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.saint_kitts_and_nevis,R.drawable.saint_vincent_and_the_grenadines,R.drawable.the_bahamas,R.drawable.trinidad_and_tobago,R.drawable.turks_and_caicos_islands,R.drawable.united_states,R.drawable.us_virgin_islands};

        final String olkeArray[]=new String[]{getString(R.string.anguilla),getString(R.string.antigua_and_barbuda),getString(R.string.aruba),getString(R.string.barbados),getString(R.string.belize),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.canada),getString(R.string.cayman_islands),getString(R.string.costa_rica),getString(R.string.cuba),getString(R.string.curacao),getString(R.string.dominica),getString(R.string.dominican_republic),getString(R.string.el_salvador),getString(R.string.greenland),getString(R.string.grenada),getString(R.string.guadeloupe),getString(R.string.guatemala),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.jamaica),getString(R.string.martinique),getString(R.string.mexico),getString(R.string.montserrat),getString(R.string.nicaragua),getString(R.string.panama),getString(R.string.puerto_rico),getString(R.string.saint_lucia),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.the_bahamas),getString(R.string.trinidad_and_tobago),getString(R.string.turks_and_caicos_islands),getString(R.string.united_states),getString(R.string.us_virgin_islands)};

        kamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            kamerikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            kamerikaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            kamerikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            kamerikaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        kamerikabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    kamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        kamerikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        kamerikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("kamerikaDYpuan",puan);
                        startActivity(new Intent(context, KamerikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            kamerikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            kamerikaDYisim.setText(olkeArray[ulkesay]);

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

        kamerikabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    kamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        kamerikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        kamerikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(kamerikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        kamerikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("kamerikaDYpuan",puan);
                        startActivity(new Intent(context, KamerikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            kamerikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            kamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            kamerikaDYisim.setText(olkeArray[ulkesay]);

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
        kamerikaDYpuan = (TextView)findViewById(R.id.kamerikaDYpuan);
        kamerikaDYisim = (TextView)findViewById(R.id.kamerikaDYisim);
        kamerikabtnyanlis = (ImageButton) findViewById(R.id.kamerikabtnyanlis);
        kamerikabtndogru = (ImageButton) findViewById(R.id.kamerikabtndogru);
        kamerikaDYresim = (ImageView) findViewById(R.id.kamerikaDYresim);
        kamerikaDYcan1 = (ImageView) findViewById(R.id.kamerikaDYcan1);
        kamerikaDYcan2 = (ImageView) findViewById(R.id.kamerikaDYcan2);
        kamerikaDYcan3 = (ImageView) findViewById(R.id.kamerikaDYcan3);
    }
}
