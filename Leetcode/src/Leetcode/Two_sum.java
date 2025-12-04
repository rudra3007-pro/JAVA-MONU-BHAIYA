package Leetcode;

public class Two_sum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target =  9;
//        int [] a = Sum(sum,target);



    }
    public static int[] Sum(int[] arr , int target){
        int[] sum = {0,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[i+1]==target){
                sum[0] = arr[i];
                sum[1] = arr[i+1];
                break;
            }
        }
        return sum;

    }
}
