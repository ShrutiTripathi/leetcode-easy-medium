package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNum {
    public static void main(String[] args) {
        int k=100;
        int missing = 9;
      int[] arr= createArrayTillHundred(k);
       // System.out.println(Arrays.toString(arr));
       int[] out = removeRandomNumFromArray(arr,missing);
        findMissingNum(out);
    }

    private static int[] createArrayTillHundred(int k) {
        int[] arr = new int[k];
        for(int i=0; i<arr.length; i++){
            arr[i]=i+1;
        }
        return arr;
    }

    public static int[] removeRandomNumFromArray(int[] arr, int missing){
        List<Integer> list = new ArrayList<Integer>();
        for(int i: arr){
            if(i!=missing){
                list.add(i);
            }
        }
        int[] out = new int[list.size()];
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=missing) {
                out[i]=list.get(i);
            }
           // System.out.println(out[i]);
        }
        return out;
    }

    public static int findMissingNum(int[] arr){
        int missing=0;
        int totalSum=0;
        int sumOfGivenArray=0;
        for(int i=0; i< arr.length; i++){
            sumOfGivenArray+=arr[i];
        }
        for(int i=0; i<=100; i++){
            totalSum+=i;
        }
        System.out.println("sumOfGivenArray "+sumOfGivenArray);
        System.out.println("totalSum "+totalSum);
        missing= totalSum - sumOfGivenArray;
        System.out.println("missingNum "+missing);
        return missing;

    }
}
