package code.array;

public class FIndOddNums {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6};
        System.out.println(findOdd(arr));
    }

    private static int findOdd(int[] arr) {
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(!(arr[i]%2==0)){
                count++;
            }
        }
        return count;
    }
}
