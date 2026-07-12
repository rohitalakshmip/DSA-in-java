package Array;

public class ForEach {
    public static void main(String[] args) {
        int[] arr ={5,8,2,6,9};
        // for each
        for(int ele : arr){   //:=in
            System.out.println(ele+" ");
        }
//        for(int ele : arr){       // this doesn't print arr*2
//            ele*=2;
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
        }
        for(int ele : arr){
            System.out.println(ele+" ");
        }
    }
}
