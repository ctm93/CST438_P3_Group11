package com.example.cst438_p3_group11;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest extends AsyncTask<Void, Void, String> {

    private static final String TAG = "HttpRequestClass";
    String URL;
    String REQUEST_METHOD;
    static final int READ_TIMEOUT = 15000;
    static final int CONNECTION_TIMEOUT = 15000;

    public HttpRequest(String url, String method) {
        URL = url;
        REQUEST_METHOD = method;
    }

    @Override
    protected String doInBackground(Void... params){
        String result;
        String inputLine;

        try {
            // connect to the server
            URL myUrl = new URL(URL);
            HttpURLConnection connection =(HttpURLConnection) myUrl.openConnection();
            connection.setRequestMethod(REQUEST_METHOD);
            connection.setReadTimeout(READ_TIMEOUT);
            connection.setConnectTimeout(CONNECTION_TIMEOUT);
            connection.connect();

            // get the string from the input stream
            InputStreamReader streamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder stringBuilder = new StringBuilder();
            while((inputLine = reader.readLine()) != null){
                stringBuilder.append(inputLine);
            }
            reader.close();
            streamReader.close();
            result = stringBuilder.toString();

        } catch(IOException e) {
            e.printStackTrace();
            result = "error";
        }

        return result;
    }

    protected void onPostExecute(String result){
        super.onPostExecute(result);
        Log.d(TAG, "onPostExecute: " + result);
    }
}
