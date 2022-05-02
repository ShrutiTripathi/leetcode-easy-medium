package code.numbers;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 21233212;
        System.out.println(checkPalindromeNum(num));
    }

    private static boolean checkPalindromeNum(int num) {
        int temp = num;
        int digit = 0;
        int fNum = 0;
        while (temp > 0) {
            digit = temp % 10;
            fNum = fNum * 10 + digit;
            temp = temp / 10;
        }
        if (num == fNum) {
            return true;
        }
        return false;
    }
}
