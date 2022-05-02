package code.practice;

public class armstrong {
    public static void main(String[] args) {
        int num= 153;
        System.out.println(checkarmstrong(num));
    }

    private static boolean checkarmstrong(int num) {
        int temp=num;
        int digit=0;
        int sum=0;
        while(temp >0){
            digit=temp%10;
            sum+=Math.pow(digit,3);
            temp=temp/10;
        }
        if(num==sum){
            return true;
        }
        return false;
    }
}
