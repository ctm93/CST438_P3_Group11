package com.example.cst438_p3_group11;

import android.os.AsyncTask;
import android.util.Log;

public class Utils {
    private static String URL = "http://10.0.2.2:3000/";

    public static String login(String username, String password) {
        String url = URL + "?username=" + username + "&password=" + password;
        HttpRequest request = new HttpRequest("http://10.0.2.2:3000/", "GET");
        String result = request.doInBackground();
        return result.toString();
    }

}
