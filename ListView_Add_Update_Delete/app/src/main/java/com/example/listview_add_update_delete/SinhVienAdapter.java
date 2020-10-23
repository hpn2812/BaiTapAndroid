package com.example.listview_add_update_delete;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinhVienAdapter  extends ArrayAdapter {
    Activity activity;
    int layout;
    ArrayList<SinhVien> arrayList;


    public SinhVienAdapter(@NonNull Activity activity, int layout, @NonNull ArrayList<SinhVien> arrayListSV) {
        super(activity, layout, arrayListSV);
        this.activity=activity;
        this.layout=layout;
        this.arrayList=arrayListSV;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater= activity.getLayoutInflater();
        convertView=layoutInflater.inflate(layout,null);
        //Tìm ID
        ImageView avatar=convertView.findViewById(R.id.imgAnhSV);
        TextView name=convertView.findViewById(R.id.txtName);
        TextView age= convertView.findViewById(R.id.txtAge);
        //
        avatar.setImageResource(arrayList.get(position).getAvata());
        name.setText(arrayList.get(position).getName());
        age.setText(arrayList.get(position).getAge()+"");


        return convertView;
    }
}
