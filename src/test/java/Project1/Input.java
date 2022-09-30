package Project1;

import java.util.Scanner;

public class Input {
    public double caculateTheAmount (String typeOfMoney){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter how much money do you want to exchange: ");
        double amount = scanner.nextDouble();
        System.out.println("The exchange ended successfully");
        if(typeOfMoney == "USD"){
            USD usd = new USD();
            return usd.caculate(amount);
        }
        if(typeOfMoney == "ILS"){
            ILS usd = new ILS();
            return usd.caculate(amount);
        }
        return amount;
    }
}

