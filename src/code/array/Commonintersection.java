package code.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commonintersection {
    public static void main(String[] args) {
        int[] arr1 ={21, 34, 41, 22, 35};
        int[] arr2 = {61, 34, 45, 21, 11};
        // int[] out = {34, 21};
        commonIntersection(arr1, arr2);
    }

    private static int[] commonIntersection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<Integer>();


        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0; i <arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }

        for(int i=0; i< arr2.length; i++){
            if(map.containsKey(arr2[i])){
               // map.put(arr2[i],map.get(arr2[i])-1);
                list.add(arr2[i]);
            }
        }
        int[] inter = new int[list.size()];
    for(int i=0; i< list.size(); i++){
        inter[i]= list.get(i);
        System.out.println(inter[i]);
    }
        return inter;
    }


}
