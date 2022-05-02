package code.array;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class SumOfPosAndNeg {
    public static void main(String[] args) {
        int[] intArr = {1,2,-3,4,-5};
        int[] sum = sumOfPosAndNeg(intArr);
        System.out.println("neg sum is : "+sum[0] +"\npos sum is: "+sum[1]);
    }

    public static int[] sumOfPosAndNeg(int[] intArr){
    int[] sum = new int[2];
    int negSum=0;
    int posSum=0;
    for(int i=0; i< intArr.length; i++){
        if(intArr[i]<0){
            negSum+=intArr[i];
        }else{
            posSum+=intArr[i];
        }
    }
    sum[0]=negSum;
    sum[1]=posSum;
        return sum;
    }
}
