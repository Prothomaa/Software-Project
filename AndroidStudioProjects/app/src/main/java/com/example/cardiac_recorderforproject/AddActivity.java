package com.example.cardiac_recorderforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText person_name ;
    EditText dateTime ;
    EditText systolic ;
    EditText diastolic ;
    EditText heart ;
    EditText comment ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

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

        final Button confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dialog dialog = new Dialog(AddActivity.this);
                Intent intent=new Intent(AddActivity.this,MainActivity.class);
                intent.putExtra("personName1",str1);
                intent.putExtra("personName2",str2);
                intent.putExtra("personName3",str3);
                intent.putExtra("personName4",str4);
                intent.putExtra("personName5",str5);
                intent.putExtra("personName6",str6);
                startActivity(intent);
                finish();
            }
        });
    }
}