package com.example.cst438_p3_group11;

import static org.junit.Assert.*;

import com.example.cst438_p3_group11.Plants.UserPlant;

import org.junit.Test;

public class UserPlantTest {

    @Test
    public void getmUserId() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals(1, plant1.getmUserId());
        assertNotEquals(2, plant1.getmUserId());
    }

    @Test
    public void setmUserId() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals(1, plant1.getmUserId());
        plant1.setmUserId(2);
        assertEquals(2, plant1.getmUserId());
        assertNotEquals(1, plant1.getmUserId());
    }

    @Test
    public void getmPlantName() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("name", plant1.getmPlantName());
        assertNotEquals("pass", plant1.getmPlantName());
    }

    @Test
    public void setmPlantName() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("name", plant1.getmPlantName());
        plant1.setmPlantName("pass");
        assertEquals("pass", plant1.getmPlantName());
        assertNotEquals("name", plant1.getmPlantName());
    }

    @Test
    public void getmDescription() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("desc", plant1.getmDescription());
        assertNotEquals("pass", plant1.getmDescription());
    }

    @Test
    public void setmDescription() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("desc", plant1.getmDescription());
        plant1.setmDescription("pass");
        assertEquals("pass", plant1.getmDescription());
        assertNotEquals("desc", plant1.getmDescription());
    }

    @Test
    public void getmNotes() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("notes", plant1.getmNotes());
        assertNotEquals("pass", plant1.getmNotes());
    }

    @Test
    public void setmNotes() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("notes", plant1.getmNotes());
        plant1.setmNotes("pass");
        assertEquals("pass", plant1.getmNotes());
        assertNotEquals("notes", plant1.getmNotes());
    }

    @Test
    public void getmWateringCycle() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("water", plant1.getmWateringCycle());
        assertNotEquals("pass", plant1.getmWateringCycle());
    }

    @Test
    public void setmWateringCycle() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("water", plant1.getmWateringCycle());
        plant1.setmWateringCycle("pass");
        assertEquals("pass", plant1.getmWateringCycle());
        assertNotEquals("water", plant1.getmWateringCycle());
    }

    @Test
    public void getmFertilizeCycle() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("fert", plant1.getmFertilizeCycle());
        assertNotEquals("pass", plant1.getmFertilizeCycle());
    }

    @Test
    public void setmFertilizeCycle() {
        UserPlant plant1 = new UserPlant(1, "name", "desc", "notes", "water", "fert");
        assertEquals("fert", plant1.getmFertilizeCycle());
        plant1.setmFertilizeCycle("pass");
        assertEquals("pass", plant1.getmFertilizeCycle());
        assertNotEquals("fert", plant1.getmFertilizeCycle());
    }
}