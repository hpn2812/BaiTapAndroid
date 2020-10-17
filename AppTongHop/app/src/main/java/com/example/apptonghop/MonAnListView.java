package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MonAnListView extends AppCompatActivity {
    ListView lviewMonAn;
    List<MonAn> arrList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an_list_view);
        lviewMonAn=findViewById(R.id.lvMonAn);
        arrList= new ArrayList<MonAn>();
        arrList.add(new MonAn("Ốc nhảy",100.000,R.drawable.logoutechuan));
        arrList.add(new MonAn("Ốc nhảy",100.000,R.drawable.logoutechuan));
        arrList.add(new MonAn("Ốc nhảy",100.000,R.drawable.logoutechuan));
        arrList.add(new MonAn("Ốc nhảy",100.000,R.drawable.logoutechuan));
        arrList.add(new MonAn("Ốc nhảy",100.000,R.drawable.logoutechuan));

        MonAnAdapter monAnAdapter= new MonAnAdapter(
                MonAnListView.this,
                R.layout.dong,
                arrList

        );
        lviewMonAn.setAdapter(monAnAdapter);

    }
}