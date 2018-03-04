package ua.lviv.iot;

public abstract class SportToy extends Toy {
    private SportName sportName;

    public final SportName getSportType() {
        return sportName;
    }

    public final void setSportName(final SportName sportName) {
        this.sportName = sportName;
    }
}
