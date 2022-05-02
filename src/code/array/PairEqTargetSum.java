package code.array;

import java.util.Arrays;

public class PairEqTargetSum {
    public static void main(String[] args) {
        int[] arr ={2,5,6,8,9};
        int sum= 15;
        //int[] rev= {3,4}
       int[] out = pairEqTargetSum(arr,sum);
        System.out.println(Arrays.toString(out));
    }

    private static int[] pairEqTargetSum(int[] arr, int sum) {
        int[] out = new int[2];
        if(arr== null || arr.length<0){
            return out;
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+ arr[j]< sum){
                i++;
            }else if(arr[i]+ arr[j]> sum){
                j--;
            }else if(arr[i]+ arr[j]==sum) {
                out[0] = arr[i];
                out[1] = arr[j];
                return out;
            }
        }
        return out;
    }
}
