package ua.lviv.iot;

import java.lang.reflect.Field;

public abstract class Toy implements Comparable<Toy> {
    private static final int TOY_PRICE = 20;
    private double price = TOY_PRICE;
    private Age age;
    private Size size;

    public abstract ToyType getToyType();


    public final int compareTo(final Toy toy) {
        return toy.getAge().compareTo(getAge());
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final Age getAge() {
        return age;
    }

    public final void setAge(final Age age) {
        this.age = age;
    }

    public final Size getSize() {
        return size;
    }

    public final void setSize(final Size size) {
        this.size = size;
    }
}
