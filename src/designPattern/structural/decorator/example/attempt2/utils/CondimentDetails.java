package designPattern.structural.decorator.example.attempt2.utils;

public class CondimentDetails {
    private static float milkCost = 0.2f;
    private static float soyCost = 0.3f;
    private static float whipCost = 0.5f;
    private static float mochaCost = 0.4f;

    public static float getMilkCost() {
        return milkCost;
    }

    public static void setMilkCost(float milkCost) {
        CondimentDetails.milkCost = milkCost;
    }

    public static float getSoyCost() {
        return soyCost;
    }

    public static void setSoyCost(float soyCost) {
        CondimentDetails.soyCost = soyCost;
    }

    public static float getWhipCost() {
        return whipCost;
    }

    public static void setWhipCost(float whipCost) {
        CondimentDetails.whipCost = whipCost;
    }

    public static float getMochaCost() {
        return mochaCost;
    }

    public static void setMochaCost(float mochaCost) {
        CondimentDetails.mochaCost = mochaCost;
    }
}
