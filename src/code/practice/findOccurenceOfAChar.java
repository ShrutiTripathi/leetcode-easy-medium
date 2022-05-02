package code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findOccurenceOfAChar {
    public static void main(String[] args) {
        String str ="abcdeeeeeeeeab";
        char c='e';
        System.out.println(findOccurenceOfAChar(str,c));
    }
    public static int findOccurenceOfAChar(String str,char ch){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i< str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        return map.get(ch);
    }
}
