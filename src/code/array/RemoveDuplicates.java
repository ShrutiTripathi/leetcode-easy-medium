package code.array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,6};
        removeDuplicate(arr);
    }

    private static int[] removeDuplicate(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = map.keySet();
        for(int i: set){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        int[] unique = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            unique[i]= list.get(i);
            System.out.println(unique[i]);
        }
        return unique;
    }
}

