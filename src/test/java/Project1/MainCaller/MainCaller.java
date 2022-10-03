package Project1.MainCaller;

import Project1.AtTheStartOfTheProject.TheStart;
import Project1.ExchangeAgainLoop.ExchangeAgainLoop;
import Project1.InputFromUser.TypeOfCoin;
import Project1.InputFromUser.UserInputAmount;
import Project1.Lists.CalculateResultList;


public class MainCaller {
    public static void main(String[] args) {
        CalculateResultList caculateResultList = new CalculateResultList();
        String typeOfMoney = null;
        TheStart theStart = new TheStart();
        theStart.greetings();

        int anotherExchange = 1;
        while(anotherExchange == 1) {
            theStart.instructions();
            TypeOfCoin typeOfCoin = new TypeOfCoin();
            typeOfMoney = typeOfCoin.typeOfExchange();
            UserInputAmount input = new UserInputAmount();
            double theAmount = input.calculateTheAmount(typeOfMoney);
            caculateResultList.caculateResultList(theAmount);
            ExchangeAgainLoop exchangeAgainLoop = new ExchangeAgainLoop();
            exchangeAgainLoop.exchangeAgainLoop(anotherExchange);
        }
        caculateResultList.printResultList();
    }

}



