package Project1.ExchangeAgainLoop;

import java.util.InputMismatchException;
import java.util.Scanner;

// That method check with the user if he wants to Exchange again,
// by changing the Variable "anotherExchange" that in main loop
public class ExchangeAgainLoop {
    public int exchangeAgainLoop(int anotherExchange){
        System.out.println("If you want to do another exchange enter the number 1" +
                "\nIf you want to end the exchange enter the number 2");
        boolean exchangeAgain = true;
        while (exchangeAgain){
            try{
                Scanner scanner = new Scanner(System.in);
                anotherExchange = scanner.nextInt();
                if (anotherExchange == 2 || anotherExchange == 1) {
                    exchangeAgain = false;
                } else {
                    System.out.println("Invalid Choice, please try again");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid Choice, please try again");
            }

        } return anotherExchange;
    }
}
