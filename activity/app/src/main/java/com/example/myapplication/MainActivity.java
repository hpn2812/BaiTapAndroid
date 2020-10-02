package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button jbtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jbtnChange=(Button)findViewById(R.id.btnChange);
        jbtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent child= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(child);
            }
        });
    }
}