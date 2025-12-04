package Linear_search;

import javax.sound.midi.SysexMessage;

public class Reverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        Reverse(arr,2,6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public  static int[] Reverse(int[] arr,int a,int b){
//        int i=a;
//        int j = b;
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
        for(int i=a;i<b;i++){
            int temp = arr[i];
            arr[i] = arr[b];
            arr[b] = temp;
            b--;

        }
        return  arr;
    }
}