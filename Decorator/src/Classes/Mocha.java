package Classes;

public class Mocha extends Afzoodani{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + "mocha";
    }
}
