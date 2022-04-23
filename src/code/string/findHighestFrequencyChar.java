package code.string;

import java.util.HashMap;
import java.util.Map;

public class findHighestFrequencyChar {

    public static void main(String[] args) {
        String str="aabbccccdde";
        System.out.println(findHighestFrequencyChar(str));
    }
    public static char findHighestFrequencyChar(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i< str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        char highestFreqChar=0;
        int maxVal= map.get(str.charAt(0));
        for(char ch:map.keySet()){
            int val= map.get(ch);
            if(val>=maxVal){
                maxVal=val;
                highestFreqChar=ch;
            }
        }
        return highestFreqChar;

    }
}
