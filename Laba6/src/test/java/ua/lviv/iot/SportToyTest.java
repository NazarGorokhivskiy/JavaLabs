package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportToyTest {
    private Ball ball = new Ball(Size.SMALL, Age.BABY, SportName.BALL_GAME, BallType.VOLEYBALL);

    @Test
    void getSportName() {
        assertEquals(SportName.BALL_GAME, ball.getSportName());
    }
}