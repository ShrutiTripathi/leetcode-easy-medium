package code.practice;

public class convertNumericStringsToInt {
    public static void main(String[] args) {
        String str= "2113";
        convertNumericStringsToInt(str);
    }
    public static void convertNumericStringsToInt(String str){
        System.out.println(Integer.valueOf(str));

    }
}
