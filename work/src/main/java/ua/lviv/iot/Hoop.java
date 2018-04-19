package ua.lviv.iot;


public class Hoop {

    private int id;

    private double price;

    private double radius;

    public Hoop() {

    }

    public final double getRadius() {
        return radius;
    }

    public final void setRadius(final double radius) {
        this.radius = radius;
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
