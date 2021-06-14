package com.quickqart.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Signup_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
//        getSupportActionBar().hide();
//        getSupportActionBar().setTitle("Signup Form");
    }


    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }

}