package designPattern.structural.decorator.example.attempt2.beverages;

import designPattern.structural.decorator.example.attempt2.abstractClasses.Beverage;
import designPattern.structural.decorator.example.attempt2.abstractClasses.Size;
import designPattern.structural.decorator.example.attempt2.utils.BeverageDetails;

import java.util.ArrayList;
import java.util.Arrays;

public class DeCaf extends Beverage {

    public DeCaf(String desc, Size nsize){
        description = new ArrayList<>();
        description.add(desc);
        size = nsize;
    }

    public float cost() {
        return BeverageDetails.getDeCafCost() * (size == Size.GRANDE ? 1.5f : (size == Size.VENTI ? 2.0f : 1.0f));
    }
}
