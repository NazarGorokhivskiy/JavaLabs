package ua.lviv.iot;

public class Ball extends SportToy {
    private final ToyType toyType = ToyType.BALL;

    private BallType ballType;

    public Ball(Size size, Age age, SportName sportName, BallType ballType) {
        setSize(size);
        setAge(age);
        setSportName(sportName);
        this.ballType = ballType;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    public ToyType getToyType() {
        return toyType;
    }

}
