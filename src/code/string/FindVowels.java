package code.string;

import java.util.ArrayList;
import java.util.List;

public class FindVowels {
    public static void main(String[] args) {
        String str = "qwertyiooo";
        System.out.println(findVowels(str));
    }

    private static List<Character> findVowels(String str) {

        //char[] vowels = new char[str.length()];
        List<Character> vowels = new ArrayList<Character>();
        String vowelsMatch = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowelsMatch.contains(str.charAt(i) + "")) {
                vowels.add(str.charAt(i));
            }
        }
        return vowels;
    }
    public static char[] findVowels2(String str){
        List<Character> list = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++){
            if("AEIOUaeiou".indexOf(str.charAt(i))!=-1){
                list.add(str.charAt(i));
            }
        }
        char[] vowels = new char[list.size()];
        for(int i=0; i<list.size(); i++){
            vowels[i]= list.get(i);
            System.out.println(vowels[i]);
        }
        return vowels;
    }
}
