package Loops;
//HW
import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the Table : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10 ; i=i+1) {
            System.out.println(i*n);
        }
    }
}
