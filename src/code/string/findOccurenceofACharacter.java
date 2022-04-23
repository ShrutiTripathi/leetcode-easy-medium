package code.string;

import java.util.HashMap;
import java.util.Map;

public class findOccurenceofACharacter {
    public static void main(String[] args) {
        char ch='s';
        String str ="sssssd";
        System.out.println(findOcurrence(str,ch));
        System.out.println(findOcurrenceUsingStringMethod(str,ch));
        }

    private static int findOcurrence(String str,Character ch) {
        int count = 0;
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i=0; i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        if(!map.containsKey(ch)){
            return -1;
        }else{
            return map.get(ch);
        }
    }
    private static long findOcurrenceUsingStringMethod(String str,Character ch) {
    return  str.chars().filter(str1 -> str1==(char)ch).count();
    }
}

