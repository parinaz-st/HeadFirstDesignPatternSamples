package Classes;

import Interfaces.IDisplay;
import Interfaces.IObserver;

public class ParinazDamasanj implements IDisplay, IObserver {


    private float temperture;
    private WheatherData wheatherData;

    public ParinazDamasanj(WheatherData wheatherData) {
       this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("(Display2) Current dama is : " + temperture);
    }

    @Override
    public void update(float temperture, float pressure, float humidity) {
        this.temperture = temperture;
        display();
    }
    public float getTemperture() {
        return temperture;
    }

    public void setTemperture(float temperture) {
        this.temperture = temperture;
    }
}
