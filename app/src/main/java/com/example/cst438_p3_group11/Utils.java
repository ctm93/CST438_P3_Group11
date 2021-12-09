package com.example.cst438_p3_group11;

import android.os.AsyncTask;
import android.util.Log;

public class Utils {
    private static String SERVER = "http://192.168.1.38:3000";

    public static Boolean login(String username, String password) {

        if(username.length() <= 0 && password.length() <= 0) {
            return false;
        }

        String url = SERVER + "/login?username=" + username;
        HttpRequest request = new HttpRequest(url, "GET");
        String result;
        try {
            result = request.execute().get();
        } catch(Exception e) {
            return false;
        }
        String[] tokens = result.split(" ");
        if(tokens.length < 2) {
            return false;
        }
        if(tokens[0].equals(username) && tokens[1].equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}
