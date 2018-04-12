package ua.lviv.iot;

import javax.persistence.*;

@Entity
public class Hoop {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name ="price")
    private double price;

    @Column(name ="radius")
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
