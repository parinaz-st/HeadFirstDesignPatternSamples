import Classes.*;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDecription() +  ",  " + beverage.cost());

        Beverage beverage1 = new DamiCoffee();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDecription() + ",  " + beverage1.cost());

    }
}
