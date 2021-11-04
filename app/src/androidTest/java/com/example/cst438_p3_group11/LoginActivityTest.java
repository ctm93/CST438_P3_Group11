package com.example.cst438_p3_group11;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import static org.junit.Assert.*;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {
    private LoginActivity mLoginActivity;

    @Before
    public void createLoginActivity() {
        mLoginActivity = new LoginActivity();
    }

    @Test
    public void validate_test() {
        String username1 = "user1";
        String password1 = "pass1";
        String username2 = "user2";
        String password2 = "pass2";
        User user1 = new User(username1, password1);
        assertTrue(mLoginActivity.validate(username1, password1));
        assertFalse(mLoginActivity.validate(username1, password2));
        assertFalse(mLoginActivity.validate(username2, password1));
    }

}
