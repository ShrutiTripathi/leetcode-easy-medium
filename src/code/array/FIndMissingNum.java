package code.array;


/// arr of N -> 1 2 ... N
/// arr of N -1 -> 1 ....<>... N

// 4 -> 1 2 3 4
// 3 -> 4 2 3

public class FIndMissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findMissingNum(arr));
    }

    private static int findMissingNum(int[] arr) {
       int  arrNumSum=0;
        int missingNum=0;
        int total=0;
        for(int i=0; i<arr.length; i++){
           total= total +arr[i];
       }
        int arrlen = arr.length+1;
        for(int i=1; i<=arrlen; i++)
        {
            arrNumSum = arrNumSum +i;
        }

        missingNum = arrNumSum - total;
        return missingNum;
    }
}
