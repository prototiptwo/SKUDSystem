package com.example.skudsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Spinner roleSpinner;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        roleSpinner = findViewById(R.id.roleSpinner);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(v -> {
            String role = roleSpinner.getSelectedItem().toString();

            if (role.equals("Администратор")) {
                startActivity(new Intent(this, AdminDashboardActivity.class));
            } else if (role.equals("Исполнитель")) {
                startActivity(new Intent(this, ExecutorDashboardActivity.class));
            } else {
                startActivity(new Intent(this, ClientDashboardActivity.class));
            }
        });

        btnRegister.setOnClickListener(v ->
                startActivity(new Intent(this, RegisterActivity.class)));
    }
}
