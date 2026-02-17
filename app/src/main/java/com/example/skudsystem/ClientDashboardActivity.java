package com.example.skudsystem;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ClientDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_dashboard);

        findViewById(R.id.btnCreateRequest).setOnClickListener(v ->
                startActivity(new Intent(this, CreateRequestActivity.class)));

        findViewById(R.id.btnOpenRequest).setOnClickListener(v ->
                startActivity(new Intent(this, RequestDetailActivity.class)));

        findViewById(R.id.btnLogout).setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}
