package code.string;

public class swapTwoNumbers {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        swapTwoNumbersWithoutExtraVar(num1,num2);

    }
    //with extra variable
    public static void swapTwoNumbers(int num1, int num2){
        int temp;
        temp= num1;
        num1=num2;
        num2=temp;
        //System.out.println("num1: "+num1 +" num2: "+num2 );
    }

    //without extra variable
    public static void swapTwoNumbersWithoutExtraVar(int num1, int num2){
        num1 = num1 +num2;
        num2 = num1 - num2;
        num1 = num1- num2;
        System.out.println("num1: "+num1 +" num2: "+num2 );
    }
}
