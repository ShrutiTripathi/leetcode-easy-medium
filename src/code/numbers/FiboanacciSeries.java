package code.numbers;

public class FiboanacciSeries {
    //create fibonacci series of 5 numbers
    public static void main(String[] args) {
        int num = 5;
      int[] res=  fibonacciSeries(num);
      for(int i: res){
          System.out.println(i);
      }
    }

    public static int[] fibonacciSeries(int num) {
        int[] series = new int[num];
        if(num==1){
            series[0]=1;
            return series ;
        }

        series[0]=1;
        series[1]=1;
        for(int i=2; i< num; i++){
            series[i]= series[i-1]+ series[i-2];
        }
        return series;
    }
}
