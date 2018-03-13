package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyCarTest {
    private ToyCar car;

    @BeforeEach
    void setUp() {
        car = new ToyCar(Size.SMALL, Age.BABY, true);
    }

    @Test
    void isCargo() {
        assertTrue(car.isCargo());
        car.setCargo(false);
        assertFalse(car.isCargo());
    }

    @Test
    void getToyType() {
        assertEquals(ToyType.CAR, car.getToyType());
    }
}