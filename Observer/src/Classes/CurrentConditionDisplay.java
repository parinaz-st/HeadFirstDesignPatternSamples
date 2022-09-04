package Classes;

import Interfaces.IDisplay;
import Interfaces.IObserver;

public class CurrentConditionDisplay implements IObserver, IDisplay {
    private float temperture;
    private  float pressure;
    private float humidity;
    private WheatherData wheatherData;


    @Override
    public void display(float temperture, float pressure, float humidity) {
        System.out.println("Current Temperture is : " + temperture
        + "current pressure is: " + pressure + "current Humidity is: " + humidity);

    }

    @Override
    public void update(float temperture, float pressure, float humidity) {
        this.temperture = temperture;
        this.pressure = pressure;
        this.humidity = humidity;
        display(temperture, pressure, humidity);
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
