package code.practice;

public class SecondLargestNumber {
    public static void main(String[] args) {
            int[] arr = {2, 3, 1, 8, 5,9};
            System.out.println(findSecondMax(arr));
        }

    private static int findSecondMax(int[] arr) {
        int max =arr[0];
        int secondMax = arr[0];
        for(int i=1; i< arr.length; i++){
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
        }
        return secondMax;
    }
}
