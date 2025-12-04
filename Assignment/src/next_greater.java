public class next_greater {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 6, 5, 4, 2, 1};

        per(arr);

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void per(int[] arr) {
        // Step 1 - find p
        int p = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

        if (p == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // Step 2 - find q
        int q = -1;
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }

        // Step 3 - swap p and q index values
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        // Step 4 - reverse from p + 1 to end
        reverse(arr, p + 1, arr.length - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
