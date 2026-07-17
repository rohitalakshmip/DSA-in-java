package Array;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr ={9,8,7};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        System.out.print(product);
    }
}
