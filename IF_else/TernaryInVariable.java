package IF_else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int p = (n>=0) ? 100 : 0 ;
//        if(n>=0) p = 100;
//        else p=0;
        System.out.println((p));
    }
}
