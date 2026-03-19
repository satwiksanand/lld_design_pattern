package designPattern.structural.decorator.example.attempt2;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.Size;
import designPattern.structural.decorator.example.attempt2.beverages.HouseBlend;
import designPattern.structural.decorator.example.attempt2.condiments.Mocha;
import designPattern.structural.decorator.example.attempt2.condiments.Whip;

import java.util.List;

public class Client {
    public static void main(String[] args)
    {
        System.out.println("an order of house blend with 2 mochas and whip cream.");
        Beverage beverage = new HouseBlend("best house blend out there", Size.GRANDE);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        //in the concrete condimentDetails class, i had to add the if condition, because it was basically adding condiments
        //by the number of getDescription calls, so i wanted a way to prune it.

        System.out.println("The final cost is: " + beverage.cost());
        System.out.println("The coffee description would look something like this: " + beverage.calcFinalDescription());
    }
}
