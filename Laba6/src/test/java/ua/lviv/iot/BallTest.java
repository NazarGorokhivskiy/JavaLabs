package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(Size.BIG, Age.BABY, SportName.BALL_GAME, BallType.FOOTBALL);
    }

    @Test
    void getBallType() {
        assertEquals(BallType.FOOTBALL, ball.getBallType());
    }

    @Test
    void setBallType() {
        ball.setBallType(BallType.VOLEYBALL);
        assertEquals(BallType.VOLEYBALL, ball.getBallType());
    }

    @Test
    void getToyType() {
        assertEquals(ToyType.BALL, ball.getToyType());
    }
}