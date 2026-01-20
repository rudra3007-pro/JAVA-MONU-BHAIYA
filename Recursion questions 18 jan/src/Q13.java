import java.util.*;
class Q13{
    static int f(int[] a,int n){
        if(n==0) return 0;
        return a[n-1]+f(a,n-1);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        System.out.println(f(a,n));
    }
}
