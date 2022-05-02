package code.array;

import java.util.Arrays;

public class FIndExactlyOneDuplicateWithoutUsingMemory {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 2, 3}; // 5
        System.out.println(findDuplicates(arr));
    }

    private static int findDuplicates(int[] arr) {
        int duplicate = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate = arr[i];
            }
        }
        return duplicate;
    }
}
