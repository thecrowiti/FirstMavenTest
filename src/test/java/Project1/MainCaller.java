package Project1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainCaller {
    public static void main(String[] args) {
        CaculateResultList caculateResultList = new CaculateResultList();
        String typeOfMoney = null;
        TheStart.theStar();
        TypeOfCoin typeOfCoin = new TypeOfCoin();
        typeOfMoney = typeOfCoin.Try(typeOfMoney);
        Input input = new Input();
        double theAmount = input.caculateTheAmount(typeOfMoney);
        caculateResultList.caculateResultList(theAmount);
        caculateResultList.printResultList();
        System.out.println("hi");
    }

}



//                   ILS ils = new ILS();
//                   ils.caculate(amount)
