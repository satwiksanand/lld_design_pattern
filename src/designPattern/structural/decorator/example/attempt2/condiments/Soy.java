package designPattern.structural.decorator.example.attempt2.condiments;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.example.attempt2.utils.CondimentDetails;

import java.util.List;

public class Soy extends CondimentDecorator {
    Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public List<String> getDescription() {
        if(description != null){
            return description;
        }
        description = beverage.getDescription();
        description.add("soy");
        return description;
    }

    public float cost() {
        return beverage.cost() + CondimentDetails.getSoyCost();
    }
}
