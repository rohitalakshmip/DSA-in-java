package PatternPrinting;

import java.util.Scanner;

public class verticallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // using square
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) { // 1 to i
                if ((i + j) > n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // 2nd method loop inside a loop (Modular Code)
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int space = 1; space <= m - i; space++) { //normally we use j=n+1-i, but we don't need the last line of space to be printed soo we use n-i
                System.out.print("# ");
            }
            for (int j = 1; j <= i; j++) { // 1 to i
                System.out.print("* ");
            }
            System.out.println();
        }

        //  For numbers
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {//norma
                for (int space = 1; space <= a - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // 1 to i
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int space = 1; space <= b - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // 1 to i
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
