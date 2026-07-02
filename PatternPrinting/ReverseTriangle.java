package PatternPrinting;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        //STAR
        System.out.println("For Stars");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) { // 1 to i
                System.out.print(" x ");
            }
            System.out.println();
        }
        System.out.println("For Numbers ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) { // 1 to i
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("For Numbers ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) { // 1 to i
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("For Alphabets ");
        System.out.println("Upper Case");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) { // 1 to i
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) { // 1 to i
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        System.out.println("Lower Case ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) { // 1 to i
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) { // 1 to i
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }


        //   or

    }
}

