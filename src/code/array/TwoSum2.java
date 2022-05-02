package code.array;

public class TwoSum2 {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target= 9;
        twoSum(numbers,target);
    }
        public static int[] twoSum(int[] numbers, int target) {
            int[] out = new int[2];
            if(numbers==null || numbers.length<0){
                return out;
            }
            int i=0;
            int j=numbers.length-1;

            while(i<j){
                if(numbers[i]+numbers[j]<target){
                    i++;
                }else if(numbers[i]+numbers[j]>target){
                    j--;
                }else if(numbers[i]+numbers[j]==target){
                    out[0]=i+1;
                    out[1]=j+1;
                    System.out.println(out[0]);
                    System.out.println(out[1]);
                    return out;
                }
            }
            return out;
        }
    }
