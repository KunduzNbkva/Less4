package com.example.less4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IOnclickListener {
    ArrayList<Person> people=new ArrayList<Person>();
    Person p = new Person("Беккулу",12,55.0,50.0,"student");
    Person b = new Person("Сайкал",12,55.0,50.0,"student");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        MainAdapter adapter=new MainAdapter();
        people.add(p);
        people.add(b);
        adapter.listener=this;
        recyclerView.setAdapter(adapter);
    }
    public void openSecond(String text){
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("key",text);
        startActivity(intent);
    }

    @Override
    public void onClick(String s) {
        Log.d("ololo","MA on Click"+s);
        openSecond(s);

    }




}
