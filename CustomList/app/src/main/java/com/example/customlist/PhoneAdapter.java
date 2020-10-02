package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PhoneAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Phone> arrayPhone;
    public PhoneAdapter (Context context, int layout, List<Phone> phoneList){
        this.myContext=context;
        this.myLayout=layout;
        this.arrayPhone=phoneList;

    }
    @Override
    public int getCount() {
        return arrayPhone.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater flater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= flater.inflate(myLayout,null);

        TextView txtPhoneName=(TextView) view.findViewById(R.id.textView);
        txtPhoneName.setText(arrayPhone.get(i).name);
        TextView txtPrice=(TextView) view.findViewById(R.id.textView2);
        txtPrice.setText(arrayPhone.get(i).price);
        return view;
    }
}
