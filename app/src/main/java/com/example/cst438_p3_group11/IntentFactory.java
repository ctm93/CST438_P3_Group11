package com.example.cst438_p3_group11;

import android.content.Context;
import android.content.Intent;

public class IntentFactory {

    //Use getIntent to get an object of type Intent
    public static Intent getIntent(Context context, Class destination) {
        return new Intent(context, destination);
    }

}
