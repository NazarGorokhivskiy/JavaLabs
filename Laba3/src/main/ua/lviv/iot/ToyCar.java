package main.ua.lviv.iot;

public class ToyCar extends Toy {
    private ToyType toyType = ToyType.CAR;

    private boolean isCargo;

    ToyCar(Size size, Age age, boolean isCargo) {
        setSize(size);
        setAge(age);
        this.isCargo = isCargo;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean isCargo) {
        this.isCargo = isCargo;
    }

    public ToyType getToyType() {
        return toyType;
    }

}
