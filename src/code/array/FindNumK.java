package code.array;

public class FindNumK {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int k=3;
        System.out.println(findNum(arr,k));
    }

    private static int findNum(int[] arr, int k) {
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int mid= (i+j)/2;
            if(k==arr[mid]){
                return mid;
            }else if(k<arr[mid]){
                j= mid-1;
            }else if(k>arr[mid]){
                i=mid+1;
            }
        }
        return 0;
    }
}
