package code.practice;

public class findMinMax {
    public static void main(String[] args) {
        int[] arr = {1,4,7,4,3,88,7,};
        int[] res = minmaxNum(arr);
        System.out.println("max is: "+res[0] +" and min is : "+ res[1]);
        // System.out.println(minmaxNum(arr)[1]);
    }

    private static int[] minmaxNum(int[] arr) {
        int[] res = new int[2];
        if(arr!=null && arr.length> 0 ) {
        int max = arr[0];
        int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
            res[0]=max;
            res[1]=min;
        }

        return res;
    }
}
