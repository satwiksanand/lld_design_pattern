package designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses;

import java.util.List;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract List<String> getDescription() ;
}
