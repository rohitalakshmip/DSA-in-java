package Loops;

public class TableOf17 {
    public static void main(String[] args) {
        // 154 iterations (loop is repeating) breaks at 171
//        for (int i = 17; i <= 170 ; i++) {
//            if(i%17==0)System.out.println(i);
//                        or
//        for (int i = 17; i <= 170 ; i=i+17){ //breaks at 187
//            System.out.println(i);
//                        or
        for (int i = 1; i <= 10 ; i=i+1){
            System.out.println(i*17);
        }

    }
}
