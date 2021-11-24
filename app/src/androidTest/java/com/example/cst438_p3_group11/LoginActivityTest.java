package com.example.cst438_p3_group11;

import static androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread;

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
    public void createLoginActivity() throws Throwable{
        runOnUiThread(new Runnable() {
            public void run() {
                mLoginActivity = new LoginActivity();
            }
        });
    }

    @Test
    public void validate_test() {
        String username1 = "user1";
        String password1 = "pass1";
        assertTrue(mLoginActivity.validate(username1, password1));
        assertFalse(mLoginActivity.validate(username1, null));
        assertFalse(mLoginActivity.validate(null, password1));
    }

}
