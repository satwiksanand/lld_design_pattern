package designPattern.structural.decorator.example.attempt2.condiments;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.example.attempt2.utils.CondimentDetails;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    public float cost() {
        return beverage.cost() + CondimentDetails.getMochaCost();
    }
}
