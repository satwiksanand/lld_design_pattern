package designPattern.structural.decorator.example.attempt2.abstractClasses;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription() ;
}
