package Project1;

import java.util.Scanner;

public class TypeOfCoin {
    public String Try(String x){
        String typeOfMoney = null;
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
    try{
        switch (userInput){
            case 1:
                typeOfMoney = "ILS";
                break;
            case 2:
                typeOfMoney = "USD";
                break;

        }
    }catch (Exception e){
        System.out.println("NO");
    }

    finally {
        return  typeOfMoney;
    }
    }
}
