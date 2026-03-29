package designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses;

import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.interfaces.TaxCalculator;

public class TaxCalculatorIndia extends TaxCalculator {
    public TaxCalculatorIndia(String country, int tax){
        super(country, tax);
    }
}
