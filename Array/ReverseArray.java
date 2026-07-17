package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n = arr.length;
//      for(int i=0 ;i<n;i++){      //we have to use n/2 to get reverse array
//          int temp=arr[i];
//          arr[i] = arr[n-1-i];
//          arr[n-1-i]=temp;
//      }
//        for(int ele : arr){
//          System.out.print(ele+" ");
//      }

       int i = 0;
        int j = n-1;
      while(i<j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
      }
     for(int ele : arr){
         System.out.print(ele+" ");
      }
    }
}