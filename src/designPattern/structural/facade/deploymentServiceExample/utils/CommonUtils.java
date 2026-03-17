package designPattern.structural.facade.deploymentServiceExample.utils;

public class CommonUtils {
    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
