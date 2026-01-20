import java.util.*;
class Q11{
    static int f(int[] a,int n){
        if(n==1) return a[0];
        int m=f(a,n-1);
        return a[n-1]>m?a[n-1]:m;
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        System.out.println(f(a,n));
    }
}
