package Array;

public class SumAndMax {
    public static void main(String[] args) {
        int[] arr ={2,3,-8,5,6,4};
        System.out.println("sum =");
        // SUM
        int sum =0;
        for (int i = 0; i < 6; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        // MAXIMUM
        int max = arr[0]; // or int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }System.out.println(max);
    }

}
