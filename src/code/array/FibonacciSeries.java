package code.array;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=5;
        //1,1,2,3,5
       int[] res= printFibonacci(num);
        for(int i:res){
            System.out.println(i);
        }
    }

    private static int[] printFibonacci(int num) {
        int[] fs= new int[num];
        if(num==1){
            fs[0]=1;
            return fs;
        }
        fs[0]=1;
        fs[1]=1;
        for(int i=2; i<num; i++){
            fs[i]= fs[i-1]+fs[i-2];
        }
        return fs;
    }
}
