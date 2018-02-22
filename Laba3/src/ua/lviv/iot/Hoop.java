package ua.lviv.iot;

public class Hoop extends SportToy {
    private final ToyType toyType = ToyType.HOOP;

    private double radius;

    public Hoop(Size size, Age age, SportName sportName, double radius) {
        setSize(size);
        setAge(age);
        setSportName(sportName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public ToyType getToyType() {
        return toyType;
    }

}
