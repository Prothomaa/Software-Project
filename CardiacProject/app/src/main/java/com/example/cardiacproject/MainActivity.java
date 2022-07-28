package com.example.cardiacproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    RecyclerView recyclerView ;
    RecyclerContactAdapter adapter;
    FloatingActionButton btnOpenDialog ;
    String dateAndTime ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerview);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);

        Calendar calendar = calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateAndTime = simpleDateFormat.format(calendar.getTime());



        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.edtName);
                //EditText edtDate = dialog.findViewById(R.id.edtDate);
                EditText edtSystolic = dialog.findViewById(R.id.edtSys);
                EditText edtDiastolic = dialog.findViewById(R.id.edtDias);
                EditText edtHeart = dialog.findViewById(R.id.edtHeart);
                Button btnAction = dialog.findViewById(R.id.btnAction);


                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = edtName.getText().toString();
                        //String date = edtDate.getText().toString();
                        //String date = edtDate.setText(dateAndTime);
                        String systolic = edtSystolic.getText().toString();
                        String diastolic = edtDiastolic.getText().toString();
                        String heart = edtHeart.getText().toString();


                        arrContacts.add(new ContactModel(name,dateAndTime,systolic,diastolic,heart));
                        adapter.notifyItemInserted(arrContacts.size()-1);

                        recyclerView.scrollToPosition(arrContacts.size()-1);

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);


    }
}