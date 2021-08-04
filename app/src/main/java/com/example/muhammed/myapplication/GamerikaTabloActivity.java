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

public class GamerikaTabloActivity extends AppCompatActivity {
    Context context=this;
    List<BayraqOlkeClass> elaveEt=new ArrayList<>();
    ListView gamerikaList;
    EditText gamerikaTabloedittxt;
    ImageButton gamerikaTabloHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerika_tablo);
        final int bayraqArray1[]=new int[]{R.drawable.argentina,R.drawable.bolivia,R.drawable.brazil,R.drawable.chile,R.drawable.colombia,R.drawable.ecuador,R.drawable.french_guiana,R.drawable.guyana,R.drawable.paraguay,R.drawable.peru,R.drawable.suriname,R.drawable.uruguay,R.drawable.venezuela};
        final String olkeArray[]=new String[]{getString(R.string.argentina),getString(R.string.bolivia),getString(R.string.brazil),getString(R.string.chile),getString(R.string.colombia),getString(R.string.ecuador),getString(R.string.french_guiana),getString(R.string.guyana),getString(R.string.paraguay),getString(R.string.peru),getString(R.string.suriname),getString(R.string.uruguay),getString(R.string.venezuela)};
        final int bayraqArray[]=new int[]{R.drawable.tablo_argentina,R.drawable.tablo_bolivia,R.drawable.tablo_brazil,R.drawable.tablo_chile,R.drawable.tablo_colombia,R.drawable.tablo_ecuador,R.drawable.tablo_french_guiana,R.drawable.tablo_guyana,R.drawable.tablo_paraguay,R.drawable.tablo_peru,R.drawable.tablo_suriname,R.drawable.tablo_uruguay,R.drawable.tablo_venezuela};

        gamerikaList=(ListView) findViewById(R.id.gamerikaList);
        gamerikaTabloedittxt=(EditText) findViewById(R.id.gamerikaTabloedittxt);
        gamerikaTabloHome=(ImageButton) findViewById(R.id.gamerikaTabloHome);
        gamerikaTabloHome.setOnClickListener(new View.OnClickListener() {
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
        gamerikaList.setAdapter(adapterTablo);

        gamerikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                int height= drawable.getMinimumHeight();
                int h = height*6;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater=LayoutInflater.from(context);
                View sekil=inflater.inflate(R.layout.dialog_resim,null);

                LinearLayout gamerikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                gamerikaTabloLinear.setMinimumHeight(h);
                gamerikaTabloLinear.setLayoutParams(params);

                ImageView image=(ImageView) sekil.findViewById(R.id.resim_dialog);

                image.setMaxHeight(h);
                image.setMaxHeight(h);
                image.setLayoutParams(params);

                image.setBackgroundResource(bayraqArray1[position]);
                builder.setView(sekil);
                builder.show();
            }
        });

        gamerikaTabloedittxt.addTextChangedListener(new TextWatcher() {
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

                gamerikaList.setAdapter(new AdapterTablo(TempelaveEt,context));

                gamerikaList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Drawable drawable = getResources().getDrawable(bayraqArray[position]);
                        int height= drawable.getMinimumHeight();

                        int h = height*6;
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,h);

                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        LayoutInflater inflater=LayoutInflater.from(context);
                        View sekil=inflater.inflate(R.layout.dialog_resim,null);

                        LinearLayout gamerikaTabloLinear = (LinearLayout) sekil.findViewById(R.id.TabloLinear);

                        gamerikaTabloLinear.setMinimumHeight(h);
                        gamerikaTabloLinear.setLayoutParams(params);

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
