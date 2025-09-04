/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesappproject;

/**
 *
 * @author olwet
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeriesManagerTest {
    private SeriesManager manager;

    @BeforeEach
    void setUp() {
        manager = new SeriesManager();
        manager.addSeries(new Series(101, "Extreme Sports", 12, 10));
        manager.addSeries(new Series(102, "Dragon Hunters", 10, 12));
    }

    @Test
    void TestSearchSeries() {
        Series s = manager.findSeriesById(101);
        assertNotNull(s);
        assertEquals("Extreme Sports", s.getSeriesName());
        assertEquals(12, s.getAgeRestriction());
    }

    @Test
    void TestSearchSeries_SeriesNotFound() {
        Series s = manager.findSeriesById(999);
        assertNull(s, "Series should not be found");
    }

    @Test
    void TestUpdateSeries() {
        boolean updated = manager.updateSeriesById(102, "Dragon Hunters Reloaded", 13, 15);
        assertTrue(updated);
        Series s = manager.findSeriesById(102);
        assertEquals("Dragon Hunters Reloaded", s.getSeriesName());
        assertEquals(13, s.getAgeRestriction());
        assertEquals(15, s.getNumEpisodes());
    }

    @Test
    void TestDeleteSeries() {
        boolean deleted = manager.deleteSeriesById(101);
        assertTrue(deleted);
        assertNull(manager.findSeriesById(101));
    }

    @Test
    void TestDeleteSeries_SeriesNotFound() {
        boolean deleted = manager.deleteSeriesById(999);
        assertFalse(deleted);
    }

    @Test
    void TestSeriesAgeRestriction_AgeValid() {
        assertTrue(manager.isAgeRestrictionValid(15));
        assertTrue(manager.isAgeRestrictionValid(0));
        assertTrue(manager.isAgeRestrictionValid(21));
    }

    @Test
    void TestSeriesAgeRestriction_SeriesAgelnValid() {
        assertFalse(manager.isAgeRestrictionValid(-1));
        assertFalse(manager.isAgeRestrictionValid(25));
    }
}
