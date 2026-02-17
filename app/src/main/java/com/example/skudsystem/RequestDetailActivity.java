package com.example.skudsystem;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RequestDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_detail);

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
