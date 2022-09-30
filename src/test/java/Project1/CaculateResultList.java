package Project1;

import java.util.ArrayList;
import java.util.List;

public class CaculateResultList {
    ArrayList<Double> theFinalAmount = new ArrayList();

    public void printResultList (){
        System.out.println(theFinalAmount);
    }
    public void caculateResultList (double result){
        theFinalAmount.add(result);
    }

}
