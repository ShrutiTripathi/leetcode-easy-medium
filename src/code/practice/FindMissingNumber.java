package code.practice;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5};
        System.out.println("missing num : "+findMissingNum(arr));
    }

    private static int findMissingNum(int[] arr) {
        int total=0;
        int arrTotal=0;
        int missingNum=0;
        for(int i=0; i<arr.length; i++){
            arrTotal= arrTotal+ arr[i];
        }
        System.out.println("arrtotal: "+arrTotal);
       // total= (1+arr[arr.length-1])*((arr.length+1)/2);
        for(int i=1; i< arr.length+2; i++){
            total= total+ i;
        }
        System.out.println("total: "+total);
        missingNum= total - arrTotal;
        System.out.println("missingNum: "+missingNum);
        return missingNum;
    }
}
