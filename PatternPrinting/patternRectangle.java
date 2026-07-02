package PatternPrinting;

import java.util.Scanner;

public class patternRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the rows");
//        int row = sc.nextInt();
//        int coloum = sc.nextInt();
//        for (int i = 1; i <= row ; i++) {
//            for (int j = 1; j <= coloum; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();

        // next  * * *
        //square * * *
        //       * * *
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

