package code.string;

public class FindMinNumberInArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 2, 7, 8, 1};

        System.out.println(fIndMinNumberInArray(arrInt));
    }

    public static int fIndMinNumberInArray(int[] arrInt) {
        if (arrInt.length == 0 || arrInt == null) {
            return 0;
        }
        int minInt = arrInt[0];
        for (int i = 0; i < arrInt.length; i++) {
            if (minInt > arrInt[i]) {
                minInt = arrInt[i];
            }
        }
        return minInt;
    }
}

