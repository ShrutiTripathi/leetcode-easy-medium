package code.practice;

import java.util.Arrays;

public class fiboannacciSeries {
    public static void main(String[] args) {
        int size= 6;
        int[] res= createFibonnacci(size);
        System.out.println(Arrays.toString(res));
    }

    private static int[] createFibonnacci(int size) {
        int[] arr = new int[size];
        arr[0]=1;
        arr[1]=1;
        for(int i=2; i< size; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
}
