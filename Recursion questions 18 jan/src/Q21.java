import java.util.*;
class Q21{
    static int f(int n,int i){
        if(i==1) return 1;
        if(n%i==0) return 0;
        return f(n,i-1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(f(n,n-1)==1);
    }
}
