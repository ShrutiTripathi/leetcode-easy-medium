package code.practice;

public class reverseANum {
    public static void main(String[] args) {
        int num=12345;
        System.out.println(reverseANum(num));
    }
    public static int reverseANum(int num){
        int temp=num;
        int digit=0;
        int rev=0;
        while(num>0){
            digit= num%10;
            rev= rev*10+digit;
            num=num/10;
        }
        return rev;
    }
}
