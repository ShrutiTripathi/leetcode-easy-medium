package code.array;

import java.util.Arrays;

public class FIndKthLarNum {
    public static void main(String[] args) {
        int[] arr = {7};
        int k = 3;
        System.out.println(findKthLarNum(arr, k));
    }

    private static int findKthLarNum(int[] arr, int k) {
       // Arrays.sort(arr);
        if(k>arr.length){
            return 0;
        }
        int temp=0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length - k];
    }
}
