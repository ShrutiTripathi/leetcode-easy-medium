package code.string;

public class CheckIfAllAreDIgits {
    public static void main(String[] args) {
        String str ="1234c5";
        System.out.println(checkIfAllAreDigits(str));
    }

    private static boolean checkIfAllAreDigits(String str) {
        if(str==null || str.length() ==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
                return false;
            }
        }
        return  true;
    }

}
