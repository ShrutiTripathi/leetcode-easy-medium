package code.string;

import java.util.HashMap;
import java.util.Map;

public class duplicatesAndCount {
    public static void main(String[] args) {
        String str="qqwweerrrrrrtyu";
        System.out.println(getDuplicatesAndCount(str));
    }
    public static Map<Character,Integer> getDuplicatesAndCount(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }else{
                map.put(str.charAt(i),1);
            }
        }

        return map;
    }
}
