package Project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCaller {
    public static void main(String[] args) {
        CaculateResultList caculateResultList = new CaculateResultList();
        String typeOfMoney = null;
        TheStart theStart = new TheStart();
        theStart.greetings();

        int anotherExchange = 1;
        while(anotherExchange == 1) {
            theStart.instructions();
            TypeOfCoin typeOfCoin = new TypeOfCoin();
            typeOfMoney = typeOfCoin.typeOfExchange();
            Input input = new Input();
            double theAmount = input.calculateTheAmount(typeOfMoney);
            caculateResultList.caculateResultList(theAmount);

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

            }

        }
        caculateResultList.printResultList();
    }

}



//                   ILS ils = new ILS();
//                   ils.caculate(amount)
