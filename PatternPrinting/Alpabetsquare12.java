package PatternPrinting;

import java.util.Scanner;

public class Alpabetsquare12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");// 65 for capital A
            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 96) + " ");// 65 for capital A
            }
            System.out.println();
        }
    }
}
