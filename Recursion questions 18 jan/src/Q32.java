import java.util.*;
class Q32{
    static void f(String s,int i,char p){
        if(i==s.length()) return;
        if(s.charAt(i)!=p) System.out.print(s.charAt(i));
        f(s,i+1,s.charAt(i));
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        f(x,0,' ');
    }
}
