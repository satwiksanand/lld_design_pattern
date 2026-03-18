package designPattern.structural.decorator.example.attempt2.condiments;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.CondimentDecorator;
import designPattern.structural.decorator.example.attempt2.utils.CondimentDetails;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", whip cream";
    }

    public float cost() {
        return  beverage.cost() + CondimentDetails.getWhipCost();
    }
}
