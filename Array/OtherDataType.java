package Array;

import java.util.Scanner;

public class OtherDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DOUBLE

        double[]arr=new double[8];
        // default
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

        // CHAR

        char[] ar = new char[6];
        for (int i = 0; i < ar.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < ar.length ; i++) {
            System.out.println(ar[i]);
        }

        // STRING

        String[] b = new String[6];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
