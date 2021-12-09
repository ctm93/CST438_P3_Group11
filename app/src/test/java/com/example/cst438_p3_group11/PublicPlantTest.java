package com.example.cst438_p3_group11;

import static org.junit.Assert.*;

import com.example.cst438_p3_group11.Plants.PublicPlant;

import junit.framework.TestCase;

import org.junit.Test;

public class PublicPlantTest {

    @Test
    public void getPlantId() {
        PublicPlant plant1 = new PublicPlant(1, "1", "1", "1");
        assertEquals(1, plant1.getPlantId());
        assertNotEquals(2, plant1.getPlantId());
    }

    @Test
    public void setPlantId() {
        PublicPlant plant1 = new PublicPlant(1, "1", "1", "1");
        assertEquals(1, plant1.getPlantId());
        plant1.setPlantId(2);
        assertEquals(2, plant1.getPlantId());
        assertNotEquals(1, plant1.getPlantId());
    }

    @Test
    public void getUsername() {
        PublicPlant plant1 = new PublicPlant(1, "name", "1", "1");
        assertEquals("name", plant1.getUsername());
        assertNotEquals("pass", plant1.getUsername());
    }

    @Test
    public void setUsername() {
        PublicPlant plant1 = new PublicPlant(1, "name", "1", "1");
        assertEquals("name", plant1.getUsername());
        plant1.setUsername("pass");
        assertNotEquals("name", plant1.getUsername());
        assertEquals("pass", plant1.getUsername());
    }

    @Test
    public void getPlantName() {
        PublicPlant plant1 = new PublicPlant(1, "1", "plant name", "1");
        assertEquals("plant name", plant1.getPlantName());
        assertNotEquals("name", plant1.getPlantName());
    }

    @Test
    public void setPlantName() {
        PublicPlant plant1 = new PublicPlant(1, "1", "plant name", "1");
        assertEquals("plant name", plant1.getPlantName());
        plant1.setPlantName("name");
        assertEquals("name", plant1.getPlantName());
        assertNotEquals("plant name", plant1.getPlantName());
    }

    @Test
    public void getDescription() {
        PublicPlant plant1 = new PublicPlant(1, "1", "plant name", "desc");
        assertEquals("desc", plant1.getDescription());
        assertNotEquals("name", plant1.getDescription());
    }

    @Test
    public void setDescription() {
        PublicPlant plant1 = new PublicPlant(1, "1", "plant name", "desc");
        assertEquals("desc", plant1.getDescription());
        plant1.setDescription("plant desc");
        assertNotEquals("desc", plant1.getDescription());
        assertEquals("plant desc", plant1.getDescription());
    }

}