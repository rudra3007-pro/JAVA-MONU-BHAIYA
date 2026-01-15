package Questions;

public class Sum_of_N {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(Sum(n));
    }
    public  static int Sum(int n){
        if(n==0){
            return 0;
        }
        int s = Sum(n-1);
        return n+s;
    }
}
