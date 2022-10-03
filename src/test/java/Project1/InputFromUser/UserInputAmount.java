package Project1.InputFromUser;

import Project1.Coins.ILS;
import Project1.Coins.USD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputAmount {
    public double calculateTheAmount(String typeOfMoney){
        double amount = 0;
        boolean shouldRequestNewAmount = true;
        System.out.println("please enter how much money do you want to exchange: ");

        // Ask you for how much money do you want to Exchange
        while (shouldRequestNewAmount){
            Scanner scanner = new Scanner(System.in);
            try {
                amount = scanner.nextDouble();
                shouldRequestNewAmount = false;
            } catch (InputMismatchException e){
                System.out.println("Invalid Choice, please try again");
            }
        }

        // Send you to the right Exchange method
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

