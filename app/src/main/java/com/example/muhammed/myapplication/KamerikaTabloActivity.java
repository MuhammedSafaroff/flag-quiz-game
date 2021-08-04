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

public class KamerikaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView kamerikaList;
    EditText kamerikaTabloedittxt;
    ImageButton kamerikaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamerika_tablo);
        final int bayraqArray1[] = new int[]{R.drawable.anguilla,R.drawable.antigua_and_barbuda,R.drawable.aruba,R.drawable.barbados,R.drawable.belize,R.drawable.bermuda,R.drawable.british_virgin_islands,R.drawable.canada,R.drawable.cayman_islands,R.drawable.costa_rica,R.drawable.cuba,R.drawable.curacao,R.drawable.dominica,R.drawable.dominican_republic,R.drawable.el_salvador,R.drawable.greenland,R.drawable.grenada,R.drawable.guadeloupe,R.drawable.guatemala,R.drawable.haiti,R.drawable.honduras,R.drawable.jamaica,R.drawable.martinique,R.drawable.mexico,R.drawable.montserrat,R.drawable.nicaragua,R.drawable.panama,R.drawable.puerto_rico,R.drawable.saint_lucia,R.drawable.saint_pierre_and_miquelon,R.drawable.sint_maarten,R.drawable.saint_kitts_and_nevis,R.drawable.saint_vincent_and_the_grenadines,R.drawable.the_bahamas,R.drawable.trinidad_and_tobago,R.drawable.turks_and_caicos_islands,R.drawable.united_states,R.drawable.us_virgin_islands};
        final String olkeArray[] = new String[]{getString(R.string.anguilla),getString(R.string.antigua_and_barbuda),getString(R.string.aruba),getString(R.string.barbados),getString(R.string.belize),getString(R.string.bermuda),getString(R.string.british_virgin_islands),getString(R.string.canada),getString(R.string.cayman_islands),getString(R.string.costa_rica),getString(R.string.cuba),getString(R.string.curacao),getString(R.string.dominica),getString(R.string.dominican_republic),getString(R.string.el_salvador),getString(R.string.greenland),getString(R.string.grenada),getString(R.string.guadeloupe),getString(R.string.guatemala),getString(R.string.haiti),getString(R.string.honduras),getString(R.string.jamaica),getString(R.string.martinique),getString(R.string.mexico),getString(R.string.montserrat),getString(R.string.nicaragua),getString(R.string.panama),getString(R.string.puerto_rico),getString(R.string.saint_lucia),getString(R.string.saint_pierre_and_miquelon),getString(R.string.sint_maarten),getString(R.string.saint_kitts_and_nevis),getString(R.string.saint_vincent_and_the_grenadines),getString(R.string.the_bahamas),getString(R.string.trinidad_and_tobago),getString(R.string.turks_and_caicos_islands),getString(R.string.united_states),getString(R.string.us_virgin_islands)};
        final int bayraqArray[] = new int[]{R.drawable.tablo_anguilla,R.drawable.tablo_antigua_and_barbuda,R.drawable.tablo_aruba,R.drawable.tablo_barbados,R.drawable.tablo_belize,R.drawable.tablo_bermuda,R.drawable.tablo_british_virgin_islands,R.drawable.tablo_canada,R.drawable.tablo_cayman_islands,R.drawable.tablo_costa_rica,R.drawable.tablo_cuba,R.drawable.tablo_curacao,R.drawable.tablo_dominica,R.drawable.tablo_dominican_republic,R.drawable.tablo_el_salvador,R.drawable.tablo_greenland,R.drawable.tablo_grenada,R.drawable.tablo_guadeloupe,R.drawable.tablo_guatemala,R.drawable.tablo_haiti,R.drawable.tablo_honduras,R.drawable.tablo_jamaica,R.drawable.tablo_martinique,R.drawable.tablo_mexico,R.drawable.tablo_montserrat,R.drawable.tablo_nicaragua,R.drawable.tablo_panama,R.drawable.tablo_puerto_rico,R.drawable.tablo_saint_lucia,R.drawable.tablo_saint_pierre_and_miquelon,R.drawable.tablo_sint_maarten,R.drawable.tablo_saint_kitts_and_nevis,R.drawable.tablo_saint_vincent_and_the_grenadines,R.drawable.tablo_the_bahamas,R.drawable.tablo_trinidad_and_tobago,R.drawable.tablo_turks_and_caicos_islands,R.drawable.tablo_united_states,R.drawable.tablo_us_virgin_islands};
        kamerikaList=(ListView) findViewById(R.id.kamerikaList);
        kamerikaTabloedittxt=(EditText) findViewById(R.id.kamerikaTabloedittxt);
        kamerikaTabloHome=(ImageButton) findViewById(R.id.kamerikaTabloHome);
        kamerikaTabloHome.setOnClickListener(new View.OnClickListener() {
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
        kamerikaList.setAdapter(adapterTablo);

        kamerikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout kamerikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                kamerikaTabloLinear.setMinimumHeight(h);
                kamerikaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        kamerikaTabloedittxt.addTextChangedListener(new TextWatcher() {
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

                kamerikaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                kamerikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout kamerikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        kamerikaTabloLinear.setMinimumHeight(h);
                        kamerikaTabloLinear.setLayoutParams(params);

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
