package TwentyfiveCodingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str= "qqqqwwert";
        System.out.println(firstNonRepeatedCharacter(str));

    }
    private static char firstNonRepeatedCharacter(String str) {
        char firstNonReaptingChar = '0';
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0; i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return firstNonReaptingChar;
    }
}
