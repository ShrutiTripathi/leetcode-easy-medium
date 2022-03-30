package code.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdef";
        reverseString(str);
        System.out.println(reverseStringusingStringMethod(str));
    }
    //Method 1
    private static String reverseString(String str) {
        String reverse= "";
        for(int i=0; i<=str.length()-1;i++){
            char ch= str.charAt(i);
            reverse= ch+reverse;
        }
       // System.out.println(reverse);
        return  reverse;

    }
    //Method 2
    private static String reverseStringusingStringMethod(String str) {
         StringBuilder rev = new StringBuilder(str);
         return rev.reverse().toString();
    }
}
