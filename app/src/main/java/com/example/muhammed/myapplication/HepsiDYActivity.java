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

public class HepsiDYActivity extends AppCompatActivity {
    Context context=this;
    TextView hepsiDYpuan,hepsiDYisim;
    ImageButton hepsibtnyanlis,hepsibtndogru;
    ImageView hepsiDYresim,hepsiDYcan1,hepsiDYcan2,hepsiDYcan3;
    Random random=new Random();
    int bayraqsay,ulkesay,say;
    boolean durum;
    int puan=0;
    int can=3;
    DataHelper dataHelper=new DataHelper(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_dy);
        init();
        final int bayraqArray[]=new int[]{R.drawable.afghanistan,R.drawable.albania,R.drawable.algeria,R.drawable.andorra,R.drawable.angola,R.drawable.antigua_and_barbuda,R.drawable.argentina,R.drawable.armenia,R.drawable.australia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.the_bahamas,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.barbados,R.drawable.belarus,R.drawable.belgium,R.drawable.belize,R.drawable.benin,R.drawable.bhutan,R.drawable.bolivia,R.drawable.bosnia_and_herzegovina,R.drawable.botswana,R.drawable.brazil,R.drawable.brunei,R.drawable.bulgaria,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cambodia,R.drawable.cameroon,R.drawable.canada,R.drawable.cape_verde,R.drawable.central_african_republic,R.drawable.chad,R.drawable.chile,R.drawable.colombia,R.drawable.comoros,R.drawable.cook_islands,R.drawable.costa_rica,R.drawable.cote_dlvoire,R.drawable.croatia,R.drawable.cuba,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.democratic_republic_of_the_congo,R.drawable.denmark,R.drawable.djibouti,R.drawable.dominica,R.drawable.east_timor,R.drawable.ecuador,R.drawable.egypt,R.drawable.el_salvador,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.estonia,R.drawable.eswatini,R.drawable.ethiopia,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.finland,R.drawable.france,R.drawable.gabon,R.drawable.the_gambia,R.drawable.georgia,R.drawable.germany,R.drawable.ghana,R.drawable.greece,R.drawable.grenada,R.drawable.guatemala,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.guyana,R.drawable.haiti,R.drawable.honduras,R.drawable.hungary,R.drawable.iceland,R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,R.drawable.ireland,R.drawable.israel,R.drawable.italy,R.drawable.jamaica,R.drawable.japan,R.drawable.jordan,R.drawable.kazakhstan,R.drawable.kenya,R.drawable.kiribati,R.drawable.kosovo,R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.latvia,R.drawable.lebanon,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.madagascar,R.drawable.malawi,R.drawable.malaysia,R.drawable.maldives,R.drawable.mali,R.drawable.malta,R.drawable.marshall_islands,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mexico,R.drawable.moldova,R.drawable.monaco,R.drawable.mongolia,R.drawable.montenegro,R.drawable.morocco,R.drawable.mozambique,R.drawable.myanmar,R.drawable.namibia,R.drawable.nauru,R.drawable.nepal,R.drawable.netherlands,R.drawable.new_zealand,R.drawable.nicaragua,R.drawable.niger,R.drawable.nigeria,R.drawable.niue,R.drawable.north_korea,R.drawable.north_macedonia,R.drawable.norway,R.drawable.oman,R.drawable.pakistan,R.drawable.palau,R.drawable.palestine,R.drawable.panama,R.drawable.papua_new_guinea,R.drawable.paraguay,R.drawable.peoples_republic_of_china,R.drawable.peru,R.drawable.philippines,R.drawable.poland,R.drawable.portugal,R.drawable.qatar,R.drawable.republic_of_abkhazia,R.drawable.republic_of_china,R.drawable.republic_of_the_congo,R.drawable.romania,R.drawable.russia,R.drawable.rwanda,R.drawable.sahrawi_arab_democratic_republic,R.drawable.saint_kitts_and_nevis,R.drawable.saint_lucia,R.drawable.saint_vincent_and_the_grenadines,R.drawable.samoa,R.drawable.san_marino,R.drawable.sao_tome_and_principe,R.drawable.saudi_arabia,R.drawable.senegal,R.drawable.serbia,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.singapore,R.drawable.slovakia,R.drawable.slovenia,R.drawable.solomon_islands,R.drawable.somalia,R.drawable.south_africa,R.drawable.south_korea,R.drawable.south_ossetia,R.drawable.south_sudan,R.drawable.spain,R.drawable.sri_lanka,R.drawable.sudan,R.drawable.suriname,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria,R.drawable.tajikistan,R.drawable.tanzania,R.drawable.thailand,R.drawable.togo,R.drawable.tonga,R.drawable.trinidad_and_tobago,R.drawable.tunisia,R.drawable.turkey,R.drawable.turkish_republic_of_northern_cyprus,R.drawable.turkmenistan,R.drawable.tuvalu,R.drawable.uganda,R.drawable.ukraine,R.drawable.united_arab_emirates,R.drawable.united_kingdom,R.drawable.united_nations,R.drawable.united_states,R.drawable.uruguay,R.drawable.uzbekistan,R.drawable.vanuatu,R.drawable.vatican_city,R.drawable.venezuela,R.drawable.vietnam,R.drawable.yemen,R.drawable.zambia,R.drawable.zimbabwe,R.drawable.mayotte,R.drawable.reunion,R.drawable.swaziland,R.drawable.christmas_island,R.drawable.cocos_islands,R.drawable.hong_kong,R.drawable.macau,R.drawable.taiwan,R.drawable.aland_island,R.drawable.england,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.gibraltar,R.drawable.guernsey,R.drawable.isle_of_man,R.drawable.jersey,R.drawable.northern_ireland,R.drawable.scotland,R.drawable.wales,R.drawable.american_samoa,R.drawable.french_polyensia,R.drawable.guam,R.drawable.new_caledonia,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.tokelau,R.drawable.wallis_and_futuna,R.drawable.french_guiana,R.drawable.peru,R.drawable.anguilla,R.drawable.aruba,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.cayman_islands,R.drawable.curacao,R.drawable.greenland,R.drawable.guadeloupe,R.drawable.martinique,R.drawable.montserrat,R.drawable.puerto_rico,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.turks_and_caicos_islands,R.drawable.us_virgin_islands};
        final String olkeArray[]=new String[]{getString(R.string.afghanistan),getString(R.string.albania),getString(R.string.algeria),getString(R.string.andorra),getString(R.string.angola),getString(R.string.antigua_and_barbuda),getString(R.string.argentina),getString(R.string.armenia),getString(R.string.australia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.the_bahamas),getString(R.string.bahrain),getString(R.string.bangladesh),getString(R.string.barbados),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.belize),getString(R.string.benin),getString(R.string.bhutan),getString(R.string.bolivia),getString(R.string.bosnia_and_herzegovina),getString(R.string.botswana),getString(R.string.brazil),getString(R.string.brunei),getString(R.string.bulgaria),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cambodia),getString(R.string.cameroon),getString(R.string.canada),getString(R.string.cape_verde),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.chile),getString(R.string.colombia),getString(R.string.comoros),getString(R.string.cook_islands),getString(R.string.costa_rica),getString(R.string.cote_dlvoire),getString(R.string.croatia),getString(R.string.cuba),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.democratic_republic_of_the_congo),getString(R.string.denmark),getString(R.string.djibouti),getString(R.string.dominica),getString(R.string.east_timor),getString(R.string.ecuador),getString(R.string.egypt),getString(R.string.el_salvador),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.estonia),getString(R.string.eswatini),getString(R.string.ethiopia),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.finland),getString(R.string.france),getString(R.string.gabon),getString(R.string.the_gambia),getString(R.string.georgia),getString(R.string.germany),getString(R.string.ghana),getString(R.string.greece),getString(R.string.grenada),getString(R.string.guatemala),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.guyana),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.india),getString(R.string.indonesia),getString(R.string.iran),getString(R.string.iraq),getString(R.string.ireland),getString(R.string.israel),getString(R.string.italy),getString(R.string.jamaica),getString(R.string.japan),getString(R.string.jordan),getString(R.string.kazakhstan),getString(R.string.kenya),getString(R.string.kiribati),getString(R.string.kosovo),getString(R.string.kuwait),getString(R.string.kyrgyzstan),getString(R.string.laos),getString(R.string.latvia),getString(R.string.lebanon),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.malaysia),getString(R.string.maldives),getString(R.string.mali),getString(R.string.malta),getString(R.string.marshall_islands),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mexico),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.mongolia),getString(R.string.montenegro),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.myanmar),getString(R.string.namibia),getString(R.string.nauru),getString(R.string.nepal),getString(R.string.netherlands),getString(R.string.new_zealand),getString(R.string.nicaragua),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.niue),getString(R.string.north_korea),getString(R.string.north_macedonia),getString(R.string.norway),getString(R.string.oman),getString(R.string.pakistan),getString(R.string.palau),getString(R.string.palestine),getString(R.string.panama),getString(R.string.papua_new_guinea),getString(R.string.paraguay),getString(R.string.peoples_republic_of_china),getString(R.string.peru),getString(R.string.philippines),getString(R.string.poland),getString(R.string.portugal),getString(R.string.qatar),getString(R.string.republic_of_abkhazia),getString(R.string.republic_of_china),getString(R.string.republic_of_the_congo),getString(R.string.romania),getString(R.string.russia),getString(R.string.rwanda),getString(R.string.sahrawi_arab_democratic_republic),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_lucia),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.samoa),getString(R.string.san_marino),getString(R.string.sao_tome_and_principe),getString(R.string.saudi_arabia),getString(R.string.senegal),getString(R.string.serbia),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.singapore),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.solomon_islands),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.south_korea),getString(R.string.south_ossetia),getString(R.string.south_sudan),getString(R.string.spain),getString(R.string.sri_lanka),getString(R.string.sudan),getString(R.string.suriname),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.syria),getString(R.string.tajikistan),getString(R.string.tanzania),getString(R.string.thailand),getString(R.string.togo),getString(R.string.tonga),getString(R.string.trinidad_and_tobago),getString(R.string.tunisia),getString(R.string.turkey),getString(R.string.turkish_republic_of_northern_cyprus),getString(R.string.turkmenistan),getString(R.string.tuvalu),getString(R.string.uganda),getString(R.string.ukraine),getString(R.string.united_arab_emirates),getString(R.string.united_kingdom),getString(R.string.united_nations),getString(R.string.united_states),getString(R.string.uruguay),getString(R.string.uzbekistan),getString(R.string.vanuatu),getString(R.string.vatican_city),getString(R.string.venezuela),getString(R.string.vietnam),getString(R.string.yemen),getString(R.string.zambia),getString(R.string.zimbabwe),getString(R.string.mayotte),getString(R.string.reunion),getString(R.string.swaziland),getString(R.string.christmas_island),getString(R.string.cocos_islands),getString(R.string.hong_kong),getString(R.string.macau),getString(R.string.taiwan),getString(R.string.aland_island),getString(R.string.england),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.gibraltar),getString(R.string.guernsey),getString(R.string.isle_of_man),getString(R.string.jersey),getString(R.string.northern_ireland),getString(R.string.scotland),getString(R.string.wales),getString(R.string.american_samoa),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.new_caledonia),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.tokelau),getString(R.string.wallis_and_futuna),getString(R.string.french_guiana),getString(R.string.peru),getString(R.string.anguilla),getString(R.string.aruba),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.cayman_islands),getString(R.string.curacao),getString(R.string.greenland),getString(R.string.guadeloupe),getString(R.string.martinique),getString(R.string.montserrat),getString(R.string.puerto_rico),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.turks_and_caicos_islands),getString(R.string.us_virgin_islands)};

        hepsiDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

        say=random.nextInt(5);
        bayraqsay=random.nextInt(bayraqArray.length);
        ulkesay=random.nextInt(olkeArray.length);

        if (say==0 || say==1 || say==2){
            hepsiDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            hepsiDYisim.setText(olkeArray[bayraqsay]);
            durum=true;
        }else {
            hepsiDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
            hepsiDYisim.setText(olkeArray[ulkesay]);

            if (bayraqsay==ulkesay){
                durum=true;
            }else {
                durum=false;
            }

        }

        hepsibtndogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    hepsiDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        hepsiDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        hepsiDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("hepsiDYpuan",puan);
                        startActivity(new Intent(context, HepsiDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            hepsiDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            hepsiDYisim.setText(olkeArray[ulkesay]);

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

        hepsibtnyanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!durum){
                    say=random.nextInt(3);
                    bayraqsay=random.nextInt(bayraqArray.length);
                    ulkesay=random.nextInt(olkeArray.length);
                    puan++;

                    hepsiDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    if (say==1){
                        hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        hepsiDYisim.setText(olkeArray[bayraqsay]);
                        durum=true;
                    }else {
                        hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                        hepsiDYisim.setText(olkeArray[ulkesay]);

                        if (bayraqsay==ulkesay){
                            durum=true;
                        }else {
                            durum=false;
                        }
                    }

                }else {
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiDYcan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(1000);
                        objectAnimator.start();
                        hepsiDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        dataHelper.saveDataInt("hepsiDYpuan",puan);
                        startActivity(new Intent(context, HepsiDYResultActivity.class));
                        finish();
                        overridePendingTransition(R.anim.right_in,R.anim.left_out);
                    }else{

                        say=random.nextInt(3);
                        bayraqsay=random.nextInt(bayraqArray.length);
                        ulkesay=random.nextInt(olkeArray.length);

                        if (say==1){
                            hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            hepsiDYisim.setText(olkeArray[bayraqsay]);
                            durum=true;
                        }else {
                            hepsiDYresim.setImageDrawable(getResources().getDrawable(bayraqArray[bayraqsay]));
                            hepsiDYisim.setText(olkeArray[ulkesay]);

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
        hepsiDYpuan = (TextView)findViewById(R.id.hepsiDYpuan);
        hepsiDYisim = (TextView)findViewById(R.id.hepsiDYisim);
        hepsibtnyanlis = (ImageButton) findViewById(R.id.hepsibtnyanlis);
        hepsibtndogru = (ImageButton) findViewById(R.id.hepsibtndogru);
        hepsiDYresim = (ImageView) findViewById(R.id.hepsiDYresim);
        hepsiDYcan1 = (ImageView) findViewById(R.id.hepsiDYcan1);
        hepsiDYcan2 = (ImageView) findViewById(R.id.hepsiDYcan2);
        hepsiDYcan3 = (ImageView) findViewById(R.id.hepsiDYcan3);
    }
}
