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
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        signUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });

        loginButton.setOnLongClickListener(v -> {
            //TODO: Remove after login activity is completed
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
            return true;
        });
    }

    private void connectElements() {
        loginButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.signup_button);
    }

}