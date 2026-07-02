package PatternPrinting;

import java.util.Scanner;

public class vDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        int sp = 1,st = 2*n-3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=st; j++) {   //if i=2 it prints 4-1=3 1 2 3
                System.out.print("& ");
            }
            sp+=1;    // don't put the increment and decrement inside as it goes till infinite
            st-=2;
            System.out.println();
        }
    }
}
