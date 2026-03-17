package designPattern.structural.decorator.example;

public abstract class Beverage {
    private boolean hasMocha;
    private boolean hasSoda;
    private boolean hasWhippedCream;
    private String description;

    public int cost() {
        int res = 0;
        if(hasMocha){
            res += CondimentsDetails.getMochaCost();
        }
        if(hasSoda){
            res += CondimentsDetails.getSodaCost();
        }
        if(hasWhippedCream){
            res += CondimentsDetails.getWhippedCreamCost();
        }
        return res;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc){
        description = desc;
    }

    public void toggleMocha() {
        hasMocha = !hasMocha;
    }

    public void toggleSoda() {
        hasSoda = !hasSoda;
    }

    public void toggleWhippedCream() {
        hasWhippedCream = !hasWhippedCream;
    }
}
