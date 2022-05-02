package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOddsAndEvens {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 4};
        // int[] odds = {7,9}
        //int[] evens = {2,4}

        List<Integer> oddList = findOdds(arr);
        int[] odds = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            odds[i] = oddList.get(i);
            System.out.println("odd numbers: " + odds[i]);
        }

        List<Integer> evenList = findEvens(arr);
        int[] evens = new int[evenList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            evens[i] = evenList.get(i);
            System.out.println("even numbers: " + evens[i]);
        }

    }

    private static List<Integer> findOdds(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    private static List<Integer> findEvens(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
