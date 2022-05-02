package code.practice;

import java.util.Arrays;

public class ReverseAnInArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int[] rev=  reverseAnIntArray(arr);
        System.out.println(Arrays.toString(rev));

    }

    private static int[] reverseAnIntArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
