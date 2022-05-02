package code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestFrequenctChar {
    public static void main(String[] args) {
        String str="abcddccaaaaa";
        System.out.println(highestFreq(str));
    }

    private static char highestFreq(String str) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i< str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int maxVal=map.get(str.charAt(0));
        char highreqChar=0;
        Set<Character> set= map.keySet();
        for(char ch: set){
          if(map.get(ch)>=maxVal) {
              maxVal=map.get(ch);
              highreqChar=ch;
          }
        }
        return highreqChar;
    }
}
