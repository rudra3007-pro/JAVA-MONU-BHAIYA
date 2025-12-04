package Leetcode;

public class Majority_element {
   public static void main(String[] args){

   }
   public static int Moore_Voting(int[] arr){
       int e = arr[0];
       int vote =1;
       for(int i = 1 ; i<arr.length;i++){
           if(arr[i]==e){
               vote++;
           }else{
               vote--;
               if(vote==0){
                   e = arr[i];
                   vote = 1;
               }
           }
       }
       return e;
   }
}
