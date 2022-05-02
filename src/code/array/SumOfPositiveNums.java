package code.array;

public class SumOfPositiveNums {
    public static void main(String[] args) {
        int[] intArr = {-1,5};
        int sumres= sumOfPositiveNums(intArr);
        System.out.println(sumres);
    }

    private static int sumOfPositiveNums(int[] intArr) {
        int sum=0;
        for(int i=0; i< intArr.length; i++){
            if(intArr[i]>0){
                sum+=intArr[i];
            }
        }
        return sum;
    }
}
