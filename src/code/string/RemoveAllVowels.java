package code.string;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String str = "adieu";
        String res = removeALlVowelsByCHarArray(str);
        System.out.println(res);
    }

    public static String removeALlVowels(String str) {
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //  if(!(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')){
            if ("AEIOUaeiou".indexOf(str.charAt(i)) == -1) {
                strBuild.append(str.charAt(i));
            }
        }
        return strBuild.toString();
    }

    public static String removeALlVowelsByCHarArray(String str) {
        char[] chaArray = str.toCharArray();
        for (int i = 0; i < chaArray.length; i++) {
           // if (chaArray[i] == 'a' || chaArray[i] == 'e' || chaArray[i] == 'i' || chaArray[i] == 'o' || chaArray[i] == 'u') {
              if("AEIOUaeiou".indexOf(chaArray[i])==-1){
                chaArray[i] = 0;
            }
        }
        return new String(chaArray);
    }
}
