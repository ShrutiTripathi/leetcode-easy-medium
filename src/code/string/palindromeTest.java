package code.string;

public class palindromeTest {
    public static void main(String[] args) {
        String str="nitinn";
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        if(str.length()==1){
            return true;
        }
        int i=0,j=str.length()-1;
       while(i<=j){
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
