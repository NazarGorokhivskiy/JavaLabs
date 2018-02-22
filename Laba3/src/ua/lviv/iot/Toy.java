package ua.lviv.iot;

public abstract class Toy {
    private double price = 20;
    private Age age;
    private Size size;

    public abstract ToyType getToyType();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
