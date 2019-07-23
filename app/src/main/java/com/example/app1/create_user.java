package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toolbar;

import java.util.ArrayList;

public class create_user extends AppCompatActivity {

Toolbar toolUser;
Spinner spinerGen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        getSupportActionBar().setTitle("Create User");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// action back quay lai activity cu
        addtroll();
    }

    private void addtroll() {
        spinerGen = findViewById(R.id.spinerGen);
        ArrayList<String> arrGen = new ArrayList<String>();
        arrGen.add("Nam");
        arrGen.add("Nữ");
        ArrayAdapter adapter = new ArrayAdapter(create_user.this,android.R.layout.simple_list_item_1,arrGen);
        spinerGen.setAdapter(adapter);
    }
}
