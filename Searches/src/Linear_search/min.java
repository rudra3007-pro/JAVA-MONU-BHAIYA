package Linear_search;

public class min {
    public static void main(String[] args){
        int[] arr = {1,2,3,0,5,12,7};
        System.out.print(Min(arr));
    }
    public  static int Min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}