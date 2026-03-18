package designPattern.structural.decorator.example.attempt2.beverages;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.utils.BeverageDetails;

public class DeCaf extends Beverage {

    public DeCaf(String desc){
        description = desc;
    }

    public float cost() {
        return BeverageDetails.getDeCafCost();
    }
}
