package main.ua.lviv.iot;

public class Doll extends Toy {
    private final ToyType toyType = ToyType.DOLL;

    private Sex sex;

    public Doll(Size size, Age age, Sex sex) {
        setSize(size);
        setAge(age);
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public ToyType getToyType() {
        return toyType;
    }

}