package ua.lviv.iot;

public class Ball extends SportToy {
    private final ToyType toyType = ToyType.BALL;

    private BallType ballType;

    public Ball(final Size size, final Age age, final SportName sportName, final BallType ballType) {
        setSize(size);
        setAge(age);
        setSportName(sportName);
        this.ballType = ballType;
    }


    public final BallType getBallType() {
        return ballType;
    }

    public final void setBallType(final BallType ballType) {
        this.ballType = ballType;
    }

    public final ToyType getToyType() {
        return toyType;
    }

}
