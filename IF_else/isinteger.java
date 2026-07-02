package IF_else;

import java.util.Scanner;

public class isinteger {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        double n = sn.nextDouble();
        int x = (int)n;
//        if(n-x > 0) System.out.println("not an integer");
//        else System.out.println(" is integer");
//       0r
//        if (n-(int)n==0) System.out.println("is an integer");
//        else System.out.println("not integer"); 0r
        if (n==(int)n) System.out.println("is an integer");
        else System.out.println("not integer");
    }
}
