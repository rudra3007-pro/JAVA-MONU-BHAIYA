package Linear_search;

public class max {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,12,7};
        System.out.print(Max(arr));
    }
    public  static int Max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}