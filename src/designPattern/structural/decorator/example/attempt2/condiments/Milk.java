package designPattern.structural.decorator.example.attempt2.condiments;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.example.attempt2.utils.CondimentDetails;

import java.util.List;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public List<String> getDescription() {
        if(description != null){
            return description;
        }
        description = beverage.getDescription();
        description.add("milk");
        return description;
    }

    public float cost() {
        return beverage.cost() + CondimentDetails.getMilkCost();
    }
}
