package code.string;

public class ReverseAString {
    public static void main(String[] args) {
        String str ="abcdef";
        System.out.println(reverseString3(str));
    }

    private static String reverseString1(String str) {
        String revStr = "";
        if(str== null || str.length()==0){
            return revStr;
        }
        for(int i=0; i< str.length(); i++){
           revStr = str.charAt(i)+revStr;
        }
        return revStr;

    }
    private static String reverseString2(String str) {
        String revStr="";
        for(int i=str.length()-1; i>=0; i--){
            revStr= revStr + str.charAt(i);
        }
        return revStr;
    }
    private static String reverseString3(String str) {
       StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            stringBuilder = stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
