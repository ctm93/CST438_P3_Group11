package com.example.cst438_p3_group11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin;

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

        mLogin.setOnClickListener(v -> login());
    }

    private void login() {
        String username = mUsername.getEditableText().toString();
        String password = mPassword.getEditableText().toString();

        //TODO Remove toast
        Toast.makeText(getApplicationContext(), username + " " + password, Toast.LENGTH_SHORT).show();
        if(validate(username, password)) {
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        }
    }

    //TODO Use api to check username and password
    public Boolean validate(String username, String password) {
        if(username != null && password != null) {
            return true;
        }
        return false;
    }

}




