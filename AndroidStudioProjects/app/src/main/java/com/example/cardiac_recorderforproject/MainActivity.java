package com.example.cardiac_recorderforproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userlist;
    Adapter adapter;

/*
    EditText person_name;
    EditText dateTime;
    EditText systolic;
    EditText diastolic;
    EditText heart;
    EditText comment;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        person_name = (EditText) findViewById(R.id.editText_name);
        dateTime = (EditText) findViewById(R.id.editText_date);
        systolic = (EditText) findViewById(R.id.systolic);
        diastolic = (EditText) findViewById(R.id.diastolic);
        heart = (EditText) findViewById(R.id.heart);
        comment = (EditText) findViewById(R.id.comment);*/
        initData();
        initRecyclerView();

    }


    private void initData() {
/*
        person_name = (EditText) findViewById(R.id.editText_name);
        dateTime = (EditText) findViewById(R.id.editText_date);
        systolic = (EditText) findViewById(R.id.systolic);
        diastolic = (EditText) findViewById(R.id.diastolic);
        heart = (EditText) findViewById(R.id.heart);
        comment = (EditText) findViewById(R.id.comment);

        String str1 = person_name.getText().toString();
        String str2 = dateTime.getText().toString();
        String str3 = systolic.getText().toString();
        String str4 = diastolic.getText().toString();
        String str5 = heart.getText().toString();
        String str6 = comment.getText().toString();
        userlist = new ArrayList<>();
        userlist.add(new ModelClass(str1, str2, str3, str4, str5, str6));*/
        userlist=new ArrayList<>();
        userlist.add(new ModelClass("protiva","7:30 PM","Low Pressure","______________________________"));
        userlist.add(new ModelClass("protiva","7:30 PM","Low Pressure","______________________________"));
        userlist.add(new ModelClass("protiva","7:30 PM","Low Pressure","______________________________"));
        userlist.add(new ModelClass("protiva","7:30 PM","Low Pressure","______________________________"));
        userlist.add(new ModelClass("protiva","7:30 PM","Low Pressure","______________________________"));


    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void adding(View view) {
        Intent intent = new Intent(MainActivity.this, AddActivity.class);
        startActivity(intent);
    }
        /*
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_add);


        EditText person_name = dialog.findViewById(R.id.editText_name);
        EditText dateTime = dialog.findViewById(R.id.editText_date);
        EditText systolic = dialog.findViewById(R.id.systolic);
        EditText diastolic = dialog.findViewById(R.id.diastolic);
        EditText heart = dialog.findViewById(R.id.heart);
        EditText comment = dialog.findViewById(R.id.comment);
        Button confirmButton = dialog.findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = person_name.getText().toString();
                String str2 = dateTime.getText().toString();
                String str3 = systolic.getText().toString();
                String str4 = diastolic.getText().toString();
                String str5 = heart.getText().toString();
                String str6 = comment.getText().toString();

                userlist=new ArrayList<>();
                userlist.add(new ModelClass(str1,str2,str3,str4,str5,str6));
                adapter.notifyItemInserted(userlist.size()-1);
                recyclerView.scrollToPosition(userlist.size()-1);
            }
        });
        dialog.show();
    }
}*/
}

