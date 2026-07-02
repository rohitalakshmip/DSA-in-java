package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) { //normally we use j=n+1-i, but we don't need the last line of space to be printed soo we use n-i
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // 1 to i
                System.out.print("* ");
            }
            for (int j = 1; j <= n-i; j++) { // 1 to i
                System.out.print("# ");
            }
            System.out.println();
        }
        // or we can use space and square(Best method)
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) { //normally we use j=n+1-i, but we don't need the last line of space to be printed soo we use n-i
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) { // 1 to i
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
