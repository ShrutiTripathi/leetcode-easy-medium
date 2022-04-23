package code.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class checkIfContainsRepeatingChar {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(checkIfContainsRepeatingChar(str));
    }
    public static boolean checkIfContainsRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < str.length(); i++) {
                if (set.contains(str.charAt(i))) {
                    return  true;
                }else{
                    set.add(str.charAt(i));
                }
            }
            return false;
        }
    }

