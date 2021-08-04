package com.example.muhammed.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class AvropaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView avropaList;
    EditText avropaTabloedittxt;
    ImageButton avropaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avropa_tablo);
        final int bayraqArray1[]=new int[]{R.drawable.aland_island,R.drawable.albania,R.drawable.andorra,R.drawable.armenia,R.drawable.austria,R.drawable.azerbaijan,R.drawable.belarus,R.drawable.belgium,R.drawable.bosnia_and_herzegovina,R.drawable.bulgaria,R.drawable.croatia,R.drawable.cyprus,R.drawable.czech_republic,R.drawable.denmark,R.drawable.england,R.drawable.estonia,R.drawable.evropean_union,R.drawable.faroe_islands,R.drawable.finland,R.drawable.france,R.drawable.georgia,R.drawable.germany,R.drawable.gibraltar,R.drawable.greece,R.drawable.guernsey,R.drawable.hungary,R.drawable.iceland,R.drawable.ireland,R.drawable.isle_of_man,R.drawable.italy,R.drawable.jersey,R.drawable.kazakhstan,R.drawable.kosovo,R.drawable.latvia,R.drawable.liechtenstein,R.drawable.lithuania,R.drawable.luxembourg,R.drawable.north_macedonia,R.drawable.malta,R.drawable.moldova,R.drawable.monaco,R.drawable.montenegro,R.drawable.netherlands,R.drawable.northern_ireland,R.drawable.norway,R.drawable.poland,R.drawable.portugal,R.drawable.romania,R.drawable.russia,R.drawable.san_marino,R.drawable.scotland,R.drawable.serbia,R.drawable.slovakia,R.drawable.slovenia,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.turkey,R.drawable.ukraine,R.drawable.united_kingdom,R.drawable.vatican_city,R.drawable.wales};
        final String olkeArray[] = new String[]{getString(R.string.aland_island), getString(R.string.albania), getString(R.string.andorra), getString(R.string.armenia), getString(R.string.austria), getString(R.string.azerbaijan), getString(R.string.belarus), getString(R.string.belgium), getString(R.string.bosnia_and_herzegovina), getString(R.string.bulgaria), getString(R.string.croatia), getString(R.string.cyprus), getString(R.string.czech_republic), getString(R.string.denmark), getString(R.string.england), getString(R.string.estonia), getString(R.string.evropean_union), getString(R.string.faroe_islands), getString(R.string.finland), getString(R.string.france), getString(R.string.georgia), getString(R.string.germany), getString(R.string.gibraltar), getString(R.string.greece), getString(R.string.guernsey), getString(R.string.hungary), getString(R.string.iceland), getString(R.string.ireland), getString(R.string.isle_of_man), getString(R.string.italy), getString(R.string.jersey), getString(R.string.kazakhstan), getString(R.string.kosovo), getString(R.string.latvia), getString(R.string.liechtenstein), getString(R.string.lithuania), getString(R.string.luxembourg), getString(R.string.north_macedonia), getString(R.string.malta), getString(R.string.moldova), getString(R.string.monaco), getString(R.string.montenegro), getString(R.string.netherlands), getString(R.string.northern_ireland), getString(R.string.norway), getString(R.string.poland), getString(R.string.portugal), getString(R.string.romania), getString(R.string.russia), getString(R.string.san_marino), getString(R.string.scotland), getString(R.string.serbia), getString(R.string.slovakia), getString(R.string.slovenia), getString(R.string.spain), getString(R.string.sweden), getString(R.string.switzerland), getString(R.string.turkey), getString(R.string.ukraine), getString(R.string.united_kingdom), getString(R.string.vatican_city), getString(R.string.wales)};
        final int bayraqArray[] = new int[]{R.drawable.tablo_aland_island, R.drawable.tablo_albania, R.drawable.tablo_andorra, R.drawable.tablo_armenia, R.drawable.tablo_austria, R.drawable.tablo_azerbaijan, R.drawable.tablo_belarus, R.drawable.tablo_belgium, R.drawable.tablo_bosnia_and_herzegovina, R.drawable.tablo_bulgaria, R.drawable.tablo_croatia, R.drawable.tablo_cyprus, R.drawable.tablo_czech_republic, R.drawable.tablo_denmark, R.drawable.tablo_england, R.drawable.tablo_estonia, R.drawable.tablo_evropean_union, R.drawable.tablo_faroe_islands, R.drawable.tablo_finland, R.drawable.tablo_france, R.drawable.tablo_georgia, R.drawable.tablo_germany, R.drawable.tablo_gibraltar, R.drawable.tablo_greece, R.drawable.tablo_guernsey, R.drawable.tablo_hungary, R.drawable.tablo_iceland, R.drawable.tablo_ireland, R.drawable.tablo_isle_of_man, R.drawable.tablo_italy, R.drawable.tablo_jersey, R.drawable.tablo_kazakhstan, R.drawable.tablo_kosovo, R.drawable.tablo_latvia, R.drawable.tablo_liechtenstein, R.drawable.tablo_lithuania, R.drawable.tablo_luxembourg, R.drawable.tablo_north_macedonia, R.drawable.tablo_malta, R.drawable.tablo_moldova, R.drawable.tablo_monaco, R.drawable.tablo_montenegro, R.drawable.tablo_netherlands, R.drawable.tablo_northern_ireland, R.drawable.tablo_norway, R.drawable.tablo_poland, R.drawable.tablo_portugal, R.drawable.tablo_romania, R.drawable.tablo_russia, R.drawable.tablo_san_marino, R.drawable.tablo_scotland, R.drawable.tablo_serbia, R.drawable.tablo_slovakia, R.drawable.tablo_slovenia, R.drawable.tablo_spain, R.drawable.tablo_sweden, R.drawable.tablo_switzerland, R.drawable.tablo_turkey, R.drawable.tablo_ukraine, R.drawable.tablo_united_kingdom, R.drawable.tablo_vatican_city, R.drawable.tablo_wales};
        avropaList=(ListView) findViewById(R.id.avropaList);
        avropaTabloedittxt=(EditText) findViewById(R.id.avropaTabloedittxt);
        avropaTabloHome=(ImageButton) findViewById(R.id.avropaTabloHome);
        avropaTabloHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MainActivity.class));
                finish();
            }
        });



        for (int i=0;i<olkeArray.length;i++){
            elaveEt.add(new BayraqOlkeClass(olkeArray[i],bayraqArray[i]));
        }



        AdapterTablo adapterTablo =new AdapterTablo(elaveEt,context);
        avropaList.setAdapter(adapterTablo);

        avropaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout avropaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                avropaTabloLinear.setMinimumHeight(h);
                avropaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        avropaTabloedittxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List<BayraqOlkeClass> TempelaveEt=new ArrayList<>();
                final ArrayList<Integer> say =new ArrayList<>();
                for (int i=0;i<olkeArray.length;i++){
                    if (olkeArray[i].toUpperCase().contains(s.toString().toUpperCase())){
                        TempelaveEt.add(new BayraqOlkeClass(olkeArray[i],bayraqArray[i]));
                        say.add(bayraqArray1[i]);
                    }
                }

                    avropaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                avropaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout avropaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        avropaTabloLinear.setMinimumHeight(h);
                        avropaTabloLinear.setLayoutParams(params);

                        ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                        image.setMaxHeight(h);
                        image.setMaxHeight(h);
                        image.setLayoutParams(params);

                        image.setBackgroundResource(say.get(position));
                        builder.setView(sekil);
                        builder.show();
                    }
                });



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
