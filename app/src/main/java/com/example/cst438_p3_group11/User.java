package com.example.cst438_p3_group11;

public class User {
    String username;
    String password;

    User() {
        this.username = null;
        this.password = null;
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
