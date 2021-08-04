package com.example.muhammed.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterTablo extends BaseAdapter {

    List<BayraqOlkeClass> elaveEt = new ArrayList<>();
    LayoutInflater inflater;
    Context context;

    public AdapterTablo(List<BayraqOlkeClass> elaveEt, Context context) {
        this.elaveEt = elaveEt;
        this.context = context;
    }




    @Override
    public int getCount() {
        return elaveEt.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater=LayoutInflater.from(context);
        View setir=inflater.inflate(R.layout.tablo_setir,null);
        TextView tablo_text = setir.findViewById(R.id.tablo_text);
        ImageView tablo_image=setir.findViewById(R.id.tablo_image);
        BayraqOlkeClass bayraqlar=elaveEt.get(position);
        tablo_text.setText(bayraqlar.getOlkead());
        tablo_image.setImageResource(bayraqlar.getBayraqyol());
        return setir;
    }
}
