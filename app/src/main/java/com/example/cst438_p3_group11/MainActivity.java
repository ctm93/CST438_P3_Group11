package com.example.cst438_p3_group11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectElements();
        onClickMethods();
    }

    private void onClickMethods() {
        loginButton.setOnClickListener(v -> {
            //TODO: Change to Login Activity
            Toast.makeText(getApplicationContext(), "Login Button Clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });

        signUpButton.setOnClickListener(v -> {
            //TODO: Change to Sign Up Activity
            Toast.makeText(getApplicationContext(), "Sign Up Button Clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });
    }

    private void connectElements() {
        loginButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.signup_button);
    }

}