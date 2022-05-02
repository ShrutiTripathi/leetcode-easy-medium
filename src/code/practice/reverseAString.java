package code.practice;

import java.util.Arrays;

public class reverseAString {
    public static void main(String[] args) {
        String str = "abcdef";
       // System.out.println(reverseAStringWithStringBuilder(str));
        System.out.println(reverseAStringWithCharArray(str));
    }

    private static String reverseAStringWithCharArray(String str) {
        char[] rev = new char[str.length()];
        for(int i=str.length()-1; i>=0; i--){
            rev[i]=str.charAt(i);
        }
        int i=0;
        int j=str.length()-1 ;
        char temp=0;
        while(i<=j){
            temp= rev[i];
            rev[i] = rev[j];
            rev[j]= temp;
            i++;
            j--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int x=0; x<rev.length; x++) {
            stringBuilder.append(rev[x]);
        }
        return stringBuilder.toString();
    }

    public static String reverseAStringWithStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
