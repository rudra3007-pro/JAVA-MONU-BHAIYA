import java.util.*;

class Q1 {
    static void f(int n){
        if(n==0) return;
        f(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        f(n);
    }
}
