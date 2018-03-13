package ua.lviv.iot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyTest {
    private Toy toy1;
    private Toy toy2;

    @BeforeEach
    void setUp() {
        toy1 = new Doll(Size.BIG, Age.SCHOOLER, Sex.FEMALE);
        toy2 = new Doll(Size.SMALL, Age.PRESCHOOLER, Sex.FEMALE);
    }

    @Test
    void compareTo() {
        assertEquals(-1, toy1.compareTo(toy2));
        toy1.setAge(Age.BABY);
        assertEquals(1, toy1.compareTo(toy2));
    }

    @Test
    void setPrice() {
        toy1.setPrice(228);
        assertEquals(228, toy1.getPrice());
    }

    @Test
    void getSize() {
        assertEquals(Size.BIG, toy1.getSize());
        assertEquals(Size.SMALL, toy2.getSize());
    }
}