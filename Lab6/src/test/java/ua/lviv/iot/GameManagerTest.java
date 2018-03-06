package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    private GameManager gameManager = new GameManager();
    private Toy ball;
    private Toy doll;
    private Toy hoop;
    private Toy car;

    @BeforeEach
    void setUp() {
        ball = new Ball(Size.SMALL, Age.BABY, SportName.BALL_GAME, BallType.VOLEYBALL);
        doll = new Doll(Size.BIG, Age.PRESCHOOLER, Sex.FEMALE);
        hoop = new Hoop(Size.MEDIUM, Age.SCHOOLER, SportName.GYMNASTICS, 0);
        car = new ToyCar(Size.BIG, Age.SCHOOLER, false);

        gameManager.addToy(doll);
        gameManager.addToy(hoop);
        gameManager.addToy(car);
        gameManager.addToy(ball);
    }

    @Test
    void calculateToyQuantity() {
        assertEquals(10, gameManager.calculateToyQuantity(200));
    }

    @Test
    void setToys() {
        Toy doll = new Doll(Size.BIG, Age.BABY, Sex.FEMALE);
        Toy hoop = new Hoop(Size.MEDIUM, Age.SCHOOLER, SportName.GYMNASTICS, 10);
        Toy car = new ToyCar(Size.SMALL, Age.SCHOOLER, false);
        List<Toy> toyList = new ArrayList<>();
        toyList.add(doll);
        toyList.add(hoop);
        toyList.add(car);
        gameManager.setToys(toyList);

        for (int i = 0; i < toyList.size(); i++) {
            assertEquals(toyList.get(i), gameManager.getToys().get(i));
        }
    }

    @Test
    void sortByAge() {
        gameManager.sortByAge(gameManager.getToys());

        assertEquals(ball, gameManager.getToys().get(0));
        assertEquals(doll, gameManager.getToys().get(1));
        assertEquals(hoop, gameManager.getToys().get(2));
        assertEquals(car, gameManager.getToys().get(3));
    }

    @Test
    void findByGroup() {
        List<Toy> foundList = gameManager.findByGroup(null, null, ToyType.BALL);
        assertEquals(ball, foundList.get(0));
    }
}