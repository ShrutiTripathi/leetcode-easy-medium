package code.numbers;

import java.util.*;

public class FIndDuplicatesInInteger {
    public static void main(String[] args) {
        //I -> 312244
        //O -> [2,4]
        int num = 311;
        List<Integer> list = duplicates(num);
        int[] out = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            out[i] = list.get(i);
            System.out.println(out[i]);
        }
    }

    private static List<Integer> duplicates(int num) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int temp = num;
        int digit = 0;
        while (temp > 0) {
            digit = temp % 10;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
                list.add(digit);
            } else {
                map.put(digit, 1);
            }
            temp = temp / 10;
        }

//        while(num>0){
//            digit= num%10;
//           if(map.get(digit)>1 && !list.contains(digit)){
//               list.add(digit);
//           }
//           num=num/10;
//        }

//        Set<Integer> keys = map.keySet();
//        for(int key : keys){
//            if(map.get(key) > 1){
//                list.add(key);
//            }
//        }

        return list;
    }
}



