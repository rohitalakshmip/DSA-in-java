package Array;

public class SecondMaxElement {
    public static void main(String[] args) {
     int[] arr ={10,3,6,15,34,23};
     int max = Integer.MIN_VALUE;
     int smax= Integer.MIN_VALUE;
        // first max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }System.out.println(max);
        // second max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];
        }System.out.println(smax);
    }
}
