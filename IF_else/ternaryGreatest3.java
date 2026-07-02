package IF_else;

import java.util.Scanner;

public class ternaryGreatest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers : ");
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();
        System.out.println("Greatest number is "+((A>B)?((A>C)?A:C):((B>C)?B:C)));
    }
}
