import java.util.*;
class Q27{
    static int s(int n){
        if(n==0) return 0;
        return n%10+s(n/10);
    }
    static int f(int n){
        if(n<10) return n;
        return f(s(n));
    }
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
    }
}
