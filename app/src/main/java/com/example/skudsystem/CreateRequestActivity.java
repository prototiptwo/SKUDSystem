package com.example.skudsystem;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CreateRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_request);

        findViewById(R.id.btnSubmit).setOnClickListener(v -> finish());
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
