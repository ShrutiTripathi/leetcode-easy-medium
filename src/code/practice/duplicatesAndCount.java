package code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatesAndCount {
    public static void main(String[] args) {
        String str= "aabccdd";
        Map<Character,Integer> map= duplicatesAndCount(str);
        Set<Character> set = map.keySet();
        for(char ch: set){
            System.out.println("key: "+"'"+ch+"'"+"count: "+map.get(ch));
        }
    }
    public static Map<Character,Integer> duplicatesAndCount(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }
}
