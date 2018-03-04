package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    private GameManager gameManager = new GameManager();

    @Test
    void getToys() {
        Toy ball = new Ball(Size.BIG ,Age.SCHOOLER, SportName.BALL_GAME, BallType.VOLEYBALL);
        gameManager.addToy(ball);
        assertEquals(ball, gameManager.getToys().get(0));
    }

    @Test
    void calculateToyQuantity() {
        Toy ball = new Doll(Size.BIG ,Age.SCHOOLER, Sex.MALE);
        gameManager.addToy(ball);
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
}