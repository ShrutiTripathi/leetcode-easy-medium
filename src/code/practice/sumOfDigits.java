package code.practice;

public class sumOfDigits {
    public static void main(String[] args) {
        int num=1231;
        System.out.println(sumOfDigits(num));
    }
    public static int sumOfDigits(int num){
        int digit=0;
        int temp=num;
        int sum=0;
        while(temp>0){
            digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        return sum;
    }
}
