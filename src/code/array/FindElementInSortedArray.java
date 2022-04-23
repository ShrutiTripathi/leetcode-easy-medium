package code.array;

public class FindElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 9;
        System.out.println(findElementInSortedArray(arr, n));
    }

    private static int findElementInSortedArray(int[] arr, int n) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == n) {
                return n;
            } else if (n < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
