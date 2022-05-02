package code.numbers;

public class CheckAmstrong {
    public static void main(String[] args) {
        int num = 153;
        int pow=3;
        System.out.println(checkAmstrong(num,pow));
    }

    private static boolean checkAmstrong(int num, int pow) {
        int sum=0;
        double cube=0;
        int temp=num;
        while(temp > 0){
            cube= Math.pow(temp%10,pow);
            sum= (int) (cube +sum);
            temp=temp/10;
        }
        if(sum==num){
            return true;
        }
    return false;
    }

}
