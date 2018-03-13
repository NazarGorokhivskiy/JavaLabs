package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollTest {

    private Doll doll;

    @BeforeEach
    void setUp() {
        doll = new Doll(Size.SMALL, Age.SCHOOLER, Sex.MALE);
    }

    @Test
    void getSex() {
        assertEquals(Sex.MALE, doll.getSex());
        doll.setSex(Sex.FEMALE);
        assertEquals(Sex.FEMALE, doll.getSex());
    }

    @Test
    void getToyType() {
        assertEquals(ToyType.DOLL, doll.getToyType());
    }
}