package Classes;

import Interfaces.ISubject;
import Interfaces.Observer;

public class WheatherData implements ISubject {

    @Override
    public void registerObserver(Observer observer) {
        // add linklist
    }

    @Override
    public void removeObserver(Observer observer) {
        //remove from linklist
    }

    @Override
    public void notifyObserver() {
        // be ezaye har observer toye list
        //methode update ro barash call kon

    }
    public void getTemperture()
    {}
    public void getHumidity()
    {}
    public void getPressure()
    {}
    public void measurementChanged()
    {

    }
}
