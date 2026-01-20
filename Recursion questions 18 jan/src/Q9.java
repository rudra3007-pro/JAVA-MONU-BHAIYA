import java.util.*;
class Q9{
    static int f(int n,int r){
        if(n==0) return r;
        return f(n/10,r*10+n%10);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n==f(n,0));
    }
}
