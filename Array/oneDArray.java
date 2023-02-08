package Array;

import java.util.Arrays;

public class oneDArray {
    public static void main(String[] args) {
        int ar_one [] = {1,2,3,4,5};

        String ar_two[] = new String[3];
        ar_two[0] = "kishor";
        ar_two[1] = "anish";
        ar_two[2] = "naresh";

        System.out.println(Arrays.toString(ar_one));
        System.out.println();

        for(int me: ar_one){
            System.out.println(me);
        }
        System.out.println();

        for(int i=0;i<ar_two.length;i++){
            System.out.println(ar_two[i]);
        }
    }
}
