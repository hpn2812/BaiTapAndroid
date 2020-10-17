package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileApp extends AppCompatActivity {
    TextView logout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_app);
        logout= findViewById(R.id.txtEditProfile);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogout();
            }
        });
        button=findViewById(R.id.btnDetail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDanhSach();
            }
        });
    }

    private void openLogout() {
        Intent it= new Intent(this,MainActivity.class);
        startActivity(it);
        finish();
        Toast.makeText(this,"Logout Successful",Toast.LENGTH_SHORT).show();
    }

    private void openDanhSach() {
        Intent it= new Intent(this,Friend_LisctView.class);
        startActivity(it);
    }
}