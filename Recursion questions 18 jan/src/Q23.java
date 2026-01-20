import java.util.*;
class Q23{
    static int g(int a,int b){
        if(b==0) return a;
        return g(b,a%b);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println((a*b)/g(a,b));
    }
}
