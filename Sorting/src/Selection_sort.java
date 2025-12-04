public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4, -1, 5, 3, 1, 2};
        int n = 2;
        Sort(arr, n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    public static void Sort(int[] arr, int n){
        for(int i = 0; i<arr.length;i++){
            int k = SS(arr,i);
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;

        }
    }

    public static int SS(int[] arr, int n) {
        int min = n;
        for (int i = n + 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;

    }
}
