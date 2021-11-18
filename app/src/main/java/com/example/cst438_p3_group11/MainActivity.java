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

        // Intent Factory for buttons.
        IntentFactory factory = new IntentFactory();

        connectElements();
        onClickMethods(factory);
    }

    private void onClickMethods(IntentFactory factory) {
        loginButton.setOnClickListener(v -> {
            Intent intent = factory.getIntent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(), "Login Button Clicked", Toast.LENGTH_SHORT).show();
        });

        signUpButton.setOnClickListener(v -> {
            Intent intent = factory.getIntent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(), "Sign Up Button Clicked", Toast.LENGTH_SHORT).show();
        });
    }

    private void connectElements() {
        loginButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.signup_button);
    }

}