package code.practice;

public class removeAllVowels {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(removeAllVowels( str));
    }
    public static String removeAllVowels( String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
        if("AEIOUaeiou".indexOf(str.charAt(i))==-1){
            stringBuilder.append(str.charAt(i));
        }
        }
        return stringBuilder.toString();
    }
}
