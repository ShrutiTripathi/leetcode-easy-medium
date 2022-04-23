package code.string;

import java.util.ArrayList;

public class FIndMaxNumberInArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1,2,3,2,7,8,1};

        System.out.println(FIndMaxNumberInArray(arrInt));
    }
    public static int FIndMaxNumberInArray(int[] arrInt){
        if(arrInt.length ==0 || arrInt == null){
            return 0;
        }
        int maxInt =0;
        for(int i=0; i<arrInt.length ; i++){
            if(maxInt<arrInt[i]){
                maxInt=arrInt[i];
            }
        }
        return maxInt;
    }
}
