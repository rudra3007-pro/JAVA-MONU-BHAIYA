import java.util.*;
class Q16{
    static int f(int[] a,int i,int k){
        if(i==a.length) return -1;
        if(a[i]==k) return i;
        return f(a,i+1,k);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        int k=s.nextInt();
        System.out.println(f(a,0,k));
    }
}
