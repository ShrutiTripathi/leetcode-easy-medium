package code.practice;

import java.util.ArrayList;
import java.util.List;

public class findVowels {
    public static void main(String[] args) {
        String str="abcdef";

        findVowels(str);
    }
    public static char[] findVowels(String str){
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
