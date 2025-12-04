package Maximum_subarray;

import javax.sound.midi.SysexMessage;

public class Maximum_subarray {
    public static void main(String[] args) {
        int[] arr=  {2,3,4,6,7,1,8,2,3,4};
        int k = 3;
        System.out.print(Maximum_Sum(arr,k));
    }


    public static int Maximum_Sum(int[] arr , int k) {
        int ans = 0, sum = 0;
        //1st window ka answer
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans = sum;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i]; // windows grow
            sum = sum - arr[i-k]; //windows shrink;
            ans = Math.max(ans,sum);
        }
        return ans;

    }
}
