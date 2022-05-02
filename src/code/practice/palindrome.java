package code.practice;

import java.io.FileNotFoundException;

public class palindrome {
    public static void main(String[] args) {
        int num = 123212;
        System.out.println(palindrome(num));
    }

    public static boolean palindrome(int num) {
        int digit = 0;
        int fNum = 0;
        int temp = num;
        while (temp > 0) {
            digit = temp % 10;
            fNum = fNum * 10 + digit;
            temp = temp / 10;
        }
        if (fNum == num) {
            return true;
        }
        return false;
    }
}
