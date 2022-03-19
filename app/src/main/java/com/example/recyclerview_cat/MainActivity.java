package com.example.recyclerview_cat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_cat.RV.User;
import com.example.recyclerview_cat.RV.UserAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> users= new ArrayList<>();
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));
        users.add(new User(R.drawable.ic_launcher_background,"Amany"));

        recyclerView=findViewById(R.id.rv);
        UserAdapter adapter= new UserAdapter(users);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}