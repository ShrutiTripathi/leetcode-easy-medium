package code.array;

public class FIndSecondMinNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 8, 5};
        System.out.println(findSecondMin(arr));
    }

    private static int findSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            }
        }

        return secondMin;
    }


}