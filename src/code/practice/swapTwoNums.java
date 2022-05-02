package code.practice;

public class swapTwoNums {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        swap(num1, num2);
        swapWithThirdNum(num1, num2);
    }

    private static void swapWithThirdNum(int num1, int num2) {
        int temp= num1;
         num1= num2;
         num2= temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void swap(int num1, int num2){
        int total=num1+num2;
         num1= total-num1;
         num2= total-num1;
        System.out.println(num1);
        System.out.println(num2);

    }
}

