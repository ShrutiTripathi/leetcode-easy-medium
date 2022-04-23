package code.array;

public class FindMinMaxInt {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,8,5};
        int[] res = minmaxNum(arr);
        System.out.println("min is: "+res[0] +" and max is : "+ res[1]);
       // System.out.println(minmaxNum(arr)[1]);
    }

    private static int[] minmaxNum(int[] arr) {
        int[] res = new int[2];
        int min= arr[0];
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        res[0]=min;
        res[1]=max;
        return res;
    }
}
