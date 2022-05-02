package code.practice;

import java.util.HashSet;
import java.util.Set;

public class lastrepeatingchar {
    public static void main(String[] args) {
        String str = "aabbccddeff";
        System.out.println(lastrepeatingchar(str));
    }
    public static char lastrepeatingchar(String str){
        Set<Character> set = new HashSet<Character>();
        for(int i=str.length()-1; i>0; i--){
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }else{
                set.add(str.charAt(i));
            }
        }
        return 0;
    }
}
