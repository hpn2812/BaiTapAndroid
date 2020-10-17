package com.example.apptonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    Context context;
    int myLayout;
    List<MonAn> arrayMonan;
    public MonAnAdapter (Context mycontext,int layout,List<MonAn> dsMonan){
       context=mycontext;
       myLayout=layout;
       arrayMonan=dsMonan;
    }
    @Override
    public int getCount() {
        return arrayMonan.size();
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
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(myLayout,null);
        // ánh xạ và gán giá trị
//        TextView textView= view.findViewById(R.id.tenMon);
//        textView.setText(arrayMonan.get(i).tenMon);
//        TextView textView1=view.findViewById(R.id.giaMon);
//        textView1.setText(arrayMonan.get(i).gia+"");
//        ImageView imageView=view.findViewById(R.id.imageMonAn);
//        imageView.setImageResource(arrayMonan.get(i).HinhAnh);


        return view;
    }
}
