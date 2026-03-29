package designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses;

import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.interfaces.TaxCalculator;

public class TaxCalculatorSriLanka extends TaxCalculator {
    public TaxCalculatorSriLanka(String country, int tax){
        super(country, tax);
    }
}
