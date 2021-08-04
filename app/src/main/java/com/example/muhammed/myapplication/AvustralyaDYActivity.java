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

public class AvustralyaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView avustralyaDYpuan,avustralyaDYisim;
    ImageButton avustralyabtnyanlis,avustralyabtndogru;
    ImageView avustralyaDYresim,avustralyaDYcan1,avustralyaDYcan2,avustralyaDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_dy);
        init();
        final int bayraqArray[]=new int[]{R.drawable.american_samoa,R.drawable.australia,R.drawable.cook_islands,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.french_polyensia,R.drawable.guam,R.drawable.kiribati,R.drawable.marshall_islands,R.drawable.nauru,R.drawable.new_caledonia,R.drawable.new_zealand,R.drawable.niue,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.palau,R.drawable.papua_new_guinea,R.drawable.samoa,R.drawable.solomon_islands,R.drawable.tokelau,R.drawable.tonga,R.drawable.tuvalu,R.drawable.vanuatu,R.drawable.wallis_and_futuna};

        final String olkeArray[]=new String[]{getString(R.string.american_samoa),getString(R.string.australia),getString(R.string.cook_islands),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.kiribati),getString(R.string.marshall_islands),getString(R.string.nauru),getString(R.string.new_caledonia),getString(R.string.new_zealand),getString(R.string.niue),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.palau),getString(R.string.papua_new_guinea),getString(R.string.samoa),getString(R.string.solomon_islands),getString(R.string.tokelau),getString(R.string.tonga),getString(R.string.tuvalu),getString(R.string.vanuatu),getString(R.string.wallis_and_futuna)};

        avustralyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            avustralyaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            avustralyaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            avustralyaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            avustralyaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        avustralyabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    avustralyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avustralyaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avustralyaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("avustralyaDYpuan",puan);
                        startActivity(new Intent(context, AvustralyaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avustralyaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avustralyaDYisim.setText(olkeArray[ulkesay]);

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

        avustralyabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    avustralyaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avustralyaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        avustralyaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(avustralyaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        avustralyaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("avustralyaDYpuan",puan);
                        startActivity(new Intent(context, AvustralyaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avustralyaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            avustralyaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            avustralyaDYisim.setText(olkeArray[ulkesay]);

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
        avustralyaDYpuan = (TextView)findViewById(R.id.avustralyaDYpuan);
        avustralyaDYisim = (TextView)findViewById(R.id.avustralyaDYisim);
        avustralyabtnyanlis = (ImageButton) findViewById(R.id.avustralyabtnyanlis);
        avustralyabtndogru = (ImageButton) findViewById(R.id.avustralyabtndogru);
        avustralyaDYresim = (ImageView) findViewById(R.id.avustralyaDYresim);
        avustralyaDYcan1 = (ImageView) findViewById(R.id.avustralyaDYcan1);
        avustralyaDYcan2 = (ImageView) findViewById(R.id.avustralyaDYcan2);
        avustralyaDYcan3 = (ImageView) findViewById(R.id.avustralyaDYcan3);
    }
}
