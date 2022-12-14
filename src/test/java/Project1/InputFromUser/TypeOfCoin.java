package Project1.InputFromUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeOfCoin {
    // Check what type of Exchange the user want by his input
    public String typeOfExchange(){
        String typeOfMoney = null;
        while (typeOfMoney == null){
            try{
                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        typeOfMoney = "ILS";
                        break;
                    case 2:
                        typeOfMoney = "USD";
                        break;
                    default:
                        System.out.println("Invalid Choice, please try again");

                }
            }catch (InputMismatchException e){
                System.out.println("Invalid Choice, please try again");

            }
        }
        return  typeOfMoney;
    }
}
