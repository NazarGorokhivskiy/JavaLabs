package ua.lviv.iot;

public class ToyCar extends Toy {
    private ToyType toyType = ToyType.CAR;

    private boolean isCargo;

    ToyCar(final Size size, final Age age, final boolean isCargo) {
        setSize(size);
        setAge(age);
        this.isCargo = isCargo;
    }

    public final boolean isCargo() {
        return isCargo;
    }

    public final void setCargo(final boolean isCargo) {
        this.isCargo = isCargo;
    }

    public final ToyType getToyType() {
        return toyType;
    }

}
