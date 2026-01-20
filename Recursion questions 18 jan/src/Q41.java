import java.util.*;
class Q41{
    static int f(int n){
        if(n==0) return 0;
        return n%10+f(n/100);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(f(n));
    }
}
