package code.string;

import java.util.HashMap;
import java.util.Map;

public class FIndFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str ="aaabbbcddde" ;
        System.out.println(finfFirstNonRepeatingChar(str));
    }

    private static char finfFirstNonRepeatingChar(String str) {
        if(str==null || str.length()==0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
