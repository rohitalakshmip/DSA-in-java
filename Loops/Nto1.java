package Loops;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to print : ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }

}
