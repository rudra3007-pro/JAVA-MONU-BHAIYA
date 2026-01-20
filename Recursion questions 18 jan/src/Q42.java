import java.util.*;
class Q42{
    static int f(String s,int i){
        if(i==s.length()) return 1;
        if(s.charAt(i)<'0'||s.charAt(i)>'9') return 0;
        return f(s,i+1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        System.out.println(f(x,0)==1);
    }
}
