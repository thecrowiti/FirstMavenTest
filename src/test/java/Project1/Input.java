package Project1;

import java.util.Scanner;

public class Input {
    public double caculateTheAmount (String typeOfMoney){
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if(typeOfMoney == "USD"){
            USD usd = new USD();
            return usd.caculate(amount);
        }
        if(typeOfMoney == "ILS"){
            ILS usd = new ILS();
            return usd.caculate(amount);
        }
        System.out.println(amount);
        return amount;
    }
}
