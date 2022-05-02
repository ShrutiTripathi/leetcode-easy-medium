package code.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {

    public static void main(String[] args) {
        String str ="";
        printDuplicates(str);
    }

    private static List<Character> printDuplicates(String str) {
        if (str.isEmpty() || str == null) {
            return new ArrayList<Character>();
        }
        List<Character> duplicates = new ArrayList<Character>();
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<str.length();i++){
            if(set.contains(str.charAt(i))){
                duplicates.add(str.charAt(i));
            }else {
                set.add(str.charAt(i));
            }
        }
        for(Character ch:duplicates){
            System.out.println(ch);
        }

        return duplicates;
    }
}
