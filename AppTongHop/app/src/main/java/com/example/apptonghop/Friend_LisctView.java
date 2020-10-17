package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Friend_LisctView extends AppCompatActivity {
    ListView lviewFriend;
    List<Friends> arrList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend__lisct_view);
        lviewFriend=findViewById(R.id.lvFriend);
        arrList= new ArrayList<Friends>();
        arrList.add(new Friends("Huỳnh Nghĩa",20,R.drawable.anh2));
        arrList.add(new Friends("Huỳnh Nghĩa",20,R.drawable.anh1));
        arrList.add(new Friends("Huỳnh Nghĩa",20,R.drawable.anh2));
        arrList.add(new Friends("Huỳnh Nghĩa",20,R.drawable.anh1));
        FriendsAdapter friendsAdapter= new FriendsAdapter(Friend_LisctView.this,R.layout.dong,arrList);
        lviewFriend.setAdapter(friendsAdapter);

    }
}