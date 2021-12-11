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
public class AddUserPlantActivityTest {
    private AddUserPlantActivity mAddUserPlantActivity;

    @Before
    public void createAddUserPlantActivity() throws Throwable{
        runOnUiThread(new Runnable() {
            public void run() {
                mAddUserPlantActivity = new AddUserPlantActivity();
            }
        });
    }

    @Test
    public void validate_test() {
        String name1 = "plant1";
        String desc1 = "desc1";
        String notes1 = "notes1";
        String water1 = "waterCycle1";
        String fert1 = "fertCycle1";
        assertTrue(mAddUserPlantActivity.validate(name1, desc1, notes1, water1, fert1));
        assertFalse(mAddUserPlantActivity.validate(name1, null, notes1, water1, fert1));
        assertFalse(mAddUserPlantActivity.validate(null, desc1, notes1, water1, fert1));
        assertFalse(mAddUserPlantActivity.validate(name1, desc1, null, water1, fert1));
        assertFalse(mAddUserPlantActivity.validate(name1, desc1, notes1, null, fert1));
        assertFalse(mAddUserPlantActivity.validate(name1, desc1, notes1, water1, null));
    }

}
