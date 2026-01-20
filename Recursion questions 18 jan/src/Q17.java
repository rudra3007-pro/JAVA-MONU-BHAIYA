import java.util.*;
class Q17{
    static int f(int[] a,int i,int k){
        if(i==a.length) return -1;
        int r=f(a,i+1,k);
        if(r!=-1) return r;
        return a[i]==k?i:-1;
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
