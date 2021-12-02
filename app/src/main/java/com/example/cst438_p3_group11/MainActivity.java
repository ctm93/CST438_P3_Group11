package com.example.cst438_p3_group11;

import androidx.appcompat.app.AppCompatActivity;

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
        loginButton.setOnClickListener(v -> startActivity(IntentFactory.getIntent(this, LoginActivity.class)));

        signUpButton.setOnClickListener(v -> startActivity(IntentFactory.getIntent(this, SignUpActivity.class)));
    }

    private void connectElements() {
        loginButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.signup_button);
    }

}