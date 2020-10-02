package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
   Button jbtnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        jbtnReset= (Button) findViewById(R.id.btnReset);
        jbtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parent= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(parent);
            }
        });
    }
}