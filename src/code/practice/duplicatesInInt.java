package code.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicatesInInt {
    public static void main(String[] args) {
        int num= 1223445;
        duplicatesInInt(num);
    }
    public static int[] duplicatesInInt(int num){
        List<Integer> list =  new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        int temp=num;
        int digit=0;
        while(temp>0){
            digit= temp%10;
            if(set.contains(digit)){
                list.add(digit);
            }else{
                set.add(digit);
            }
            temp=temp/10;
        }
        int[] duplicates = new int[list.size()];
        for(int i=0;i<list.size();i++){
            duplicates[i]=list.get(i);
            System.out.println(duplicates[i]);
        }
    return duplicates;
    }
}

