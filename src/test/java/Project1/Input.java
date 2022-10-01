package Project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public double calculateTheAmount(String typeOfMoney){
        double amount = 0;
        boolean shouldRequestNewAmount = true;

        while (shouldRequestNewAmount){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("please enter how much money do you want to exchange: ");
                amount = scanner.nextDouble();
                shouldRequestNewAmount = false;
            } catch (InputMismatchException e){
                System.out.println("Invalid Choice, please try again");
            }
        }

        if(typeOfMoney == "USD"){
            USD usd = new USD();
            return usd.calculate(amount);
        }
        if(typeOfMoney == "ILS"){
            ILS usd = new ILS();
            return usd.calculate(amount);
        }
        System.out.println("The exchange ended successfully");
        return amount;
    }
}

