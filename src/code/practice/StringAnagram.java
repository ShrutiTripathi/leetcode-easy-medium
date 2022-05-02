package code.practice;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String str1="may";
        String str2="amy";
        System.out.println(anagram(str1,str2));
    }

    private static boolean anagram(String str1, String str2) {
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for(int i=0; i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i),1);
            }
        }
        for(int i=0; i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
                if(map.get(str2.charAt(i))==0){
                    map.remove(str2.charAt(i));
                }
            }else{
                return false;
            }
        }
        if(map.size()==0){
            return true;
        }
        return false;
    }
}
