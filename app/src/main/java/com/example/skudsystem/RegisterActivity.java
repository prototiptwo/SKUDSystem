package com.example.skudsystem;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    Button btnRegister, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegisterUser);
        btnBack = findViewById(R.id.btnBack);

        btnRegister.setOnClickListener(v -> finish());
        btnBack.setOnClickListener(v -> finish());
    }
}
