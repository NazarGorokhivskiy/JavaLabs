package main.ua.lviv.iot;

public abstract class SportToy extends Toy {
    private SportName sportName;

    public SportName getSportType() {
        return sportName;
    }

    public void setSportName(SportName sportName) {
        this.sportName = sportName;
    } 
   
    
}
