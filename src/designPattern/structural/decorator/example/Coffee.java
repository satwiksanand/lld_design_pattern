package designPattern.structural.decorator.example;

public class Coffee extends Beverage{

    private int coffeeCost = 0;

    public Coffee(String desc, int coffeeCost){
        super.setDescription(desc);
        this.coffeeCost = coffeeCost;
    }

    @Override
    public int cost() {
        return coffeeCost + super.cost();
    }
}
