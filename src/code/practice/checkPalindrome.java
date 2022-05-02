package code.practice;

public class checkPalindrome {
    public static void main(String[] args) {
        String str= "nitine";
        System.out.println(checkpalindrome(str));
    }

    private static boolean checkpalindrome(String str) {
        int i= 0;
        int j= str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                return true;
            }else{
                i++;
                j--;
            }
        }
        return false;
    }
}
