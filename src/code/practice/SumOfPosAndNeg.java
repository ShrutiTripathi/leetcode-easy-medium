package code.practice;

import java.util.Arrays;

public class SumOfPosAndNeg {
    public static void main(String[] args) {
        int[] arr = {};
        int[] res= sumOfPosANdNeg(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sumOfPosANdNeg(int[] arr) {
        int[] res= new int[2];
        if(arr==null || arr.length>0){
            return res;
        }

        int negSum=0;
        int posSum=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<0){
                negSum+=arr[i];
            }else{
                posSum+=arr[i];
            }
        }
        res[0]=negSum;
        res[1]=posSum;
        return res;
    }
}
