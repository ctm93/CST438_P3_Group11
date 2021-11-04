package com.example.cst438_p3_group11;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import static org.junit.Assert.*;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SignUpActivityTest {
    private SignUpActivity mSignUpActivity;

    @Before
    public void createSignUpActivity() {
        mSignUpActivity = new SignUpActivity();
    }

    @Test
    public void signUpValidation_test() {
        String username1 = "user1";
        String password1 = "pass1";
        String username2 = "user2";
        String password2 = "pass2";
        assertTrue(mSignUpActivity.validate(username1, password1));
        assertFalse(mSignUpActivity.validate(username1, password1));
        assertFalse(mSignUpActivity.validate(username2, null));
        assertFalse(mSignUpActivity.validate(null, password2));
    }

}
