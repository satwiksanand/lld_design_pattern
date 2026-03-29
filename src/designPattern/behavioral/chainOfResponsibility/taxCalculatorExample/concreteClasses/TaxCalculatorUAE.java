package designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses;

import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.interfaces.TaxCalculator;

public class TaxCalculatorUAE extends TaxCalculator {
    public TaxCalculatorUAE(String country, int tax){
        super(country, tax);
    }
}
