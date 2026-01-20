import java.util.*;
class Q25{
    static int f(int n,int r){
        if(n==0) return r;
        if(n%10!=0) r=r*10+n%10;
        return f(n/10,r);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(f(n,0));
    }
}
