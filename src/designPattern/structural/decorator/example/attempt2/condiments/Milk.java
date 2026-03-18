package designPattern.structural.decorator.example.attempt2.condiments;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.example.attempt2.utils.CondimentDetails;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    public float cost() {
        return beverage.cost() + CondimentDetails.getMilkCost();
    }
}
