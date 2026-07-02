package PatternPrinting;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {   //if i=2 it prints 4-1=3 1 2 3
                System.out.print("* ");
            }
            System.out.println();
        }
        // or nsp and nsst method
        int nsp = n-1,nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst; j++) {   //if i=2 it prints 4-1=3 1 2 3
                System.out.print("* ");
            }
            nsp-=1;    // don't put the increment and decrement inside as it goes till infinite
            nst+=2;
            System.out.println();
        }
    }
}
