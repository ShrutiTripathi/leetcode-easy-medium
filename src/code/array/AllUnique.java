package code.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllUnique {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,4,4,5};
        removeDuplicates(arr);
    }

    private static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i< arr.length; i++){
                set.add(arr[i]);
        }
        int[] unique = new int[set.size()];
        int i=0;
        for(int num : set){
            unique[i]= num;
            System.out.println(unique[i]);
            i++;
        }
        return unique;
    }
}
