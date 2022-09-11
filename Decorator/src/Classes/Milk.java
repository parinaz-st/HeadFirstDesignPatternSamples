package Classes;

public class Milk extends Afzoodani{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
    @Override
    public String getDecription() {
        return  beverage.getDecription() + "MILK";
    }
}
