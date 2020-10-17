package com.example.apptonghop;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FriendsAdapter extends BaseAdapter {
    Context context;
    int myLayout;
    List<Friends> arrayFriends;
    public FriendsAdapter(Context mycontext,int layout, List<Friends> friendsList){
        context=mycontext;
        myLayout=layout;
        arrayFriends=friendsList;
    }
    @Override
    public int getCount() {
        return arrayFriends.size();
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
        TextView txtTen= view.findViewById(R.id.ten);
        txtTen.setText(arrayFriends.get(i).name);
        TextView txtTuoi= view.findViewById(R.id.tuoi);
        txtTuoi.setText(arrayFriends.get(i).age+"");
        ImageView imgAnh= view.findViewById(R.id.image);
        imgAnh.setImageResource(arrayFriends.get(i).hinhAnh);

        return view;
    }
}
