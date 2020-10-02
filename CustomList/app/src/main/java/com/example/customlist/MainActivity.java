package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvPhone;
ArrayList<Phone> arrayPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPhone=(ListView) findViewById(R.id.lvPhone);
        arrayPhone= new ArrayList<Phone>();
        arrayPhone.add(new Phone("Iphone 7","5000000" ));
        arrayPhone.add(new Phone("Iphone 8","7000000" ));
        arrayPhone.add(new Phone("Iphone 8s","9000000" ));
        arrayPhone.add(new Phone("Iphone 12","35000000" ));
        arrayPhone.add(new Phone("Samsung j9 Prime","6000000" ));
        arrayPhone.add(new Phone("Iphone XS","15000000" ));
        arrayPhone.add(new Phone("Iphone 11 Pro Max","18000000" ));

        PhoneAdapter phoneAdapter= new PhoneAdapter(MainActivity.this,R.layout.phoneui,arrayPhone);
        lvPhone.setAdapter(phoneAdapter);

    }
}