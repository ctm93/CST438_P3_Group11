package com.example.cst438_p3_group11;

import static androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

import android.content.Context;
import android.os.Looper;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SignUpActivityTest {
    private SignUpActivity mSignUpActivity;

    @Before
    public void createSignUpActivity() throws Throwable {
        runOnUiThread(new Runnable() {
            public void run() {
                mSignUpActivity = new SignUpActivity();
            }
        });
    }

    @Test
    public void signUpValidation_test() {
        String username1 = "user1";
        String password1 = "pass1";
        assertTrue(mSignUpActivity.validate(username1, password1));
        assertFalse(mSignUpActivity.validate(username1, null));
        assertFalse(mSignUpActivity.validate(null, password1));
    }

}
