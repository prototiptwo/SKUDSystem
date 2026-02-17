package com.example.skudsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        findViewById(R.id.btnManageRequests).setOnClickListener(v ->
                startActivity(new Intent(this, AdminRequestsActivity.class)));

        findViewById(R.id.btnManageUsers).setOnClickListener(v ->
                startActivity(new Intent(this, AdminUsersActivity.class)));

        findViewById(R.id.btnLogout).setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}
