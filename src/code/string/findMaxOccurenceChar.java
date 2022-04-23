package code.string;

import java.util.HashMap;
import java.util.Map;

public class findMaxOccurenceChar {
    public static void main(String[] args) {
        String str = "aabccccccddd";
        System.out.println(findMaxOccurenceChar(str));
    }

    public static char findMaxOccurenceChar(String str){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
           if(map.containsKey(str.charAt(i))) {
               map.put(str.charAt(i), map.get(str.charAt(i))+1);
           }else{
               map.put(str.charAt(i),1);
           }
        }
       // a2, b1, c3, d4
char maxChar=0;
        for(int i=0; i<str.length();i++){
            Map.Entry<Character,Integer> entry = map.entrySet().iterator().next();
             maxChar= entry.getKey();
            if(map.get(maxChar)<=entry.getValue()){
                maxChar= str.charAt(i);
            }

        }
        return maxChar;
    }
}
