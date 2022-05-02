package code.practice;

public class printVowelsAndConsonants {
    public static void main(String[] args) {
        String str="abcdefghi";
        System.out.println( printVOwels(str));
        System.out.println(printConsonants(str));

    }
    public static String printVOwels(String str){
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if("AEIOUaeiou".indexOf(str.charAt(i))!=-1){
                strBuild.append(str.charAt(i));
            }
        }
       return strBuild.toString();
    }
    public static String printConsonants(String str){
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            if("AEIOUaeiou".indexOf(str.charAt(i))==-1){
                strBuild.append(str.charAt(i));
            }
        }
        return strBuild.toString();
    }

}
