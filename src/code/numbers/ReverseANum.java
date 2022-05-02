package code.numbers;

public class ReverseANum {
    public static void main(String[] args) {
        int num = 1234;
        // out -> int out = 4321;
        System.out.println(reverseANum(num));
    }

    private static int reverseANum(int num) {
        int temp = num;
        int digit = 0;
        int digCount = 0;
        int fNum = 0;
        // temp = 1234, digit = 4, fNum = 4
        // temp = 123, digit = 3, fNum = 43
        // temp = 12, digit = 2, fNum = 432
        // temp = 1, digit = 1, fNum = 4321
        while (temp > 0) {
            digit = temp % 10;
            fNum = fNum * 10 + digit;
            temp = temp / 10;
        }
        return fNum;
//        int temp2 = num;
//        int digit2 = 0;
//        int rev = 0;
//        while (temp2 > 0) {
//            digit2 = temp2 % 10;
//            rev = (int) (rev + digit2 * (Math.pow(10, digCount - 1)));
//            temp2 = temp2 / 10;
//            digCount--;
//        }
//        return rev;
    }
}
