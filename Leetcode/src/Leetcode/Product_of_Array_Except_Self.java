package Leetcode;

public class Product_of_Array_Except_Self {
    public static void main(String[] args){
        int[] arr = {4 ,5 ,3 ,2};
        int[] c = POA(arr);
        for(int i= 0 ; i<c.length;i++){
            System.out.print(c[i] + " ");
        }

    }
    public static int[] POA(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i] =left[i-1] * arr[i-1];

        }
        int[] right = new int[n];
        right[n-1] = 1;
        for(int j=n-2;j>=0;j--){
            right[j] = right[j+1] * arr[j+1];
        }
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = left[i] * right[i];
        }
        return arr;
    }


}
