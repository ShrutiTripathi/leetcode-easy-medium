package code.string;

import java.util.ArrayList;
import java.util.List;

public class IfStrContainsOnlyDigits {
    public static void main(String[] args) {
        String str ="123455eee5";
        System.out.println(ifStrContainsOnlyDigits(str));
    }

    private static boolean ifStrContainsOnlyDigits(String str) {
        List<Character> list = new ArrayList<Character>();
        for(int i=0; i<str.length();i++){
            if(!('0'<=str.charAt(i) && str.charAt(i)<='9')){
                return false;
            }
        }
        return true;
    }
}
