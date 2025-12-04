public class insertion_sort {
    public static void main(String[] args){
        int[] arr = { 1, 3 , 4 , 5 , 6 , 9 , 2};
    }
    public static void Sort(int[] arr) {
        //array ke continuous part ko subarray kehte hai.

    }
    public  static int ile(int[] arr , int i){
        int item = arr[i];
        int j = i -1;
        while (j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
        return j+1;

    }
}
