package code.practice;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr ={3,6,2,8,1};
       int[] rev=  sortArray(arr);
        System.out.println(Arrays.toString(rev));
//       for(int i: rev){
//           System.out.println(i);
//       }
    }

    private static int[] sortArray(int[] arr) {
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        return arr;
    }

}
