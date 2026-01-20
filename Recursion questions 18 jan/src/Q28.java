import java.util.*;
class Q28{
    static void f(int n){
        if(n==0) return;
        f(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0) System.out.print(0);
        else f(n);
    }
}
