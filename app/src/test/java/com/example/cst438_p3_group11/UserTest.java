package com.example.cst438_p3_group11;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
    @Test
    public void getUsername() {
        User user1 = new User();
        user1.setUsername("user1");
        assertEquals("user1", user1.getUsername());
        assertNotEquals("user2", user1.getUsername());
    }

    @Test
    public void setUsername() {
        User user1 = new User();
        user1.setUsername("user1");
        assertEquals("user1", user1.getUsername());
        user1.setUsername("user2");
        assertNotEquals("user1", user1.getUsername());
    }

    @Test
    public void getPassword() {
        User user1 = new User();
        user1.setPassword("pass1");
        assertEquals("pass1", user1.getPassword());
        assertNotEquals("pass2", user1.getPassword());
    }

    @Test
    public void setPassword() {
        User user1 = new User();
        user1.setPassword("pass1");
        assertEquals("pass1", user1.getPassword());
        user1.setPassword("pass2");
        assertEquals("pass2", user1.getPassword());
    }
}
