package Project1.Lists;

import java.util.ArrayList;


public class CalculateResultList {
    ArrayList<Double> theFinalAmount = new ArrayList();

    // This method print the list with all the Exchanged numbers
    public void printResultList (){
        System.out.println("Your exchanges are : " + theFinalAmount);
    }
    // This method write the numbers in a list after the Exchange
    public void caculateResultList (double result){
        theFinalAmount.add(result);
    }

}
