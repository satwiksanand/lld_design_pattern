package designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.interfaces;

public class TaxCalculator {
    private String country;
    private int taxAmount;
    private TaxCalculator taxCalculator = null;

    public TaxCalculator(String country, int taxAmount){
        this.country = country;
        this.taxAmount = taxAmount;
    }

    public float calculate(String count, float amount){
        if(count.compareToIgnoreCase(country) == 0){
            return (taxAmount * amount) / 100;
        }
        else{
            if(taxCalculator == null){
                throw new RuntimeException("country is not valid");
            }
            return taxCalculator.calculate(count, amount);
        }
    }

    public void setTaxCalculator(TaxCalculator tx){
        this.taxCalculator = tx;
    }
}