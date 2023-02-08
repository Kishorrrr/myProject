package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int ar [][] = {{1,2},{3,4}};

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        TwoDArray.stringTwoDArray();
    }

    static void stringTwoDArray(){
        String arr[][] = new String [2][2];

        arr[0][0] = "Hi";
        arr[0][1] = "I'm Kishor";
        arr[1][0] = "from";
        arr[1][1] = "Tech M";

        for(int i=0;i<=1;i++){
            for(int j=0;i<=1;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
