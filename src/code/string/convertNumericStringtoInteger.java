package code.string;

public class convertNumericStringtoInteger {
    public static void main(String[] args) {
        String str ="32423432";
        System.out.println(convertStringtoInteger(str));
    }

    private static int convertStringtoInteger(String str) {
       int intVal=0;
       char ch=0;
       intVal= Integer.valueOf(str);
       // System.out.println( str.toCharArray());
//        for(int i=0;i<=str.length();i++){
//           ch= str.charAt(i);
//        }
        return intVal;
    }
}
