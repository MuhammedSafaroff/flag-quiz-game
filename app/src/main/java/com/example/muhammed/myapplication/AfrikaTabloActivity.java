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

public class AfrikaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView afrikaList;
    EditText afrikaTabloedittxt;
    ImageButton afrikaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrika_tablo);
        final int bayraqArray1[]=new int[]{R.drawable.algeria,R.drawable.angola,R.drawable.benin,R.drawable.botswana,R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cape_verde,R.drawable.cameroon,R.drawable.central_african_republic,R.drawable.chad,R.drawable.comoros,R.drawable.cote_dlvoire,R.drawable.democratic_republic_of_the_congo,R.drawable.djibouti,R.drawable.egypt,R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.ethiopia,R.drawable.gabon,R.drawable.ghana,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.kenya,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.madagascar,R.drawable.malawi,R.drawable.mali,R.drawable.mauritania,R.drawable.mauritius,R.drawable.mayotte,R.drawable.morocco,R.drawable.mozambique,R.drawable.namibia,R.drawable.niger,R.drawable.nigeria,R.drawable.republic_of_the_congo,R.drawable.reunion,R.drawable.rwanda,R.drawable.sao_tome_and_principe,R.drawable.senegal,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.somalia,R.drawable.south_africa,R.drawable.sudan,R.drawable.swaziland,R.drawable.tanzania,R.drawable.the_gambia,R.drawable.togo,R.drawable.tunisia,R.drawable.uganda,R.drawable.zambia,R.drawable.zimbabwe};
        final String olkeArray[]=new String[]{getString(R.string.algeria),getString(R.string.angola),getString(R.string.benin),getString(R.string.botswana),getString(R.string.burkina_faso),getString(R.string.burundi),getString(R.string.cape_verde),getString(R.string.cameroon),getString(R.string.central_african_republic),getString(R.string.chad),getString(R.string.comoros),getString(R.string.cote_dlvoire),getString(R.string.democratic_republic_of_the_congo),getString(R.string.djibouti),getString(R.string.egypt),getString(R.string.equatorial_guinea),getString(R.string.eritrea),getString(R.string.ethiopia),getString(R.string.gabon),getString(R.string.ghana),getString(R.string.guinea),getString(R.string.guinea_bissau),getString(R.string.kenya),getString(R.string.lesotho),getString(R.string.liberia),getString(R.string.libya),getString(R.string.madagascar),getString(R.string.malawi),getString(R.string.mali),getString(R.string.mauritania),getString(R.string.mauritius),getString(R.string.mayotte),getString(R.string.morocco),getString(R.string.mozambique),getString(R.string.namibia),getString(R.string.niger),getString(R.string.nigeria),getString(R.string.republic_of_the_congo),getString(R.string.reunion),getString(R.string.rwanda),getString(R.string.sao_tome_and_principe),getString(R.string.senegal),getString(R.string.seychelles),getString(R.string.sierra_leone),getString(R.string.somalia),getString(R.string.south_africa),getString(R.string.sudan),getString(R.string.swaziland),getString(R.string.tanzania),getString(R.string.the_gambia),getString(R.string.togo),getString(R.string.tunisia),getString(R.string.uganda),getString(R.string.zambia),getString(R.string.zimbabwe)};
        final int bayraqArray[]=new int[]{R.drawable.tablo_algeria,R.drawable.tablo_angola,R.drawable.tablo_benin,R.drawable.tablo_botswana,R.drawable.tablo_burkina_faso,R.drawable.tablo_burundi,R.drawable.tablo_cape_verde,R.drawable.tablo_cameroon,R.drawable.tablo_central_african_republic,R.drawable.tablo_chad,R.drawable.tablo_comoros,R.drawable.tablo_cote_dlvoire,R.drawable.tablo_democratic_republic_of_the_congo,R.drawable.tablo_djibouti,R.drawable.tablo_egypt,R.drawable.tablo_equatorial_guinea,R.drawable.tablo_eritrea,R.drawable.tablo_ethiopia,R.drawable.tablo_gabon,R.drawable.tablo_ghana,R.drawable.tablo_guinea,R.drawable.tablo_guinea_bissau,R.drawable.tablo_kenya,R.drawable.tablo_lesotho,R.drawable.tablo_liberia,R.drawable.tablo_libya,R.drawable.tablo_madagascar,R.drawable.tablo_malawi,R.drawable.tablo_mali,R.drawable.tablo_mauritania,R.drawable.tablo_mauritius,R.drawable.tablo_mayotte,R.drawable.tablo_morocco,R.drawable.tablo_mozambique,R.drawable.tablo_namibia,R.drawable.tablo_niger,R.drawable.tablo_nigeria,R.drawable.tablo_republic_of_the_congo,R.drawable.tablo_reunion,R.drawable.tablo_rwanda,R.drawable.tablo_sao_tome_and_principe,R.drawable.tablo_senegal,R.drawable.tablo_seychelles,R.drawable.tablo_sierra_leone,R.drawable.tablo_somalia,R.drawable.tablo_south_africa,R.drawable.tablo_sudan,R.drawable.tablo_swaziland,R.drawable.tablo_tanzania,R.drawable.tablo_the_gambia,R.drawable.tablo_togo,R.drawable.tablo_tunisia,R.drawable.tablo_uganda,R.drawable.tablo_zambia,R.drawable.tablo_zimbabwe};

        afrikaList=(ListView) findViewById(R.id.afrikaList);
        afrikaTabloedittxt=(EditText) findViewById(R.id.afrikaTabloedittxt);
        afrikaTabloHome=(ImageButton) findViewById(R.id.afrikaTabloHome);
        afrikaTabloHome.setOnClickListener(new View.OnClickListener() {
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
        afrikaList.setAdapter(adapterTablo);

        afrikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout afrikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                afrikaTabloLinear.setMinimumHeight(h);
                afrikaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        afrikaTabloedittxt.addTextChangedListener(new TextWatcher() {
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

                afrikaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                afrikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout afrikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        afrikaTabloLinear.setMinimumHeight(h);
                        afrikaTabloLinear.setLayoutParams(params);

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
