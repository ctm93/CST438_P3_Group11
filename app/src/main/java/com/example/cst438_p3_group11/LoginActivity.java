package com.example.cst438_p3_group11;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public Boolean validate(String username, String password) {
        if(username != null && password != null) {
            return true;
        }
        return false;
    }

}




