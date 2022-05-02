package code.practice;

public class checkifAllAredigits {
    public static void main(String[] args) {
        String str= "12345";
        System.out.println(checkifAllAredigits(str));
    }
    public static boolean checkifAllAredigits(String str){
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)<='9' && str.charAt(i)>='0')){
                return false;
            }
        }
        return true;
    }
}
