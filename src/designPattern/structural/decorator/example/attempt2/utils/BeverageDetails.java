package designPattern.structural.decorator.example.attempt2.utils;

public class BeverageDetails {
    private static float darkRoastCost = 1.99f;
    private static float espressoCost = 0.89f;
    private static float deCafCost = 1.29f;
    private static float houseBlendCost = 2.99f;

    public static float getDarkRoastCost() {
        return darkRoastCost;
    }

    public static void setDarkRoastCost(float darkRoastCost) {
        BeverageDetails.darkRoastCost = darkRoastCost;
    }

    public static float getEspressoCost() {
        return espressoCost;
    }

    public static void setEspressoCost(float espressoCost) {
        BeverageDetails.espressoCost = espressoCost;
    }

    public static float getDeCafCost() {
        return deCafCost;
    }

    public static void setDeCafCost(float deCafCost) {
        BeverageDetails.deCafCost = deCafCost;
    }

    public static float getHouseBlendCost() {
        return houseBlendCost;
    }

    public static void setHouseBlendCost(float houseBlendCost) {
        BeverageDetails.houseBlendCost = houseBlendCost;
    }
}
