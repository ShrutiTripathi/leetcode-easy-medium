package code.string;

import java.util.Arrays;

public class replaceAChar {
    public static void main(String[] args) {
        String str= "banana";
        String resStr= replaceUsingCharArray(str);
        System.out.println(resStr);

    }
    public static String  replaceAChar(String str){
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
                strBuild.append('i');
            }else{
                strBuild.append(str.charAt(i));
            }
        }
        return strBuild.toString();
    }

    public static String replaceUsingCharArray(String str){
       char[] chaArr=  str.toCharArray();
       for(int i=0; i<chaArr.length; i++){
           if(chaArr[i]=='a'){
               chaArr[i]='i';
           }
       }
        return new String(chaArr);
    }
}

