package Classes;

import Interfaces.ISubject;
import Interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements ISubject {


    private List<IObserver> observerList;
    private float temperture;
    private float pressure;
    private float humidity;


    public WheatherData() {
        observerList = new ArrayList<>();
    }
    //implementing subject interface

    @Override
    public void registerObserver(IObserver observer) {
        // add linklist
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        //remove from linklist
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver ob : observerList) {
            ob.update(temperture, pressure, humidity);
        }
        // be ezaye har observer toye list
        //methode update ro barash call kon

    }
    public void measurementChanged()
    {
        notifyObserver();

    }
    public List<IObserver> getObserverList() {
        return observerList;
    }
    public void setMeasurment(float temperture, float pressure, float humidity)
    {
        this.temperture = temperture;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void setObserverList(List<IObserver> observerList) {
        this.observerList = observerList;
    }

    public void setTemperture(float temperture) {
        this.temperture = temperture;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getTemperture() {
        return temperture;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

}
