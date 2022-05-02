package code.string;

public class reverseAStringUsingCharArray {
    public static void main(String[] args) {
        String str = "abcd";
        reverseAStringUsingCharArray(str);
    }
    public static void reverseAStringUsingCharArray(String str){
      char[] charArr=  str.toCharArray(); //['a','b','c','d']
      char temp= 0;
      int i=0;
      int j=charArr.length-1;
      while(i<=j){
         temp= charArr[i];
         charArr[i]=charArr[j];
         charArr[j]=temp;
         i++;
         j--;
      }
      StringBuilder rev = new StringBuilder();
        for(int x=0; x< charArr.length; x++){
            rev.append(charArr[x]);
        }
        System.out.println(rev);
    }
}
