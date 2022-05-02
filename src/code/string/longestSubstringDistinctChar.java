package code.string;

import java.util.Map;

public class longestSubstringDistinctChar {
    public static void main(String[] args) {
        int k=2;
        String str="araac";
        getSubstring(str,k);
    }

    private static String getSubstring(String str, int k) {
        String res = "";
        String substrofkchars="";
        int i=0;
//        while(i<=k){
//            substrofkchars=substrofkchars+str.charAt(i);
//            res=res+str.charAt(i);
//            if(str.charAt(i)!=str.charAt(i+1) && substrofkchars.contains(str.charAt(i))){
//
//                i++;
//            }
//
//        }
        return  res;
    }
    public static String longestSubstringWIthKDistinctNum(String str){
        StringBuilder substr = new StringBuilder();
        for(int i=0; i<str.charAt(i);i++){
            if(substr.toString().indexOf(str.charAt(i))!= -1){
                return substr.toString();
            }else{
                substr.append(str.charAt(i));
            }
        }

        return "";
    }
}
