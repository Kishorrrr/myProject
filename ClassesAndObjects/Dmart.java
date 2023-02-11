package ClassesAndObjects;

import java.util.Scanner;

public class Dmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grocery a = new Grocery();
        Billing b = new Billing();

        a.dmartGrocery();
        System.out.println("How many kg of "+(a.switchCase)+" you want ?");

        int kg = sc.nextInt();
        sc.close();

        if(a.switchCase.equals("rice")){
            System.out.println("Your total price is: "+(kg*b.rice1));
        }else if(a.switchCase.equals("dal")){
            System.out.println("Your total price is: "+(kg*b.dal1));
        }else if(a.switchCase.equals("salt")){
            System.out.println("Your total price is: "+(kg*b.salt1));
        }else{
            System.out.println("Your total price is: "+(kg*b.sugar1));
        }
        
    }
}
