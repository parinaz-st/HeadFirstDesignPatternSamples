package Classes;

import Interfaces.IDisplay;
import Interfaces.IObserver;

public class CurrentConditionDisplay implements IObserver, IDisplay {
    private float temperture;

    public CurrentConditionDisplay(WheatherData wheatherData) {
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    public CurrentConditionDisplay() {
    }

    private  float pressure;
    private float humidity;
    private WheatherData wheatherData;


    @Override
    public void display() {
        System.out.println(" (Display1) Current Temperture is : " + temperture
        + " ,current pressure is: " + pressure + " ,current Humidity is: " + humidity);

    }

    @Override
    public void update(float temperture, float pressure, float humidity) {
        this.temperture = temperture;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public float getTemperture() {
        return temperture;
    }

    public void setTemperture(float temperture) {
        this.temperture = temperture;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public WheatherData getWheatherData() {
        return wheatherData;
    }

    public void setWheatherData(WheatherData wheatherData) {
        this.wheatherData = wheatherData;
    }

}
