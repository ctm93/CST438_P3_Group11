package com.example.cst438_p3_group11;

public class LoginActivity {
    public Boolean validate(String username, String password) {
        //TODO: Check if user in database.
        //Test User:
        //Note: Change to whatever the admin user info is later.
        User test1 = new User("user1", "pass1");
        if(username.equals(test1.getUsername())) {
            if(password.equals(test1.getPassword())) {
                return true;
            }
        }

        return false;
    }

}




