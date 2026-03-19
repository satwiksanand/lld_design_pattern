package designPattern.structural.decorator.starbuzzCoffee.attempt2.abstractClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Beverage {
    protected List<String> description = null;
    private String desc = null;
    protected Size size = Size.TALL;

    public List<String> getDescription() {
        return description;
    }

    public String calcFinalDescription() {
        if(desc == null){
            this.getDescription();
        }
        if(description.toArray().length == 1){
            return description.getFirst();
        }
        Map<String, Integer> all = new HashMap<>();
        for(int ind = 1; ind < description.toArray().length; ++ind){
            String st = description.get(ind);
            all.put(st, all.getOrDefault(st, 0) + 1);
        }
        String finalDesc = description.getFirst();
        finalDesc += " with";
        for(String st : all.keySet()){
            finalDesc = finalDesc + ", " + all.get(st) + " " + st;
        }
        return desc = finalDesc;
    }
    public Size getSize(){
        return size;
    }

    public void setSize(Size nsize){
        size = nsize;
    }

    public abstract float cost();
}
