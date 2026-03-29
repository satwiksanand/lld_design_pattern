package designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.client;

import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses.TaxCalculatorIndia;
import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses.TaxCalculatorSriLanka;
import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.concreteClasses.TaxCalculatorUAE;
import designPattern.behavioral.chainOfResponsibility.taxCalculatorExample.interfaces.TaxCalculator;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator india = new TaxCalculatorIndia("india", 30);
        TaxCalculator uae = new TaxCalculatorUAE("uae", 10);
        TaxCalculator sriLanka = new TaxCalculatorSriLanka("sri lanka", 45);

        india.setTaxCalculator(uae);
        uae.setTaxCalculator(sriLanka);

        int amount = 0;
        int country;
        String[] allCountries = new String[]{"India", "uae", "Sri Lanka"};

        while(true){
            System.out.println("------------print any invalid option to quit-----------------");
            System.out.println("Enter the amount: ");
            amount = scanner.nextInt();
            System.out.println("Enter the country that you are in: \n1. India\n2. UAE\n3. Sri Lanka\n\nPress the relevant number:");
            country = scanner.nextInt();

            if(country >= 4 || country < 1){
                System.out.println("Invalid Option");
                break;
            }
            else{
                System.out.println(india.calculate(allCountries[country - 1], amount));
            }
        }

        scanner.close();
    }
}
