package PatternPrinting;

import java.util.Scanner;

public class HallowStarRectanglePLUScross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n)
                    System.out.print("* ");
                else System.out.print("  "); // double gap (Space)
            }
            System.out.println();
        }
        // STARPLUS
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i == (a + 1) / 2 || j == (a + 1) / 2)
                    System.out.print("* ");
                else System.out.print("  "); // double gap (Space)
            }
            System.out.println();
        }
        // STAR CROSS
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == j ||j == i || j == b+1-i )
                    System.out.print("* ");
                else System.out.print("  "); // double gap (Space)
            }
            System.out.println();
        }
    }
}