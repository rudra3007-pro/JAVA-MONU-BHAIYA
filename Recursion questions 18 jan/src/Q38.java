import java.util.*;
class Q38{
    static int f(int n,int m){
        if(n==0) return m;
        return f(n/10,Math.max(m,n%10));
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(f(n,0));
    }
}
