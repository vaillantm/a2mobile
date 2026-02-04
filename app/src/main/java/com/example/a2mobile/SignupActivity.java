package com.example.a2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText inputName = findViewById(R.id.inputName);
        EditText inputEmail = findViewById(R.id.inputEmail);
        EditText inputPassword = findViewById(R.id.inputPassword);
        RadioGroup radioRole = findViewById(R.id.radioRole);
        CheckBox checkTerms = findViewById(R.id.checkTerms);
        Button btnCreate = findViewById(R.id.btnCreate);
        TextView linkLogin = findViewById(R.id.linkLogin);

        btnCreate.setOnClickListener(v -> {
            String name = inputName.getText().toString().trim();
            String email = inputEmail.getText().toString().trim();
            String password = inputPassword.getText().toString().trim();

            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please fill out all required fields", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!checkTerms.isChecked()) {
                Toast.makeText(this, "Please accept the terms", Toast.LENGTH_SHORT).show();
                return;
            }

            String role = "Member";
            int selectedId = radioRole.getCheckedRadioButtonId();
            if (selectedId == R.id.radioStudent) {
                role = "Student";
            } else if (selectedId == R.id.radioInstructor) {
                role = "Instructor";
            }

            Toast.makeText(this, "Account created", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(DetailsActivity.EXTRA_NAME, name);
            intent.putExtra(DetailsActivity.EXTRA_EMAIL, email);
            intent.putExtra(DetailsActivity.EXTRA_ROLE, role);
            startActivity(intent);
        });

        linkLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
