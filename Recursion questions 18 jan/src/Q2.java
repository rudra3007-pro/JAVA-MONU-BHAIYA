public class Q2 {

    public static void main(String[] args) {
        int n = 234;
        System.out.println(sum(n));

    }

    public static int sum(int n){
        if(n==1){
            return n;
        }

        int digit  = sum(n/10);
        return digit*n%10;
    }
}
