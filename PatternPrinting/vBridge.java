package PatternPrinting;

import java.util.Scanner;

public class vBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=2*n-1;i++) {  // if n = 5 (2*5-1=6-1=5)
              System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2 * i - 1; j++) {
                    System.out.print(j+" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
                System.out.println();
            }
        // Or using nsp
        for (int i=1;i<=2*n-1;i++) {  // if n = 5 (2*5-1=6-1=5)
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }

        }
    }

