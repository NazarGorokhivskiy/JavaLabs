package ua.lviv.iot;

public class Hoop extends SportToy {
    private final ToyType toyType = ToyType.HOOP;

    private double radius;

    public Hoop(final Size size, final Age age, final SportName sportName, final double radius) {
        setSize(size);
        setAge(age);
        setSportName(sportName);
        this.radius = radius;
    }

    public String getHeaders() {
        return super.getHeaders() + COMA + "radius";
    }

    public String toCSV() {
        return super.toCSV() + COMA + getRadius();
    }


    public final double getRadius() {
        return radius;
    }

    public final void setRadius(final double radius) {
        this.radius = radius;
    }

    public final ToyType getToyType() {
        return toyType;
    }

}
