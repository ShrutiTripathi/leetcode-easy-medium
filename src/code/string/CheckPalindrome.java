package code.string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str ="NITINdfdf";
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        if(str==null && str.length()==0){
            return false;
        }
        int i=0;
        int j=str.length()-1;
       while(i<=j){
           if(str.charAt(i)!= str.charAt(j)){
               return false;
           }else{
               i++;
               j--;
           }
       }
        return true;
    }
}
