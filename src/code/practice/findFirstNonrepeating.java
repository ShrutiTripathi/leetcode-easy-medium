package code.practice;

import java.util.HashSet;
import java.util.Set;

public class findFirstNonrepeating {
    public static void main(String[] args) {
        String str= "abcdefbcd";
        System.out.println(findFirstNonrepeating(str));
    }
    public static char findFirstNonrepeating(String str){
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<str.charAt(i); i++){
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }else{
                set.add(str.charAt(i));
            }
        }
    return 0;
    }
}
