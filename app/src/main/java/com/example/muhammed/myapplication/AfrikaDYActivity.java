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

public class AfrikaDYActivity extends AppCompatActivity {
    Context context=this;
    TextView afrikaDYpuan,afrikaDYisim;
    ImageButton afrikabtnyanlis,afrikabtndogru;
    ImageView afrikaDYresim,afrikaDYcan1,afrikaDYcan2,afrikaDYcan3;
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
        setContentView(R.layout.activity_afrika_dy);
        init();
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        final int bayraqArray[]=new int[]{R.drawable.algeria,R.drawable.angola,R.drawable.benin,R.drawable.botswana,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cape_verde,R.drawable.cameroon,R.drawable.central_african_republic,R.drawable.chad,R.drawable.comoros,R.drawable.cote_dlvoire,R.drawable.democratic_republic_of_the_congo,R.drawable.djibouti,R.drawable.egypt,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.ethiopia,R.drawable.gabon,R.drawable.ghana,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.kenya,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.madagascar,R.drawable.malawi,R.drawable.mali,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mayotte,R.drawable.morocco,R.drawable.mozambique,R.drawable.namibia,R.drawable.niger,R.drawable.nigeria,R.drawable.republic_of_the_congo,R.drawable.reunion,R.drawable.rwanda,R.drawable.sao_tome_and_principe,R.drawable.senegal,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.somalia,R.drawable.south_africa,R.drawable.sudan,R.drawable.swaziland,R.drawable.tanzania,R.drawable.the_gambia,R.drawable.togo,R.drawable.tunisia,R.drawable.uganda,R.drawable.zambia,R.drawable.zimbabwe};

        final String olkeArray[]=new String[]{getString(R.string.algeria),getString(R.string.angola),getString(R.string.benin),getString(R.string.botswana),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cape_verde),getString(R.string.cameroon),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.comoros),getString(R.string.cote_dlvoire),getString(R.string.democratic_republic_of_the_congo),getString(R.string.djibouti),getString(R.string.egypt),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.ethiopia),getString(R.string.gabon),getString(R.string.ghana),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.kenya),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.mali),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mayotte),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.namibia),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.republic_of_the_congo),getString(R.string.reunion),getString(R.string.rwanda),getString(R.string.sao_tome_and_principe),getString(R.string.senegal),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.sudan),getString(R.string.swaziland),getString(R.string.tanzania),getString(R.string.the_gambia),getString(R.string.togo),getString(R.string.tunisia),getString(R.string.uganda),getString(R.string.zambia),getString(R.string.zimbabwe)};

        afrikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            afrikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            afrikaDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            afrikaDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            afrikaDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        afrikabtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    afrikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        afrikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        afrikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("afrikaDYpuan",puan);
                        startActivity(new Intent(context, AfrikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            afrikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            afrikaDYisim.setText(olkeArray[ulkesay]);

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

        afrikabtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    afrikaDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        afrikaDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        afrikaDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(afrikaDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        afrikaDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("afrikaDYpuan",puan);
                        startActivity(new Intent(context, AfrikaDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            afrikaDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            afrikaDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            afrikaDYisim.setText(olkeArray[ulkesay]);

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
        afrikaDYpuan = (TextView)findViewById(R.id.afrikaDYpuan);
        afrikaDYisim = (TextView)findViewById(R.id.afrikaDYisim);
        afrikabtnyanlis = (ImageButton) findViewById(R.id.afrikabtnyanlis);
        afrikabtndogru = (ImageButton) findViewById(R.id.afrikabtndogru);
        afrikaDYresim = (ImageView) findViewById(R.id.afrikaDYresim);
        afrikaDYcan1 = (ImageView) findViewById(R.id.afrikaDYcan1);
        afrikaDYcan2 = (ImageView) findViewById(R.id.afrikaDYcan2);
        afrikaDYcan3 = (ImageView) findViewById(R.id.afrikaDYcan3);
    }
}
