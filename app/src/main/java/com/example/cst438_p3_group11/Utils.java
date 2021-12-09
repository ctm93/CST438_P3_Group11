package com.example.cst438_p3_group11;

import android.os.AsyncTask;
import android.util.Log;

import com.example.cst438_p3_group11.Plants.PublicPlant;
import com.example.cst438_p3_group11.Plants.UserPlant;

import java.util.ArrayList;

public class Utils {
    public static String USERNAME_KEY = "com.example.cst438_p3_group11.USERNAME_KEY";
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
        return tokens[0].equals(username) && tokens[1].equals(password);
    }

    public static ArrayList<PublicPlant> getPublicPlants() {
        ArrayList<PublicPlant> plants = new ArrayList<>();

        String url = SERVER + "/getPlants";
        HttpRequest request = new HttpRequest(url, "GET");
        String result;
        try {
            result = request.execute().get();
        } catch (Exception e) {
            return null;
        }
        String[] tokens = result.split("/");
        for(String t: tokens) {
            String[] plantInfo = t.split(";");
            String name = plantInfo[0];
            Integer id = Integer.parseInt(plantInfo[1]);
            String username = plantInfo[2];
            String description = plantInfo[3];
            plants.add(new PublicPlant(id, username, name, description));
        }
        return plants;
    }

    public static ArrayList<UserPlant> getUserPlants(String username) {
        ArrayList<UserPlant> plants = new ArrayList<>();

        String url = SERVER + "/getMyPlants";
        HttpRequest request = new HttpRequest(url, "GET");
        String result;
        try {
            result = request.execute().get();
        } catch (Exception e) {
            return null;
        }

        String[] tokens = result.split("/");
        for(String t: tokens) {
            String [] plantInfo = t.split(";");
            String name = plantInfo[0];
            if(!username.equals(plantInfo[1])) {
                continue;
            }
            String description = plantInfo[2];
            String notes = plantInfo[3];
            String waterCycle = plantInfo[4];
            String fertilizeCycle = plantInfo[5];
            plants.add(new UserPlant(name, description, notes, waterCycle, fertilizeCycle));
        }
        return plants;
    }


}
