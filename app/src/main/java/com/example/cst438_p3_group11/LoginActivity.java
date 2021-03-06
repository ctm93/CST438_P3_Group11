package com.example.cst438_p3_group11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin, mBack;
    IntentFactory factory = new IntentFactory();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connectElements();
    }

    private void connectElements() {
        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        mLogin = findViewById(R.id.login_button);
        mBack = findViewById(R.id.btnBackToHomeLogin);

        mLogin.setOnClickListener(v -> login());
        mBack.setOnClickListener(v -> back());
    }

    private void login() {
        String username = mUsername.getEditableText().toString();
        String password = mPassword.getEditableText().toString();

        if(validate(username, password)) {
            Intent intent = factory.getIntent(getApplicationContext(), Home.class);
            intent.putExtra(Utils.USERNAME_KEY, username);
            startActivity(intent);
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    "Login Failed",
                    Toast.LENGTH_SHORT)
                    .show();
        }
    }

    private void back() {
        startActivity(factory.getIntent(this, MainActivity.class));
    }

    public Boolean validate(String username, String password) {
        return Utils.login(username, password);
    }

}




