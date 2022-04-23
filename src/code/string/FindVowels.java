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
}
