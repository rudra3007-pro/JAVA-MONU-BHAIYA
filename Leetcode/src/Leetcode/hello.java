package Leetcode;

public class hello {
    public static class binary_search {
        public static void main(String[] args){
            int[] arr = {2,3,4,5,6,7,8,9,13,16,18,19,20,21};
            int item = 13;
            System.out.println(Search(arr,item));
        }
        public static int Search(int[] arr, int item){
            int lo=0;
            int hi = arr.length-1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(arr[mid]==item){
                    return mid;
                }
                else if(arr[mid]>item){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            return -1;
        }
    }

    public static class Find_First_and_Last_Position_of_Element {
        public static void main(String[] args){
            int[] nums = {5,7,7,8,8,10};
            int target = 8;
            for(int i = 0;i<nums.length;i++){
                if(nums[i]==target){
                    System.out.print(i + " ");
                }
                int[] arr = new int[2];
            }
        }
    }
}
