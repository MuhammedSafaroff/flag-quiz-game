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

public class HepsiAltiActivity extends AppCompatActivity {
    Context context=this;
    DataHelper dataHelper=new DataHelper(context);
    Random random=new Random();
    int can=3;
    int puan=0;
    int i;
    boolean durum=true;
    int variant1,variant2,variant3,variant4,variant5,variant6,sayi;
    ArrayList<Integer> arr= new ArrayList<>();

    TextView hepsiAltipuan,hepsiAltiisim;
    LinearLayout hepsiAltibtn1li,hepsiAltibtn2li,hepsiAltibtn3li,hepsiAltibtn4li,hepsiAltibtn5li,hepsiAltibtn6li;
    ImageView hepsiAltibtn1image,hepsiAltibtn2image,hepsiAltibtn3image,hepsiAltibtn4image,hepsiAltibtn5image,hepsiAltibtn6image,hepsiAltican1,hepsiAltican2,hepsiAltican3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepsi_alti);
        init();
        final int bayraqArray[]=new int[]{R.drawable.afghanistan,R.drawable.albania,R.drawable.algeria,R.drawable.andorra,R.drawable.angola,R.drawable.antigua_and_barbuda,R.drawable.argentina,R.drawable.armenia,R.drawable.australia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.the_bahamas,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.barbados,R.drawable.belarus,R.drawable.belgium,R.drawable.belize,R.drawable.benin,R.drawable.bhutan,R.drawable.bolivia,R.drawable.bosnia_and_herzegovina,R.drawable.botswana,R.drawable.brazil,R.drawable.brunei,R.drawable.bulgaria,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cambodia,R.drawable.cameroon,R.drawable.canada,R.drawable.cape_verde,R.drawable.central_african_republic,R.drawable.chad,R.drawable.chile,R.drawable.colombia,R.drawable.comoros,R.drawable.cook_islands,R.drawable.costa_rica,R.drawable.cote_dlvoire,R.drawable.croatia,R.drawable.cuba,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.democratic_republic_of_the_congo,R.drawable.denmark,R.drawable.djibouti,R.drawable.dominica,R.drawable.east_timor,R.drawable.ecuador,R.drawable.egypt,R.drawable.el_salvador,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.estonia,R.drawable.eswatini,R.drawable.ethiopia,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.finland,R.drawable.france,R.drawable.gabon,R.drawable.the_gambia,R.drawable.georgia,R.drawable.germany,R.drawable.ghana,R.drawable.greece,R.drawable.grenada,R.drawable.guatemala,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.guyana,R.drawable.haiti,R.drawable.honduras,R.drawable.hungary,R.drawable.iceland,R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,R.drawable.ireland,R.drawable.israel,R.drawable.italy,R.drawable.jamaica,R.drawable.japan,R.drawable.jordan,R.drawable.kazakhstan,R.drawable.kenya,R.drawable.kiribati,R.drawable.kosovo,R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.latvia,R.drawable.lebanon,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.madagascar,R.drawable.malawi,R.drawable.malaysia,R.drawable.maldives,R.drawable.mali,R.drawable.malta,R.drawable.marshall_islands,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mexico,R.drawable.moldova,R.drawable.monaco,R.drawable.mongolia,R.drawable.montenegro,R.drawable.morocco,R.drawable.mozambique,R.drawable.myanmar,R.drawable.namibia,R.drawable.nauru,R.drawable.nepal,R.drawable.netherlands,R.drawable.new_zealand,R.drawable.nicaragua,R.drawable.niger,R.drawable.nigeria,R.drawable.niue,R.drawable.north_korea,R.drawable.north_macedonia,R.drawable.norway,R.drawable.oman,R.drawable.pakistan,R.drawable.palau,R.drawable.palestine,R.drawable.panama,R.drawable.papua_new_guinea,R.drawable.paraguay,R.drawable.peoples_republic_of_china,R.drawable.peru,R.drawable.philippines,R.drawable.poland,R.drawable.portugal,R.drawable.qatar,R.drawable.republic_of_abkhazia,R.drawable.republic_of_china,R.drawable.republic_of_the_congo,R.drawable.romania,R.drawable.russia,R.drawable.rwanda,R.drawable.sahrawi_arab_democratic_republic,R.drawable.saint_kitts_and_nevis,R.drawable.saint_lucia,R.drawable.saint_vincent_and_the_grenadines,R.drawable.samoa,R.drawable.san_marino,R.drawable.sao_tome_and_principe,R.drawable.saudi_arabia,R.drawable.senegal,R.drawable.serbia,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.singapore,R.drawable.slovakia,R.drawable.slovenia,R.drawable.solomon_islands,R.drawable.somalia,R.drawable.south_africa,R.drawable.south_korea,R.drawable.south_ossetia,R.drawable.south_sudan,R.drawable.spain,R.drawable.sri_lanka,R.drawable.sudan,R.drawable.suriname,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria,R.drawable.tajikistan,R.drawable.tanzania,R.drawable.thailand,R.drawable.togo,R.drawable.tonga,R.drawable.trinidad_and_tobago,R.drawable.tunisia,R.drawable.turkey,R.drawable.turkish_republic_of_northern_cyprus,R.drawable.turkmenistan,R.drawable.tuvalu,R.drawable.uganda,R.drawable.ukraine,R.drawable.united_arab_emirates,R.drawable.united_kingdom,R.drawable.united_nations,R.drawable.united_states,R.drawable.uruguay,R.drawable.uzbekistan,R.drawable.vanuatu,R.drawable.vatican_city,R.drawable.venezuela,R.drawable.vietnam,R.drawable.yemen,R.drawable.zambia,R.drawable.zimbabwe,R.drawable.mayotte,R.drawable.reunion,R.drawable.swaziland,R.drawable.christmas_island,R.drawable.cocos_islands,R.drawable.hong_kong,R.drawable.macau,R.drawable.taiwan,R.drawable.aland_island,R.drawable.england,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.gibraltar,R.drawable.guernsey,R.drawable.isle_of_man,R.drawable.jersey,R.drawable.northern_ireland,R.drawable.scotland,R.drawable.wales,R.drawable.american_samoa,R.drawable.french_polyensia,R.drawable.guam,R.drawable.new_caledonia,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.tokelau,R.drawable.wallis_and_futuna,R.drawable.french_guiana,R.drawable.peru,R.drawable.anguilla,R.drawable.aruba,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.cayman_islands,R.drawable.curacao,R.drawable.greenland,R.drawable.guadeloupe,R.drawable.martinique,R.drawable.montserrat,R.drawable.puerto_rico,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.turks_and_caicos_islands,R.drawable.us_virgin_islands};
        final String olkeArray[]=new String[]{getString(R.string.afghanistan),getString(R.string.albania),getString(R.string.algeria),getString(R.string.andorra),getString(R.string.angola),getString(R.string.antigua_and_barbuda),getString(R.string.argentina),getString(R.string.armenia),getString(R.string.australia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.the_bahamas),getString(R.string.bahrain),getString(R.string.bangladesh),getString(R.string.barbados),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.belize),getString(R.string.benin),getString(R.string.bhutan),getString(R.string.bolivia),getString(R.string.bosnia_and_herzegovina),getString(R.string.botswana),getString(R.string.brazil),getString(R.string.brunei),getString(R.string.bulgaria),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cambodia),getString(R.string.cameroon),getString(R.string.canada),getString(R.string.cape_verde),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.chile),getString(R.string.colombia),getString(R.string.comoros),getString(R.string.cook_islands),getString(R.string.costa_rica),getString(R.string.cote_dlvoire),getString(R.string.croatia),getString(R.string.cuba),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.democratic_republic_of_the_congo),getString(R.string.denmark),getString(R.string.djibouti),getString(R.string.dominica),getString(R.string.east_timor),getString(R.string.ecuador),getString(R.string.egypt),getString(R.string.el_salvador),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.estonia),getString(R.string.eswatini),getString(R.string.ethiopia),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.finland),getString(R.string.france),getString(R.string.gabon),getString(R.string.the_gambia),getString(R.string.georgia),getString(R.string.germany),getString(R.string.ghana),getString(R.string.greece),getString(R.string.grenada),getString(R.string.guatemala),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.guyana),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.india),getString(R.string.indonesia),getString(R.string.iran),getString(R.string.iraq),getString(R.string.ireland),getString(R.string.israel),getString(R.string.italy),getString(R.string.jamaica),getString(R.string.japan),getString(R.string.jordan),getString(R.string.kazakhstan),getString(R.string.kenya),getString(R.string.kiribati),getString(R.string.kosovo),getString(R.string.kuwait),getString(R.string.kyrgyzstan),getString(R.string.laos),getString(R.string.latvia),getString(R.string.lebanon),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.malaysia),getString(R.string.maldives),getString(R.string.mali),getString(R.string.malta),getString(R.string.marshall_islands),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mexico),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.mongolia),getString(R.string.montenegro),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.myanmar),getString(R.string.namibia),getString(R.string.nauru),getString(R.string.nepal),getString(R.string.netherlands),getString(R.string.new_zealand),getString(R.string.nicaragua),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.niue),getString(R.string.north_korea),getString(R.string.north_macedonia),getString(R.string.norway),getString(R.string.oman),getString(R.string.pakistan),getString(R.string.palau),getString(R.string.palestine),getString(R.string.panama),getString(R.string.papua_new_guinea),getString(R.string.paraguay),getString(R.string.peoples_republic_of_china),getString(R.string.peru),getString(R.string.philippines),getString(R.string.poland),getString(R.string.portugal),getString(R.string.qatar),getString(R.string.republic_of_abkhazia),getString(R.string.republic_of_china),getString(R.string.republic_of_the_congo),getString(R.string.romania),getString(R.string.russia),getString(R.string.rwanda),getString(R.string.sahrawi_arab_democratic_republic),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_lucia),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.samoa),getString(R.string.san_marino),getString(R.string.sao_tome_and_principe),getString(R.string.saudi_arabia),getString(R.string.senegal),getString(R.string.serbia),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.singapore),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.solomon_islands),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.south_korea),getString(R.string.south_ossetia),getString(R.string.south_sudan),getString(R.string.spain),getString(R.string.sri_lanka),getString(R.string.sudan),getString(R.string.suriname),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.syria),getString(R.string.tajikistan),getString(R.string.tanzania),getString(R.string.thailand),getString(R.string.togo),getString(R.string.tonga),getString(R.string.trinidad_and_tobago),getString(R.string.tunisia),getString(R.string.turkey),getString(R.string.turkish_republic_of_northern_cyprus),getString(R.string.turkmenistan),getString(R.string.tuvalu),getString(R.string.uganda),getString(R.string.ukraine),getString(R.string.united_arab_emirates),getString(R.string.united_kingdom),getString(R.string.united_nations),getString(R.string.united_states),getString(R.string.uruguay),getString(R.string.uzbekistan),getString(R.string.vanuatu),getString(R.string.vatican_city),getString(R.string.venezuela),getString(R.string.vietnam),getString(R.string.yemen),getString(R.string.zambia),getString(R.string.zimbabwe),getString(R.string.mayotte),getString(R.string.reunion),getString(R.string.swaziland),getString(R.string.christmas_island),getString(R.string.cocos_islands),getString(R.string.hong_kong),getString(R.string.macau),getString(R.string.taiwan),getString(R.string.aland_island),getString(R.string.england),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.gibraltar),getString(R.string.guernsey),getString(R.string.isle_of_man),getString(R.string.jersey),getString(R.string.northern_ireland),getString(R.string.scotland),getString(R.string.wales),getString(R.string.american_samoa),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.new_caledonia),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.tokelau),getString(R.string.wallis_and_futuna),getString(R.string.french_guiana),getString(R.string.peru),getString(R.string.anguilla),getString(R.string.aruba),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.cayman_islands),getString(R.string.curacao),getString(R.string.greenland),getString(R.string.guadeloupe),getString(R.string.martinique),getString(R.string.montserrat),getString(R.string.puerto_rico),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.turks_and_caicos_islands),getString(R.string.us_virgin_islands)};
        hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
        sayi=bayraqArray.length;
        dataHelper.saveDataInt("hepsiAltipuan",0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        bayraqelaveet(bayraqArray);



        hepsiAltibtn1li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant1].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn1li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn1li.setVisibility(View.INVISIBLE);
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
                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

//        btn1
        hepsiAltibtn2li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant2].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn2li.setVisibility(View.INVISIBLE);

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
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        hepsiAltibtn3li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant3].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn3li.setVisibility(View.INVISIBLE);

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
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        hepsiAltibtn4li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant4].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn4li.setVisibility(View.INVISIBLE);

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
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        hepsiAltibtn5li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant5].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn5li.setVisibility(View.INVISIBLE);

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
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },300);

                    }
                }
            }
        });

        hepsiAltibtn6li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (olkeArray[variant6].equals(hepsiAltiisim.getText().toString())){

                    hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn1li.setPadding(20,20,20,20);
                    hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn2li.setPadding(20,20,20,20);
                    hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn3li.setPadding(20,20,20,20);
                    hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn4li.setPadding(20,20,20,20);
                    hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn5li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                    hepsiAltibtn6li.setPadding(20,20,20,20);

                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                    hepsiAltibtn6li.setPadding(20,20,20,20);
                    hepsiAltibtn6li.setEnabled(false);
                    puan++;
                    dataHelper.saveDataInt("hepsiAltipuan",puan);
                    hepsiAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hepsiAltibtn6li.setVisibility(View.INVISIBLE);

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
                    hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                    hepsiAltibtn6li.setPadding(20,20,20,20);
                    can--;
                    if (can==2){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiAltican3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(300);
                        objectAnimator.start();
                        hepsiAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiAltiResultActivity.class));
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
                hepsiAltiisim.setText(olkeArray1[variant1]);
            }else if (arr.get(i)==1){
                hepsiAltiisim.setText(olkeArray1[variant2]);
            }else if (arr.get(i)==2){
                hepsiAltiisim.setText(olkeArray1[variant3]);
            }else if (arr.get(i)==3){
                hepsiAltiisim.setText(olkeArray1[variant4]);
            }else if (arr.get(i)==4){
                hepsiAltiisim.setText(olkeArray1[variant5]);
            }else if (arr.get(i)==5){
                hepsiAltiisim.setText(olkeArray1[variant6]);
            }
            i++;
            durum=false;

        }
    }

    public void init(){
        hepsiAltipuan=(TextView) findViewById(R.id.hepsiAltipuan);
        hepsiAltiisim=(TextView) findViewById(R.id.hepsiAltiisim);

        hepsiAltibtn1li=(LinearLayout) findViewById(R.id.hepsiAltibtn1li);
        hepsiAltibtn2li=(LinearLayout) findViewById(R.id.hepsiAltibtn2li);
        hepsiAltibtn3li=(LinearLayout) findViewById(R.id.hepsiAltibtn3li);
        hepsiAltibtn4li=(LinearLayout) findViewById(R.id.hepsiAltibtn4li);
        hepsiAltibtn5li=(LinearLayout) findViewById(R.id.hepsiAltibtn5li);
        hepsiAltibtn6li=(LinearLayout) findViewById(R.id.hepsiAltibtn6li);

        hepsiAltibtn1image=(ImageView) findViewById(R.id.hepsiAltibtn1image);
        hepsiAltibtn2image=(ImageView) findViewById(R.id.hepsiAltibtn2image);
        hepsiAltibtn3image=(ImageView) findViewById(R.id.hepsiAltibtn3image);
        hepsiAltibtn4image=(ImageView) findViewById(R.id.hepsiAltibtn4image);
        hepsiAltibtn5image=(ImageView) findViewById(R.id.hepsiAltibtn5image);
        hepsiAltibtn6image=(ImageView) findViewById(R.id.hepsiAltibtn6image);

        hepsiAltican1=(ImageView) findViewById(R.id.hepsiAltican1);
        hepsiAltican2=(ImageView) findViewById(R.id.hepsiAltican2);
        hepsiAltican3=(ImageView) findViewById(R.id.hepsiAltican3);

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
        hepsiAltibtn1li.setVisibility(View.VISIBLE);
        hepsiAltibtn2li.setVisibility(View.VISIBLE);
        hepsiAltibtn3li.setVisibility(View.VISIBLE);
        hepsiAltibtn4li.setVisibility(View.VISIBLE);
        hepsiAltibtn5li.setVisibility(View.VISIBLE);
        hepsiAltibtn6li.setVisibility(View.VISIBLE);

        hepsiAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn1li.setPadding(20,20,20,20);
        hepsiAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn2li.setPadding(20,20,20,20);
        hepsiAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn3li.setPadding(20,20,20,20);
        hepsiAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn4li.setPadding(20,20,20,20);
        hepsiAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn5li.setPadding(20,20,20,20);
        hepsiAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiAltibtn6li.setPadding(20,20,20,20);

        hepsiAltibtn1li.setEnabled(true);
        hepsiAltibtn2li.setEnabled(true);
        hepsiAltibtn3li.setEnabled(true);
        hepsiAltibtn4li.setEnabled(true);
        hepsiAltibtn5li.setEnabled(true);
        hepsiAltibtn6li.setEnabled(true);

        hepsiAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant1]));
        hepsiAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant2]));
        hepsiAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant3]));
        hepsiAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant4]));
        hepsiAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant5]));
        hepsiAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray2[variant6]));

        Collections.shuffle(arr);
    }
}
