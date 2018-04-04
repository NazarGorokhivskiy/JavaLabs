package ua.lviv.iot;

public class Hoop {
    private int id;
    private final ToyType toyType = ToyType.HOOP;
    private double price;

    private double radius;

    public Hoop() {

    }
//
//    public Hoop(final Size size, final Age age, final SportName sportName, final double radius) {
//        setSize(size);
//        setAge(age);
//        setSportName(sportName);
//        this.radius = radius;
//    }

    public final double getRadius() {
        return radius;
    }

    public final void setRadius(final double radius) {
        this.radius = radius;
    }

    public final ToyType getToyType() {
        return toyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
