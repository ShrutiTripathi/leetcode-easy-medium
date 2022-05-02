package code.practice;

public class longestSubstringWIthKDistinctNum {
    public static void main(String[] args) {
        String str ="abcdefakm";
        System.out.println(longestSubstringWIthKDistinctNum(str));
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
