package code.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,5,8};
        // int[] res = {2,5}
        int[] res =  findDUplicates(arr);
        for(int i: res){
            System.out.println(i);
        }

    }

    private static int[] findDUplicates(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        int[] duplicates = new int[list.size()];
        for(int i= 0; i< list.size(); i++){
            duplicates[i]= list.get(i);
        }
        return  duplicates;
    }
}
