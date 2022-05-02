package code.practice;

import java.util.HashSet;
import java.util.Set;

public class FIndExactlyOneDuplicateNum {
    public static void main(String[] args) {
        int[] arr= {0, 3, 1, 2, 3};
        System.out.println(findOneDuplicate(arr));
    }

    private static int findOneDuplicate(int[] arr) {
       // int duplicate=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i< arr.length; i++){
            if(set.contains(arr[i])){
              //  duplicate=arr[i];
                return arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        return 0;
    }
}
