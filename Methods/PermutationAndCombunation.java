package Methods;

import java.util.Scanner;

public class PermutationAndCombunation {
    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//        //nCr                         normal method
//        int nfact = 1;
//        for (int i = 1;i<=n;i++) {
//            nfact*=i;
//        }
//        int rfact = 1;
//        for (int i = 1;i<=r;i++) {
//            rfact*=i;
//        }
//        int nMinusrfact = 1;
//        for (int i = 1;i<=n-r;i++) {
//            nMinusrfact*=i;
//        }
//        int ncr = nfact/(rfact* nMinusrfact);
//        System.out.println(ncr);
        // return type
        int ncr= fact(n)/(fact(r)*fact(n-r));
        int npr =fact(n)/fact(n-r);
        System.out.println(ncr+" is the combination of "+n+" "+r);
        System.out.println(npr+" is the permutation of "+n+" "+r);
    }

}
