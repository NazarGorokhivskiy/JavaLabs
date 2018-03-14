package ua.lviv.iot;

public class Doll extends Toy {
    private final ToyType toyType = ToyType.DOLL;

    private Sex sex;

    public Doll(final Size size, final Age age, final Sex sex) {
        setSize(size);
        setAge(age);
        this.sex = sex;
    }

    public String getHeaders() {
        return super.getHeaders() + COMA + "sex";
    }

    public String toCSV() {
        return super.toCSV() + COMA + getSex();
    }


    public final Sex getSex() {
        return sex;
    }

    public final void setSex(final Sex sex) {
        this.sex = sex;
    }

    public final ToyType getToyType() {
        return toyType;
    }

}
