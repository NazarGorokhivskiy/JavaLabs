package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoopTest {
    private Hoop hoop;

    @BeforeEach
    void setUp() {
        hoop = new Hoop(Size.SMALL, Age.SCHOOLER, SportName.GYMNASTICS, 42);
    }

    @Test
    void getRadius() {
        assertEquals(42, hoop.getRadius());
        hoop.setRadius(29);
        assertEquals(29, hoop.getRadius());
    }

    @Test
    void getToyType() {
        assertEquals(ToyType.HOOP, hoop.getToyType());
    }
}