package code.string;

import java.util.HashSet;
import java.util.Set;

public class findLastRepeatingCharacter {
    public static void main(String[] args) {
        String str ="abcdeeff";
        System.out.println(findRepeatingCharacter(str));
    }
    public static char findRepeatingCharacter(String str){
        if(str== null || str.length() ==0 ){
            return 0;
        }
      //  char lastChar=0;
        Set<Character> set = new HashSet<Character>();
        for(int i=str.length()-1; i>=0; i--){
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }else{
                set.add(str.charAt(i));
            }
        }
        return 0;
    }
}
