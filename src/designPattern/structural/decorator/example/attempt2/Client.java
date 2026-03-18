package designPattern.structural.decorator.example.attempt2;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.beverages.HouseBlend;
import designPattern.structural.decorator.example.attempt2.condiments.Mocha;
import designPattern.structural.decorator.example.attempt2.condiments.Whip;

public class Client {
    public static void main(String[] args)
    {
        System.out.println("an order of house blend with 2 mochas and whip cream.");
        Beverage beverage = new HouseBlend("best house blend out there");
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println("The final cost is: " + beverage.cost());
    }
}
