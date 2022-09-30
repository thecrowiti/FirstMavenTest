package Project1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCaller {
    public static void main(String[] args) {
        CaculateResultList caculateResultList = new CaculateResultList();
        String typeOfMoney = null;
        TheStart.theStar();

        Scanner scanner = new Scanner(System.in);
        int anotherExchange = 1;
        while(anotherExchange == 1) {
            TypeOfCoin typeOfCoin = new TypeOfCoin();
            typeOfMoney = typeOfCoin.Try(typeOfMoney);
            Input input = new Input();
            double theAmount = input.caculateTheAmount(typeOfMoney);
            caculateResultList.caculateResultList(theAmount);
            System.out.println("If you want to do another exchange enter the number 1" +
                    "\nIf you want to end the exchange enter the number 2");
            anotherExchange = scanner.nextInt();

        }

        caculateResultList.printResultList();
        System.out.println("hi");
    }

}



//                   ILS ils = new ILS();
//                   ils.caculate(amount)
