package code.string;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        System.out.println(checkAnagrams(str1, str2));
    }

    private static boolean checkAnagrams(String str1, String str2) {

        if (str1 == null && str2 == null) {
            return true;
        }

        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                if (map.get(str2.charAt(i)) == 0) {
                    map.remove(str2.charAt(i));
                }
            }

        }


        if (map.size() == 0) {
            return true;
        }
        return false;
    }
}
