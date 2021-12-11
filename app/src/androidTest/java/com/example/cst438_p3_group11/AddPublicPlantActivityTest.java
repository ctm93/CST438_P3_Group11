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
public class AddPublicPlantActivityTest {
    private AddPublicPlantActivity mAddPublicPlantActivity;

    @Before
    public void createAddPublicPlantActivity() throws Throwable{
        runOnUiThread(new Runnable() {
            public void run() {
                mAddPublicPlantActivity = new AddPublicPlantActivity();
            }
        });
    }

    @Test
    public void validate_test() {
        String name1 = "plant1";
        String desc1 = "desc1";
        assertTrue(mAddPublicPlantActivity.validate(name1, desc1));
        assertFalse(mAddPublicPlantActivity.validate(name1, null));
        assertFalse(mAddPublicPlantActivity.validate(null, desc1));
    }

}
