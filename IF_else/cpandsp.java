package IF_else;

import java.util.Scanner;

public class cpandsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();
        if(sp>cp) System.out.println("Profit of : "+(sp-cp)+" Rs");
        if(sp==cp) System.out.println("No profit no loss ");
        if(sp<cp) System.out.println("Loss of : "+(cp-sp)+" Rs");
        sc.close(); //option
    }
}
