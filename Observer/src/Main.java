import Classes.CurrentConditionDisplay;
import Classes.ParinazDamasanj;
import Classes.WheatherData;

public class Main {
    public static void main(String[] args) {
        WheatherData wheatherData = new WheatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(wheatherData);
        ParinazDamasanj parinazDamasanj = new ParinazDamasanj(wheatherData);
        wheatherData.setMeasurment(10,20,30);
        wheatherData.removeObserver(parinazDamasanj);
        wheatherData.setMeasurment(20,50,60);

    }
}
