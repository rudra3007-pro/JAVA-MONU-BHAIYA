import java.util.*;
class Q22{
    static int f(int a,int b){
        if(b==0) return a;
        return f(b,a%b);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(f(a,b));
    }
}
