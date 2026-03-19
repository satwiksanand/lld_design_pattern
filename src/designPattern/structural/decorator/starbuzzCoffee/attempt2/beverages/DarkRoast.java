package designPattern.structural.decorator.starbuzzCoffee.attempt2.beverages;

import designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses.Size;
import designPattern.structural.decorator.starbuzzCoffee.attempt2.utils.BeverageDetails;

import java.util.ArrayList;

public class DarkRoast extends Beverage {

    public DarkRoast(String desc, Size nsize){
        description = new ArrayList<>();
        description.add(desc);
        size = nsize;
    }

    public float cost() {
        return BeverageDetails.getDarkRoastCost() * (size == Size.GRANDE ? 1.5f : (size == Size.VENTI ? 2.0f : 1.0f));
    }
}
