import java.util.*;
class Q18{
    static void f(int[] a,int n){
        if(n==0) return;
        f(a,n-1);
        System.out.print(a[n-1]+" ");
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        f(a,n);
    }
}
