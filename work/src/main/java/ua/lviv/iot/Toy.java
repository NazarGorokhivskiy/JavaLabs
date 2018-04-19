package ua.lviv.iot;

import javax.persistence.*;

@Entity
public class Toy implements Comparable<Toy> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name ="price")
    private double price;

    @Column(name ="age")
    private String age;

    @Column(name ="size")
    private String size;

    public Toy() {

    }

    public final int compareTo(final Toy toy) {
        return toy.getAge().compareTo(getAge());
    }

    public final double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public final String getAge() {
        return age;
    }

    public final void setAge(final String age) {
        this.age = age;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(final String size) {
        this.size = size;
    }

    public final Integer getId() {
        return id;
    }

    public final void setId(final Integer id) {
        this.id = id;
    }
}
