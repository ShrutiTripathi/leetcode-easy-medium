package TwentyfiveCodingQuestions;

import java.util.HashMap;
import java.util.Map;
//create a map for one string and remove the count in the map for another string

public class Anagrams {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "amy";
        anagramTest(str1, str2);
    }

    private static boolean anagramTest(String str1, String str2) {
        //Check if any of the string is null
        if(str1==null || str2== null){
            System.out.println(str1 + " and " + str2 + " are not anagrams");
            return false;
        }
        //Check if strings are of unequal length
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
            return false;
        }

        //fill the map with value count= 1 against each character
        // if character is already present then add the count to +1
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }
        // if the character in String 2 is found in the map then -1 the count of that character
            //Along with it remove the map if its value becomes 0
        // else return not anagram there itself
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                if (map.get(str2.charAt(i)) == 0) {
                    map.remove(str2.charAt(i));
                }
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
                return false;
            }
        }
        if (map.size() == 0) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
            return true;
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
            return false;
        }
    }
}