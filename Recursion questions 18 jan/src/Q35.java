import java.util.*;
class Q35{
    static int f(int[] a,int n){
        if(n==1) return 1;
        if(a[n-1]<=a[n-2]) return 0;
        return f(a,n-1);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        System.out.println(f(a,n)==1);
    }
}
