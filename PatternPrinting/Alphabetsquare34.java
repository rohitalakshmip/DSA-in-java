package PatternPrinting;

import java.util.Scanner;

public class Alphabetsquare34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Upper Case");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
            } System.out.println();
        }
        System.out.println("Lower Case");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 96) + " ");
            } System.out.println();
        }
    }
}