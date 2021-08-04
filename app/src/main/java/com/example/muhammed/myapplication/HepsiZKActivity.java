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

public class HepsiZKActivity extends AppCompatActivity {
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
    TextView saniye,hepsiZKDYpuan,hepsiZKDYisim,hepsiZK4B1Upuan,hepsiZK4B1Uisim,hepsiZK1B4Upuan,hepsiZKAltipuan,hepsiZKAltiisim;
    ImageView hepsiZKDYcan1,hepsiZKDYcan2,hepsiZKDYcan3,hepsiZKDYresim,hepsiZK4B1Ucan1,hepsiZK4B1Ucan2,
            hepsiZK4B1Ucan3,hepsiZK1B4Ucan1,hepsiZK1B4Ucan2,hepsiZK1B4Ucan3,hepsiZK1B4Uresim,hepsiZKAltibtn1image,hepsiZKAltibtn2image,
            hepsiZKAltibtn3image,hepsiZKAltibtn4image,hepsiZKAltibtn5image,hepsiZKAltibtn6image,hepsiZKAltican1,hepsiZKAltican2,hepsiZKAltican3;
    ImageButton hepsiZKbtnyanlis,hepsiZKbtndogru;
    LinearLayout hepsiZKAltibtn1li,hepsiZKAltibtn2li,hepsiZKAltibtn3li,hepsiZKAltibtn4li,hepsiZKAltibtn5li,hepsiZKAltibtn6li,hepsiZK1B4ULinear,hepsiZK4B1Ulinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int bayraqArray1[]=new int[]{R.drawable.afghanistan,R.drawable.albania,R.drawable.algeria,R.drawable.andorra,R.drawable.angola,R.drawable.antigua_and_barbuda,R.drawable.argentina,R.drawable.armenia,R.drawable.australia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.the_bahamas,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.barbados,R.drawable.belarus,R.drawable.belgium,R.drawable.belize,R.drawable.benin,R.drawable.bhutan,R.drawable.bolivia,R.drawable.bosnia_and_herzegovina,R.drawable.botswana,R.drawable.brazil,R.drawable.brunei,R.drawable.bulgaria,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cambodia,R.drawable.cameroon,R.drawable.canada,R.drawable.cape_verde,R.drawable.central_african_republic,R.drawable.chad,R.drawable.chile,R.drawable.colombia,R.drawable.comoros,R.drawable.cook_islands,R.drawable.costa_rica,R.drawable.cote_dlvoire,R.drawable.croatia,R.drawable.cuba,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.democratic_republic_of_the_congo,R.drawable.denmark,R.drawable.djibouti,R.drawable.dominica,R.drawable.east_timor,R.drawable.ecuador,R.drawable.egypt,R.drawable.el_salvador,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.estonia,R.drawable.eswatini,R.drawable.ethiopia,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.finland,R.drawable.france,R.drawable.gabon,R.drawable.the_gambia,R.drawable.georgia,R.drawable.germany,R.drawable.ghana,R.drawable.greece,R.drawable.grenada,R.drawable.guatemala,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.guyana,R.drawable.haiti,R.drawable.honduras,R.drawable.hungary,R.drawable.iceland,R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,R.drawable.ireland,R.drawable.israel,R.drawable.italy,R.drawable.jamaica,R.drawable.japan,R.drawable.jordan,R.drawable.kazakhstan,R.drawable.kenya,R.drawable.kiribati,R.drawable.kosovo,R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.latvia,R.drawable.lebanon,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.madagascar,R.drawable.malawi,R.drawable.malaysia,R.drawable.maldives,R.drawable.mali,R.drawable.malta,R.drawable.marshall_islands,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mexico,R.drawable.moldova,R.drawable.monaco,R.drawable.mongolia,R.drawable.montenegro,R.drawable.morocco,R.drawable.mozambique,R.drawable.myanmar,R.drawable.namibia,R.drawable.nauru,R.drawable.nepal,R.drawable.netherlands,R.drawable.new_zealand,R.drawable.nicaragua,R.drawable.niger,R.drawable.nigeria,R.drawable.niue,R.drawable.north_korea,R.drawable.north_macedonia,R.drawable.norway,R.drawable.oman,R.drawable.pakistan,R.drawable.palau,R.drawable.palestine,R.drawable.panama,R.drawable.papua_new_guinea,R.drawable.paraguay,R.drawable.peoples_republic_of_china,R.drawable.peru,R.drawable.philippines,R.drawable.poland,R.drawable.portugal,R.drawable.qatar,R.drawable.republic_of_abkhazia,R.drawable.republic_of_china,R.drawable.republic_of_the_congo,R.drawable.romania,R.drawable.russia,R.drawable.rwanda,R.drawable.sahrawi_arab_democratic_republic,R.drawable.saint_kitts_and_nevis,R.drawable.saint_lucia,R.drawable.saint_vincent_and_the_grenadines,R.drawable.samoa,R.drawable.san_marino,R.drawable.sao_tome_and_principe,R.drawable.saudi_arabia,R.drawable.senegal,R.drawable.serbia,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.singapore,R.drawable.slovakia,R.drawable.slovenia,R.drawable.solomon_islands,R.drawable.somalia,R.drawable.south_africa,R.drawable.south_korea,R.drawable.south_ossetia,R.drawable.south_sudan,R.drawable.spain,R.drawable.sri_lanka,R.drawable.sudan,R.drawable.suriname,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria,R.drawable.tajikistan,R.drawable.tanzania,R.drawable.thailand,R.drawable.togo,R.drawable.tonga,R.drawable.trinidad_and_tobago,R.drawable.tunisia,R.drawable.turkey,R.drawable.turkish_republic_of_northern_cyprus,R.drawable.turkmenistan,R.drawable.tuvalu,R.drawable.uganda,R.drawable.ukraine,R.drawable.united_arab_emirates,R.drawable.united_kingdom,R.drawable.united_nations,R.drawable.united_states,R.drawable.uruguay,R.drawable.uzbekistan,R.drawable.vanuatu,R.drawable.vatican_city,R.drawable.venezuela,R.drawable.vietnam,R.drawable.yemen,R.drawable.zambia,R.drawable.zimbabwe,R.drawable.mayotte,R.drawable.reunion,R.drawable.swaziland,R.drawable.christmas_island,R.drawable.cocos_islands,R.drawable.hong_kong,R.drawable.macau,R.drawable.taiwan,R.drawable.aland_island,R.drawable.england,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.gibraltar,R.drawable.guernsey,R.drawable.isle_of_man,R.drawable.jersey,R.drawable.northern_ireland,R.drawable.scotland,R.drawable.wales,R.drawable.american_samoa,R.drawable.french_polyensia,R.drawable.guam,R.drawable.new_caledonia,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.tokelau,R.drawable.wallis_and_futuna,R.drawable.french_guiana,R.drawable.peru,R.drawable.anguilla,R.drawable.aruba,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.cayman_islands,R.drawable.curacao,R.drawable.greenland,R.drawable.guadeloupe,R.drawable.martinique,R.drawable.montserrat,R.drawable.puerto_rico,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.turks_and_caicos_islands,R.drawable.us_virgin_islands};
        final String olkeArray1[]=new String[]{getString(R.string.afghanistan),getString(R.string.albania),getString(R.string.algeria),getString(R.string.andorra),getString(R.string.angola),getString(R.string.antigua_and_barbuda),getString(R.string.argentina),getString(R.string.armenia),getString(R.string.australia),getString(R.string.austria),getString(R.string.azerbaijan),getString(R.string.the_bahamas),getString(R.string.bahrain),getString(R.string.bangladesh),getString(R.string.barbados),getString(R.string.belarus),getString(R.string.belgium),getString(R.string.belize),getString(R.string.benin),getString(R.string.bhutan),getString(R.string.bolivia),getString(R.string.bosnia_and_herzegovina),getString(R.string.botswana),getString(R.string.brazil),getString(R.string.brunei),getString(R.string.bulgaria),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cambodia),getString(R.string.cameroon),getString(R.string.canada),getString(R.string.cape_verde),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.chile),getString(R.string.colombia),getString(R.string.comoros),getString(R.string.cook_islands),getString(R.string.costa_rica),getString(R.string.cote_dlvoire),getString(R.string.croatia),getString(R.string.cuba),getString(R.string.cyprus),getString(R.string.czech_republic),getString(R.string.democratic_republic_of_the_congo),getString(R.string.denmark),getString(R.string.djibouti),getString(R.string.dominica),getString(R.string.east_timor),getString(R.string.ecuador),getString(R.string.egypt),getString(R.string.el_salvador),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.estonia),getString(R.string.eswatini),getString(R.string.ethiopia),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.finland),getString(R.string.france),getString(R.string.gabon),getString(R.string.the_gambia),getString(R.string.georgia),getString(R.string.germany),getString(R.string.ghana),getString(R.string.greece),getString(R.string.grenada),getString(R.string.guatemala),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.guyana),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.hungary),getString(R.string.iceland),getString(R.string.india),getString(R.string.indonesia),getString(R.string.iran),getString(R.string.iraq),getString(R.string.ireland),getString(R.string.israel),getString(R.string.italy),getString(R.string.jamaica),getString(R.string.japan),getString(R.string.jordan),getString(R.string.kazakhstan),getString(R.string.kenya),getString(R.string.kiribati),getString(R.string.kosovo),getString(R.string.kuwait),getString(R.string.kyrgyzstan),getString(R.string.laos),getString(R.string.latvia),getString(R.string.lebanon),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.liechtenstein),getString(R.string.lithuania),getString(R.string.luxembourg),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.malaysia),getString(R.string.maldives),getString(R.string.mali),getString(R.string.malta),getString(R.string.marshall_islands),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mexico),getString(R.string.moldova),getString(R.string.monaco),getString(R.string.mongolia),getString(R.string.montenegro),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.myanmar),getString(R.string.namibia),getString(R.string.nauru),getString(R.string.nepal),getString(R.string.netherlands),getString(R.string.new_zealand),getString(R.string.nicaragua),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.niue),getString(R.string.north_korea),getString(R.string.north_macedonia),getString(R.string.norway),getString(R.string.oman),getString(R.string.pakistan),getString(R.string.palau),getString(R.string.palestine),getString(R.string.panama),getString(R.string.papua_new_guinea),getString(R.string.paraguay),getString(R.string.peoples_republic_of_china),getString(R.string.peru),getString(R.string.philippines),getString(R.string.poland),getString(R.string.portugal),getString(R.string.qatar),getString(R.string.republic_of_abkhazia),getString(R.string.republic_of_china),getString(R.string.republic_of_the_congo),getString(R.string.romania),getString(R.string.russia),getString(R.string.rwanda),getString(R.string.sahrawi_arab_democratic_republic),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_lucia),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.samoa),getString(R.string.san_marino),getString(R.string.sao_tome_and_principe),getString(R.string.saudi_arabia),getString(R.string.senegal),getString(R.string.serbia),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.singapore),getString(R.string.slovakia),getString(R.string.slovenia),getString(R.string.solomon_islands),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.south_korea),getString(R.string.south_ossetia),getString(R.string.south_sudan),getString(R.string.spain),getString(R.string.sri_lanka),getString(R.string.sudan),getString(R.string.suriname),getString(R.string.sweden),getString(R.string.switzerland),getString(R.string.syria),getString(R.string.tajikistan),getString(R.string.tanzania),getString(R.string.thailand),getString(R.string.togo),getString(R.string.tonga),getString(R.string.trinidad_and_tobago),getString(R.string.tunisia),getString(R.string.turkey),getString(R.string.turkish_republic_of_northern_cyprus),getString(R.string.turkmenistan),getString(R.string.tuvalu),getString(R.string.uganda),getString(R.string.ukraine),getString(R.string.united_arab_emirates),getString(R.string.united_kingdom),getString(R.string.united_nations),getString(R.string.united_states),getString(R.string.uruguay),getString(R.string.uzbekistan),getString(R.string.vanuatu),getString(R.string.vatican_city),getString(R.string.venezuela),getString(R.string.vietnam),getString(R.string.yemen),getString(R.string.zambia),getString(R.string.zimbabwe),getString(R.string.mayotte),getString(R.string.reunion),getString(R.string.swaziland),getString(R.string.christmas_island),getString(R.string.cocos_islands),getString(R.string.hong_kong),getString(R.string.macau),getString(R.string.taiwan),getString(R.string.aland_island),getString(R.string.england),getString(R.string.evropean_union),getString(R.string.faroe_islands),getString(R.string.gibraltar),getString(R.string.guernsey),getString(R.string.isle_of_man),getString(R.string.jersey),getString(R.string.northern_ireland),getString(R.string.scotland),getString(R.string.wales),getString(R.string.american_samoa),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.new_caledonia),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.tokelau),getString(R.string.wallis_and_futuna),getString(R.string.french_guiana),getString(R.string.peru),getString(R.string.anguilla),getString(R.string.aruba),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.cayman_islands),getString(R.string.curacao),getString(R.string.greenland),getString(R.string.guadeloupe),getString(R.string.martinique),getString(R.string.montserrat),getString(R.string.puerto_rico),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.turks_and_caicos_islands),getString(R.string.us_virgin_islands)};

        timeleftInMillis=COUNTDOWN_IN_MILLIS;
        startCountDown();

        funksiyaKZ(bayraqArray1,olkeArray1);







    }

    public void init(){
        hepsiZKDYpuan = (TextView) findViewById(R.id.hepsiZKDYpuan);
        saniye = (TextView) findViewById(R.id.saniye);
        hepsiZKDYisim = (TextView) findViewById(R.id.hepsiZKDYisim);
        hepsiZK4B1Upuan = (TextView) findViewById(R.id.hepsiZK4B1Upuan);
        hepsiZK4B1Uisim = (TextView) findViewById(R.id.hepsiZK4B1Uisim);
        hepsiZK1B4Upuan = (TextView) findViewById(R.id.hepsiZK1B4Upuan);
        hepsiZKAltipuan = (TextView) findViewById(R.id.hepsiZKAltipuan);
        hepsiZKAltiisim = (TextView) findViewById(R.id.hepsiZKAltiisim);

        hepsiZKDYcan1 = (ImageView) findViewById(R.id.hepsiZKDYcan1);
        hepsiZKDYcan2 = (ImageView) findViewById(R.id.hepsiZKDYcan2);
        hepsiZKDYcan3 = (ImageView) findViewById(R.id.hepsiZKDYcan3);
        hepsiZKDYresim = (ImageView) findViewById(R.id.hepsiZKDYresim);
        hepsiZK4B1Ucan1 = (ImageView) findViewById(R.id.hepsiZK4B1Ucan1);
        hepsiZK4B1Ucan2 = (ImageView) findViewById(R.id.hepsiZK4B1Ucan2);
        hepsiZK4B1Ucan3 = (ImageView) findViewById(R.id.hepsiZK4B1Ucan3);

        hepsiZK1B4Ucan1 = (ImageView) findViewById(R.id.hepsiZK1B4Ucan1);
        hepsiZK1B4Ucan2 = (ImageView) findViewById(R.id.hepsiZK1B4Ucan2);
        hepsiZK1B4Ucan3 = (ImageView) findViewById(R.id.hepsiZK1B4Ucan3);

        hepsiZK1B4Uresim = (ImageView) findViewById(R.id.hepsiZK1B4Uresim);
        hepsiZKAltibtn1image = (ImageView) findViewById(R.id.hepsiZKAltibtn1image);
        hepsiZKAltibtn2image = (ImageView) findViewById(R.id.hepsiZKAltibtn2image);
        hepsiZKAltibtn3image = (ImageView) findViewById(R.id.hepsiZKAltibtn3image);
        hepsiZKAltibtn4image = (ImageView) findViewById(R.id.hepsiZKAltibtn4image);
        hepsiZKAltibtn5image = (ImageView) findViewById(R.id.hepsiZKAltibtn5image);
        hepsiZKAltibtn6image = (ImageView) findViewById(R.id.hepsiZKAltibtn6image);

        hepsiZKAltican1 = (ImageView) findViewById(R.id.hepsiZKAltican1);
        hepsiZKAltican2 = (ImageView) findViewById(R.id.hepsiZKAltican2);
        hepsiZKAltican3 = (ImageView) findViewById(R.id.hepsiZKAltican3);

        hepsiZKbtnyanlis = (ImageButton) findViewById(R.id.hepsiZKbtnyanlis);
        hepsiZKbtndogru = (ImageButton) findViewById(R.id.hepsiZKbtndogru);

        hepsiZKAltibtn1li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn1li);
        hepsiZKAltibtn2li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn2li);
        hepsiZKAltibtn3li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn3li);
        hepsiZKAltibtn4li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn4li);
        hepsiZKAltibtn5li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn5li);
        hepsiZKAltibtn6li = (LinearLayout) findViewById(R.id.hepsiZKAltibtn6li);
        hepsiZK1B4ULinear = (LinearLayout) findViewById(R.id.hepsiZK1B4ULinear);
        hepsiZK4B1Ulinear = (LinearLayout) findViewById(R.id.hepsiZK4B1Ulinear);
    }

    public void funksiyaKZ(final int[] bayraqArray,final String[] olkeArray){



        viewsay=random.nextInt(4);
        if (viewsay==0){
            setContentView(R.layout.activity_hepsi_dy_zk);
            init();
            if (can==2){
                hepsiZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){
                hepsiZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                hepsiZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            hepsiZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);

            say=random.nextInt(5);
            bayraqsay=random.nextInt(bayraqArray.length);
            ulkesay=random.nextInt(olkeArray.length);

            if (say==0 || say==1 || say==2){
                hepsiZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                hepsiZKDYisim.setText(olkeArray[bayraqsay]);
                durum=true;
            }else {
                hepsiZKDYresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqsay]));
                hepsiZKDYisim.setText(olkeArray[ulkesay]);

                if (bayraqsay==ulkesay){
                    durum=true;
                }else {
                    durum=false;
                }

            }

            hepsiZKbtndogru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (durum){
                        puan++;
                        hepsiZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("hepsiZKpuan",puan);
                            startActivity(new Intent(context, HepsiZKResultActivity.class));
                            finish();
                            overridePendingTransition(R.anim.right_in,R.anim.left_out);
                        }else{

                            funksiyaKZ(bayraqArray,olkeArray);


                        }


                    }
                }
            });

            hepsiZKbtnyanlis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!durum){
                        puan++;

                        hepsiZKDYpuan.setText(getString(R.string.puan_yazi)+" "+puan);
                        funksiyaKZ(bayraqArray,olkeArray);



                    }else {
                        can--;

                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKDYcan3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(1000);
                            objectAnimator.start();
                            hepsiZKDYcan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            dataHelper.saveDataInt("hepsiZKpuan",puan);
                            startActivity(new Intent(context, HepsiZKResultActivity.class));
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
            setContentView(R.layout.activity_hepsi_alti_zk);
            init();
            if (can==2){
                hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){

                hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("avropZKpuan",puan);
            arr.add(0);
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            bayraqelaveet(bayraqArray);


            hepsiZKAltibtn1li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant1].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn1li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn1li.setVisibility(View.INVISIBLE);
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
                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

//        btn1
            hepsiZKAltibtn2li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant2].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru1));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn2li.setVisibility(View.INVISIBLE);

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
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis1));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            hepsiZKAltibtn3li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant3].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler3 = new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn3li.setVisibility(View.INVISIBLE);

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
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            hepsiZKAltibtn4li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant4].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);


                        Handler handler4 = new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn4li.setVisibility(View.INVISIBLE);

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
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            hepsiZKAltibtn5li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant5].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler5 = new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn5li.setVisibility(View.INVISIBLE);

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
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
                                    finish();
                                    overridePendingTransition(R.anim.right_in,R.anim.left_out);

                                }
                            },300);

                        }
                    }
                }
            });

            hepsiZKAltibtn6li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (olkeArray[variant6].equals(hepsiZKAltiisim.getText().toString())){

                        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn1li.setPadding(20,20,20,20);
                        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn2li.setPadding(20,20,20,20);
                        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn3li.setPadding(20,20,20,20);
                        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn4li.setPadding(20,20,20,20);
                        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn5li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);

                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);
                        hepsiZKAltibtn6li.setEnabled(false);
                        puan++;
                        dataHelper.saveDataInt("hepsiZKpuan",puan);
                        hepsiZKAltipuan.setText(getString(R.string.puan_yazi)+" "+puan);

                        Handler handler6 = new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                hepsiZKAltibtn6li.setVisibility(View.INVISIBLE);

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
                        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtnyanlis));
                        hepsiZKAltibtn6li.setPadding(20,20,20,20);
                        can--;
                        if (can==2){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican1,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                        }else if(can==1){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican2,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                        }else if (can==0){
                            ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZKAltican3,View.ROTATION_Y,180f);
                            objectAnimator.setDuration(300);
                            objectAnimator.start();
                            hepsiZKAltican3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                        }
                        if (can==0){
                            Handler handler1=new Handler();
                            handler1.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(new Intent(context,HepsiZKResultActivity.class));
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
            setContentView(R.layout.activity_hepsi_1b4u_zk);
            init();
            if (can==2){
                hepsiZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }else if(can==1){

                hepsiZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                hepsiZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

            }
            hepsiZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("hepsiZKpuan",puan);
            esasFunk(bayraqArray,olkeArray);

            updateCountDownText();


        }


        if (viewsay==3){
            setContentView(R.layout.activity_hepsi_4b1u_zk);
            init();
            if (can==2){
                hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }else if(can==1){
                hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


            }
            hepsiZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
            sayi=bayraqArray.length;
            dataHelper.saveDataInt("hepsiZKpuan",puan);
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
        hepsiZK1B4Uresim.setImageDrawable(this.getResources().getDrawable(bayraqArray[bayraqolke]));



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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);

                            }
                        },600);

                    }

                }
            });
            hepsiZK1B4ULinear.addView(btn1);


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
                dataHelper.saveDataInt("hepsiZKpuan",puan);
                hepsiZK1B4Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                btn2.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                btn2.setTextColor(Color.WHITE);
                btn2.setEnabled(false);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        hepsiZK1B4ULinear.removeAllViews();
                        funksiyaKZ(bayraqArray,olkeArray);
                    }
                },600);




            }
        });

        hepsiZK1B4ULinear.addView(btn2);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK1B4Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK1B4Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
                                finish();
                                overridePendingTransition(R.anim.right_in,R.anim.left_out);
                            }
                        },600);
                    }

                }
            });
            hepsiZK1B4ULinear.addView(btn3);

        }
    }

    public void funk4b1u(final int[] bayraqArray, final String[] olkeArray){
        rand(sayi);
        linearrand=random.nextInt(4);
        btnrand=random.nextInt(4);
        hepsiZK4B1Uisim.setText(olkeArray[bayraqolke]);


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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler1=new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler2=new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
            hepsiZK4B1Ulinear.addView(lilayer1);

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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler3=new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
                hepsiZK4B1Upuan.setText(getString(R.string.puan_yazi)+" "+puan);
                dataHelper.saveDataInt("hepsiZKpuan",puan);
                libutton2_1.setEnabled(false);
                libutton2_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunbtndogru));
                Handler handler7=new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        hepsiZK4B1Ulinear.removeAllViews();
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler4=new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
        hepsiZK4B1Ulinear.addView(lilayer2);




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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler5=new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan1,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan1.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));


                    }else if(can==1){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan2,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan2.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));

                    }else if (can==0){
                        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(hepsiZK4B1Ucan3,View.ROTATION_Y,180f);
                        objectAnimator.setDuration(500);
                        objectAnimator.start();
                        hepsiZK4B1Ucan3.setImageDrawable(getResources().getDrawable(R.drawable.ic_favorite_black_24dp));
                    }
                    if (can==0){
                        Handler handler6=new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(context,HepsiZKResultActivity.class));
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
            hepsiZK4B1Ulinear.addView(lilayer3);
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
                hepsiZKAltiisim.setText(olkeArray[variant1]);
            }else if (arr.get(i)==1){
                hepsiZKAltiisim.setText(olkeArray[variant2]);
            }else if (arr.get(i)==2){
                hepsiZKAltiisim.setText(olkeArray[variant3]);
            }else if (arr.get(i)==3){
                hepsiZKAltiisim.setText(olkeArray[variant4]);
            }else if (arr.get(i)==4){
                hepsiZKAltiisim.setText(olkeArray[variant5]);
            }else if (arr.get(i)==5){
                hepsiZKAltiisim.setText(olkeArray[variant6]);
            }
            i++;
            durum1=false;

        }
    }

    public void bayraqelaveet(int[] bayraqArray){
        rand1(sayi);
        i=0;
        hepsiZKAltibtn1li.setVisibility(View.VISIBLE);
        hepsiZKAltibtn2li.setVisibility(View.VISIBLE);
        hepsiZKAltibtn3li.setVisibility(View.VISIBLE);
        hepsiZKAltibtn4li.setVisibility(View.VISIBLE);
        hepsiZKAltibtn5li.setVisibility(View.VISIBLE);
        hepsiZKAltibtn6li.setVisibility(View.VISIBLE);

        hepsiZKAltibtn1li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn1li.setPadding(20,20,20,20);
        hepsiZKAltibtn2li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn2li.setPadding(20,20,20,20);
        hepsiZKAltibtn3li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn3li.setPadding(20,20,20,20);
        hepsiZKAltibtn4li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn4li.setPadding(20,20,20,20);
        hepsiZKAltibtn5li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn5li.setPadding(20,20,20,20);
        hepsiZKAltibtn6li.setBackgroundDrawable(getResources().getDrawable(R.drawable.agbutton2));
        hepsiZKAltibtn6li.setPadding(20,20,20,20);

        hepsiZKAltibtn1li.setEnabled(true);
        hepsiZKAltibtn2li.setEnabled(true);
        hepsiZKAltibtn3li.setEnabled(true);
        hepsiZKAltibtn4li.setEnabled(true);
        hepsiZKAltibtn5li.setEnabled(true);
        hepsiZKAltibtn6li.setEnabled(true);

        hepsiZKAltibtn1image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant1]));
        hepsiZKAltibtn2image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant2]));
        hepsiZKAltibtn3image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant3]));
        hepsiZKAltibtn4image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant4]));
        hepsiZKAltibtn5image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant5]));
        hepsiZKAltibtn6image.setImageDrawable(this.getResources().getDrawable(bayraqArray[variant6]));

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
                startActivity(new Intent(context,HepsiZKResultActivity.class));
                finish();
            }
        }.start();

    }

}
