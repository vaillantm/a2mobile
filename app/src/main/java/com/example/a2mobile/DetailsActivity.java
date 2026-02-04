package com.example.a2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_EMAIL = "extra_email";
    public static final String EXTRA_ROLE = "extra_role";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textName = findViewById(R.id.textName);
        TextView textEmail = findViewById(R.id.textEmail);
        TextView textRole = findViewById(R.id.textRole);
        Button btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_NAME);
        String email = intent.getStringExtra(EXTRA_EMAIL);
        String role = intent.getStringExtra(EXTRA_ROLE);

        if (name != null && !name.isEmpty()) {
            textName.setText(name);
        }
        if (email != null && !email.isEmpty()) {
            textEmail.setText(email);
        }
        if (role != null && !role.isEmpty()) {
            textRole.setText(role);
        }

        btnBack.setOnClickListener(v -> {
            Intent backIntent = new Intent(this, LoginActivity.class);
            startActivity(backIntent);
            finish();
        });
    }
}
