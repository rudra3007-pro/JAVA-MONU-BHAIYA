import java.util.*;
class Q34{
    static void f(int[] a,int i,int k){
        if(i==a.length) return;
        if(a[i]==k) System.out.print(i+" ");
        f(a,i+1,k);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        int k=s.nextInt();
        f(a,0,k);
    }
}
