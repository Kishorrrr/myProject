package ClassesAndObjects;

import java.util.Scanner;

public class Grocery {

    Scanner input = new Scanner(System.in); 
    String rice;
    String dal;
    String salt;
    String sugar;
    String switchCase;

    void dmartGrocery(){
        System.out.println("What do you need ?");
        switchCase = input.nextLine();

        switch (switchCase){
            case "rice":
            System.out.println("Rice is added in your cart. ");
            break;

            case "dal":
            System.out.println("Dal is added in your cart. ");
            break;

            case "salt":
            System.out.println("Salt is added in your cart. ");
            break;

            case "sugar":
            System.out.println("sugar is added in your cart. ");
            break;

            default:
            System.out.println("Please select from the above. ");
            break;
        }

    }
}
