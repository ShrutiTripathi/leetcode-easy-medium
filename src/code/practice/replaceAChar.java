package code.practice;

public class replaceAChar {
    public static void main(String[] args) {
        String str="banana";
        char ch='i'; //replace a with ch
        System.out.println(replaceAChar(str,ch));
    }
    public static String replaceAChar(String str,char ch){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='a'){
                stringBuilder.append(ch);
            }else{
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
