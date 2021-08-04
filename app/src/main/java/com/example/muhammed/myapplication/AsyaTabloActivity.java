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

public class AsyaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView asyaList;
    EditText asyaTabloedittxt;
    ImageButton asyaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asya_tablo);
        final int bayraqArray1[] = new int[]{R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.brunei,R.drawable.cambodia,R.drawable.republic_of_china,R.drawable.christmas_island,R.drawable.cocos_islands,R.drawable.georgia,R.drawable.hong_kong,R.drawable.india,R.drawable.indonesia,R.drawable.iran,R.drawable.iraq,R.drawable.israel,R.drawable.japan,R.drawable.jordan,R.drawable.kazakhstan,R.drawable.kuwait,R.drawable.kyrgyzstan,R.drawable.laos,R.drawable.lebanon,R.drawable.macau,R.drawable.malaysia,R.drawable.maldives,R.drawable.mongolia,R.drawable.myanmar,R.drawable.nepal,R.drawable.north_korea,R.drawable.oman,R.drawable.pakistan,R.drawable.philippines,R.drawable.qatar,R.drawable.russia,R.drawable.saudi_arabia,R.drawable.singapore,R.drawable.south_korea,R.drawable.sri_lanka,R.drawable.palestine,R.drawable.syria,R.drawable.taiwan,R.drawable.tajikistan,R.drawable.thailand,R.drawable.east_timor,R.drawable.turkey,R.drawable.turkmenistan,R.drawable.united_arab_emirates,R.drawable.uzbekistan,R.drawable.vietnam,R.drawable.yemen};
        final String olkeArray[] = new String[]{getString(R.string.afghanistan),getString(R.string.armenia),getString(R.string.azerbaijan),getString(R.string.bahrain),getString(R.string.bangladesh),getString(R.string.bhutan),getString(R.string.brunei),getString(R.string.cambodia),getString(R.string.republic_of_china),getString(R.string.christmas_island),getString(R.string.cocos_islands),getString(R.string.georgia),getString(R.string.hong_kong),getString(R.string.india),getString(R.string.indonesia),getString(R.string.iran),getString(R.string.iraq),getString(R.string.israel),getString(R.string.japan),getString(R.string.jordan),getString(R.string.kazakhstan),getString(R.string.kuwait),getString(R.string.kyrgyzstan),getString(R.string.laos),getString(R.string.lebanon),getString(R.string.macau),getString(R.string.malaysia),getString(R.string.maldives),getString(R.string.mongolia),getString(R.string.myanmar),getString(R.string.nepal),getString(R.string.north_korea),getString(R.string.oman),getString(R.string.pakistan),getString(R.string.philippines),getString(R.string.qatar),getString(R.string.russia),getString(R.string.saudi_arabia),getString(R.string.singapore),getString(R.string.south_korea),getString(R.string.sri_lanka),getString(R.string.palestine),getString(R.string.syria),getString(R.string.taiwan),getString(R.string.tajikistan),getString(R.string.thailand),getString(R.string.east_timor),getString(R.string.turkey),getString(R.string.turkmenistan),getString(R.string.united_arab_emirates),getString(R.string.uzbekistan),getString(R.string.vietnam),getString(R.string.yemen)};
        final int bayraqArray[] = new int[]{R.drawable.tablo_afghanistan,R.drawable.tablo_armenia,R.drawable.tablo_azerbaijan,R.drawable.tablo_bahrain,R.drawable.tablo_bangladesh,R.drawable.tablo_bhutan,R.drawable.tablo_brunei,R.drawable.tablo_cambodia,R.drawable.tablo_republic_of_china,R.drawable.tablo_christmas_island,R.drawable.tablo_cocos_islands,R.drawable.tablo_georgia,R.drawable.tablo_hong_kong,R.drawable.tablo_india,R.drawable.tablo_indonesia,R.drawable.tablo_iran,R.drawable.tablo_iraq,R.drawable.tablo_israel,R.drawable.tablo_japan,R.drawable.tablo_jordan,R.drawable.tablo_kazakhstan,R.drawable.tablo_kuwait,R.drawable.tablo_kyrgyzstan,R.drawable.tablo_laos,R.drawable.tablo_lebanon,R.drawable.tablo_macau,R.drawable.tablo_malaysia,R.drawable.tablo_maldives,R.drawable.tablo_mongolia,R.drawable.tablo_myanmar,R.drawable.tablo_nepal,R.drawable.tablo_north_korea,R.drawable.tablo_oman,R.drawable.tablo_pakistan,R.drawable.tablo_philippines,R.drawable.tablo_qatar,R.drawable.tablo_russia,R.drawable.tablo_saudi_arabia,R.drawable.tablo_singapore,R.drawable.tablo_south_korea,R.drawable.tablo_sri_lanka,R.drawable.tablo_palestine,R.drawable.tablo_syria,R.drawable.tablo_taiwan,R.drawable.tablo_tajikistan,R.drawable.tablo_thailand,R.drawable.tablo_east_timor,R.drawable.tablo_turkey,R.drawable.tablo_turkmenistan,R.drawable.tablo_united_arab_emirates,R.drawable.tablo_uzbekistan,R.drawable.tablo_vietnam,R.drawable.tablo_yemen};
        asyaList=(ListView) findViewById(R.id.asyaList);
        asyaTabloedittxt=(EditText) findViewById(R.id.asyaTabloedittxt);
        asyaTabloHome=(ImageButton) findViewById(R.id.asyaTabloHome);
        asyaTabloHome.setOnClickListener(new View.OnClickListener() {
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
        asyaList.setAdapter(adapterTablo);

        asyaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout asyaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                asyaTabloLinear.setMinimumHeight(h);
                asyaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        asyaTabloedittxt.addTextChangedListener(new TextWatcher() {
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

                asyaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                asyaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout asyaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        asyaTabloLinear.setMinimumHeight(h);
                        asyaTabloLinear.setLayoutParams(params);

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
