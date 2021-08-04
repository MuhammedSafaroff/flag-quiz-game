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

public class GamerikaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView gamerikaDYpuan,gamerikaDYisim;
    ImageButton gamerikabtnyanlis,gamerikabtndogru;
    ImageView gamerikaDYresim,gamerikaDYcan1,gamerikaDYcan2,gamerikaDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_dy);
        init();
        final int bayraqArray[]=new int[]{R.drawable.argentina,R.drawable.bolivia,R.drawable.brazil,R.drawable.chile,R.drawable.colombia,R.drawable.ecuador,R.drawable.french_guiana,R.drawable.guyana,R.drawable.paraguay,R.drawable.peru,R.drawable.suriname,R.drawable.uruguay,R.drawable.venezuela};

        final String olkeArray[]=new String[]{getString(R.string.argentina),getString(R.string.bolivia),getString(R.string.brazil),getString(R.string.chile),getString(R.string.colombia),getString(R.string.ecuador),getString(R.string.french_guiana),getString(R.string.guyana),getString(R.string.paraguay),getString(R.string.peru),getString(R.string.suriname),getString(R.string.uruguay),getString(R.string.venezuela)};

        gamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            gamerikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            gamerikaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            gamerikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            gamerikaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        gamerikabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    gamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        gamerikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        gamerikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("gamerikaDYpuan",puan);
                        startActivity(new Intent(context, GamerikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            gamerikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            gamerikaDYisim.setText(olkeArray[ulkesay]);

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

        gamerikabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    gamerikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        gamerikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        gamerikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(gamerikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        gamerikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("gamerikaDYpuan",puan);
                        startActivity(new Intent(context, GamerikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            gamerikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            gamerikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            gamerikaDYisim.setText(olkeArray[ulkesay]);

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
        gamerikaDYpuan = (TextView)findViewById(R.id.gamerikaDYpuan);
        gamerikaDYisim = (TextView)findViewById(R.id.gamerikaDYisim);
        gamerikabtnyanlis = (ImageButton) findViewById(R.id.gamerikabtnyanlis);
        gamerikabtndogru = (ImageButton) findViewById(R.id.gamerikabtndogru);
        gamerikaDYresim = (ImageView) findViewById(R.id.gamerikaDYresim);
        gamerikaDYcan1 = (ImageView) findViewById(R.id.gamerikaDYcan1);
        gamerikaDYcan2 = (ImageView) findViewById(R.id.gamerikaDYcan2);
        gamerikaDYcan3 = (ImageView) findViewById(R.id.gamerikaDYcan3);
    }
}
