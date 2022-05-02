package code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class occurrences {
    public static void main(String[] args) {
       char[] arr = {'A','C','D','G','D','E','A','C','A'};
//       Output -> A=3;C=2;D=2;E=1;G=1
        occurrences(arr);
    }
    public static void occurrences(char[] arr){
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Character> set=map.keySet();
        for(char ch: set){
            System.out.print(ch+"="+map.get(ch)+";");
        }
    }
}

