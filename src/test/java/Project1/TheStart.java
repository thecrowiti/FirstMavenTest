package Project1;

import java.util.Scanner;

public class TheStart {
    public void theStar(){
        System.out.println("Hi there pleases enter" +
                "\n The number 1 to changing from ILS to USD " +
                "\n or " +
                "\n The number 2 to changing from USD to ILS" );
        Scanner scanner = new Scanner(System.in);
        double typeOfManey = scanner.nextByte();
    }


}
