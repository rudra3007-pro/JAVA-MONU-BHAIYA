import java.util.*;
class Q24{
    static int f(int n){
        if(n==0) return 0;
        int d=n%10;
        return (d%2==0?d:0)+f(n/10);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(f(n));
    }
}
