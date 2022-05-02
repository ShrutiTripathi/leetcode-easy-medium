package code.practice;

public class FindElelmentsInSortedArray {
    // use binary search approach
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,7};
        int n = 5;
        System.out.println(findElementInSortedArray(arr, n));
    }

    private static int findElementInSortedArray(int[] arr, int n) {
        int i=0;
        int j= arr.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(n==arr[mid]){
                return mid;
            }else if(n<arr[mid]){
                j=mid-1;
            }else if(n>arr[mid]){
                i=mid+1;
            }
        }
        return -1;
    }
}
