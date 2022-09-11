package Classes;

import javax.swing.*;

public class Espresso extends Beverage{

    public Espresso()
    {
        decription = "Espreso";
    }
    @Override
    public double cost() {
        return 100;
    }
}
