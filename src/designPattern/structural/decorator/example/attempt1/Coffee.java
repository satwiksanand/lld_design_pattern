package designPattern.structural.decorator.example.attempt1;

public class Coffee extends Beverage {

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
