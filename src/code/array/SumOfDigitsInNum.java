package code.array;

public class SumOfDigitsInNum {
    public static void main(String[] args) {
        int num=100;
        System.out.println(sumOfDigitsInNum(num));
    }

    private static int sumOfDigitsInNum(int num) {
        int sum=0;
        while(num>0){
            int x= num%10;
             num= num/10;
            sum=sum+x;
        }

        return sum;
    }
}
