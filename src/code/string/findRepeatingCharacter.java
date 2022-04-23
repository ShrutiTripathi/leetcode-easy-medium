package code.string;

import java.util.HashSet;

public class findRepeatingCharacter {

    public static void main(String[] args) {
        String str ="abcdeeff";
        System.out.println(findRepeatingCharacter(str));
    }

public static char findRepeatingCharacter(String str){
        if(str.isEmpty() || str == null){
            return 0;
        }

        HashSet<Character> set = new HashSet<Character>();
        for (int i=0; i<str.length(); i++){
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }else{
                set.add(str.charAt(i));
            }
        }
        return 0;
}
}
