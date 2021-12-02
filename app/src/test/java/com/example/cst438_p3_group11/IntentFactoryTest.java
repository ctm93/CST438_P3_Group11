package com.example.cst438_p3_group11;

import org.junit.Test;
import static org.junit.Assert.*;

import android.content.Intent;

public class IntentFactoryTest {

    @Test(expected = NullPointerException.class)
    public void testIntentFactory() {
        // Instantiating the activity is what throws the NullPointerException
        MainActivity activity = new MainActivity();
        Intent intent1 = new Intent(activity, MainActivity.class);
        IntentFactory factory = new IntentFactory();
        Intent intent2 = factory.getIntent(activity, MainActivity.class);
        Intent intent3 = new Intent(activity, LoginActivity.class);

        assertEquals(intent1.getAction(), intent2.getAction());
        assertNotEquals(intent2.getAction(), intent3.getAction());
    }
}
