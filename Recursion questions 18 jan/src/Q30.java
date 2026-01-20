import java.util.*;
class Q30{
    static int f(String s,int i){
        if(i==s.length()) return 0;
        return 1+f(s,i+1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        System.out.println(f(x,0));
    }
}
