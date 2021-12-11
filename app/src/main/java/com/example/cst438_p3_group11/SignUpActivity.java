package com.example.cst438_p3_group11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.core.Tag;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {

    // Function to ensure all information was input.
    public Boolean validate(String username, String password) {
        if(username != null && password != null) {
            return true;
        } else {
            return false;
        }
    }

    EditText username1, password1;
    Button btnRegister, btnBacktoHome;

    IntentFactory factory = new IntentFactory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username1 = findViewById(R.id.etUsername);
        password1 = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnBacktoHome = findViewById(R.id.btnBackToHome);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = username1.getText().toString();
                String password = password1.getText().toString();
                String result = Utils.signUp(username, password);
                if(result.equals("New user added") || result.equals("")) {
                    Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                } else {
                   Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBacktoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(factory.getIntent(SignUpActivity.this, MainActivity.class));
            }
        });

    }
}
