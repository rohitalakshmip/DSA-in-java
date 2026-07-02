package IF_else;// even 0r odd

import java.util.Scanner;

public class ternaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int  n =sc.nextInt();
        System.out.println(n+" "+ ((n%2==0)?"Even number":"Odd number"));
    }
}
