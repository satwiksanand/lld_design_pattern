package designPattern.structural.decorator.example;

public class CondimentsDetails {
    private static int mochaCost;
    private static int sodaCost;
    private static int whippedCreamCost;

    static {
        mochaCost = 2;
        sodaCost = 3;
        whippedCreamCost = 4;
    }

    public static void setMochaCost(int val) {
        mochaCost = val;
    }

    public static void setSodaCost(int val){
        sodaCost = val;
    }

    public static void setWhippedCreamCost(int val) {
        whippedCreamCost = val;
    }

    public static int getMochaCost() {
        return mochaCost;
    }

    public static int getSodaCost() {
        return sodaCost;
    }

    public static int getWhippedCreamCost() {
        return whippedCreamCost;
    }
}
