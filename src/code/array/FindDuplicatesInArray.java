package code.array;

import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr ={3,5,1,3,7,7,9};
        List<Integer> list = findDuplicates(arr);
        for(int i: list){
            System.out.println(i);
        }
    }

    private static List<Integer> findDuplicates(int[] arr) {
        int[] res = new int[0];
        List<Integer> duplicates = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr.length;i++){
            if(set.contains(arr[i])){
                duplicates.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        return duplicates;
    }
}
