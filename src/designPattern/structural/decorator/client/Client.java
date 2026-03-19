package designPattern.structural.decorator.client;

import designPattern.structural.decorator.starbuzzCoffee.attempt1.Coffee;
import designPattern.structural.decorator.starbuzzCoffee.attempt1.CondimentsDetails;

//decorator pattern is used for attaching additional functionalities to a class, decorator provides a new approach for extending
//a functionality other than sub-classing.

public class Client {
    public static void main(String[] args){
        Coffee coffee = new Coffee("10rs wali coffee", 30);//ha bhai 30 me milti hai.
        coffee.toggleMocha();
        coffee.toggleWhippedCream();

        System.out.println(coffee.cost());

        System.out.println("shii there was a sudden price change and now we have to increase the cost of whipped cream by 10!");
        CondimentsDetails.setWhippedCreamCost(10);

        System.out.println(coffee.cost());
    }
}
