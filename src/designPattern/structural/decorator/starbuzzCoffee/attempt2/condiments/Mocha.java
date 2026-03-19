package designPattern.structural.decorator.starbuzzCoffee.attempt2.condiments;

import designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.starbuzzCoffee.attempt2.utils.CondimentDetails;

import java.util.List;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public List<String> getDescription() {
        if(description != null){
            return description;
        }
        description = beverage.getDescription();
        description.add("mocha");
        return description;
    }

    public float cost() {
        return beverage.cost() + CondimentDetails.getMochaCost();
    }
}
