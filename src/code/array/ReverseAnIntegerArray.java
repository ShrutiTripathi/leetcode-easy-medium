package code.array;

public class ReverseAnIntegerArray {
    // int[] arr = {1,2,3,4}
    // int[] out = {5,4,3,2}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       int[] output=  reverseWithoutModifyingTheOldArray(arr);
        for(int i=0; i<output.length ; i++){
            System.out.println(output[i]);
        }
    }

   public static void reverseAnIntArr(int[] arr){
       int i= 0;
       int j= arr.length-1;
       int temp=0;
       while(i <= j){ // {4,2,3,1} i=1, j=2 -> {4,3,2,1} i=2, j=1
           temp= arr[i];
           arr[i]= arr[j];
           arr[j]= temp;
           i++;
           j--;
       }
    }

    public static int[] reverseWithoutModifyingTheOldArray(int[] arr){
        int[] out = new int[arr.length];
        int j=arr.length-1;
        for(int i=0; i<arr.length;i++){
            out[j]=arr[i];
            j--;
        }
//        for(int i=0; i<out.length ; i++){
//            System.out.println(out[i]);
//        }
        return out;
    }
}
