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

public class AvustralyaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView avustralyaList;
    EditText avustralyaTabloedittxt;
    ImageButton avustralyaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avustralya_tablo);
        final int bayraqArray1[]=new int[]{R.drawable.american_samoa,R.drawable.australia,R.drawable.cook_islands,R.drawable.federated_states_of_micronesia,R.drawable.fiji,R.drawable.french_polyensia,R.drawable.guam,R.drawable.kiribati,R.drawable.marshall_islands,R.drawable.nauru,R.drawable.new_caledonia,R.drawable.new_zealand,R.drawable.niue,R.drawable.norfolk_island,R.drawable.northern_mariana_islands,R.drawable.palau,R.drawable.papua_new_guinea,R.drawable.samoa,R.drawable.solomon_islands,R.drawable.tokelau,R.drawable.tonga,R.drawable.tuvalu,R.drawable.vanuatu,R.drawable.wallis_and_futuna};
        final String olkeArray[]=new String[]{getString(R.string.american_samoa),getString(R.string.australia),getString(R.string.cook_islands),getString(R.string.federated_states_of_micronesia),getString(R.string.fiji),getString(R.string.french_polyensia),getString(R.string.guam),getString(R.string.kiribati),getString(R.string.marshall_islands),getString(R.string.nauru),getString(R.string.new_caledonia),getString(R.string.new_zealand),getString(R.string.niue),getString(R.string.norfolk_island),getString(R.string.northern_mariana_islands),getString(R.string.palau),getString(R.string.papua_new_guinea),getString(R.string.samoa),getString(R.string.solomon_islands),getString(R.string.tokelau),getString(R.string.tonga),getString(R.string.tuvalu),getString(R.string.vanuatu),getString(R.string.wallis_and_futuna)};
        final int bayraqArray[]=new int[]{R.drawable.tablo_american_samoa,R.drawable.tablo_australia,R.drawable.tablo_cook_islands,R.drawable.tablo_federated_states_of_micronesia,R.drawable.tablo_fiji,R.drawable.tablo_french_polyensia,R.drawable.tablo_guam,R.drawable.tablo_kiribati,R.drawable.tablo_marshall_islands,R.drawable.tablo_nauru,R.drawable.tablo_new_caledonia,R.drawable.tablo_new_zealand,R.drawable.tablo_niue,R.drawable.tablo_norfolk_island,R.drawable.tablo_northern_mariana_islands,R.drawable.tablo_palau,R.drawable.tablo_papua_new_guinea,R.drawable.tablo_samoa,R.drawable.tablo_solomon_islands,R.drawable.tablo_tokelau,R.drawable.tablo_tonga,R.drawable.tablo_tuvalu,R.drawable.tablo_vanuatu,R.drawable.tablo_wallis_and_futuna};
        avustralyaList=(ListView) findViewById(R.id.avustralyaList);
        avustralyaTabloedittxt=(EditText) findViewById(R.id.avustralyaTabloedittxt);
        avustralyaTabloHome=(ImageButton) findViewById(R.id.avustralyaTabloHome);
        avustralyaTabloHome.setOnClickListener(new View.OnClickListener() {
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
        avustralyaList.setAdapter(adapterTablo);

        avustralyaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout avustralyaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                avustralyaTabloLinear.setMinimumHeight(h);
                avustralyaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        avustralyaTabloedittxt.addTextChangedListener(new TextWatcher() {
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

                avustralyaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                avustralyaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout avustralyaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        avustralyaTabloLinear.setMinimumHeight(h);
                        avustralyaTabloLinear.setLayoutParams(params);

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
