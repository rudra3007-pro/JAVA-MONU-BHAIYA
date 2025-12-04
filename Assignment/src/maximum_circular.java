public class maximum_circular {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,2,8,9};
        int b = Max(arr);
        System.out.print(b);
    }

    public static int Max(int[] arr) {
        int Lin = Kadanes(arr);
        int tsum = 0;
        for (int i = 0; i < arr.length; i++) {
            tsum += arr[i];
            arr[i] = arr[i] * -1;
        }
        int csum = tsum + Kadanes(arr);
        if (csum == 0) {
            return Lin;
        }
        return Math.max(Lin, csum);
    }

    public static int Kadanes(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
