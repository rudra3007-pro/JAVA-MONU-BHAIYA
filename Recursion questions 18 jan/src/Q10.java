import java.util.*;
class Q10{
    static int f(int a,int b){
        if(b==0) return 1;
        return a*f(a,b-1);
    }
    public static void main(String[] x){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(f(a,b));
    }
}
