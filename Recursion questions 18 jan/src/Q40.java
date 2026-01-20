import java.util.*;
class Q40{
    static void f(String s,int i){
        if(i==s.length()) return;
        if(s.charAt(i)!='x') System.out.print(s.charAt(i));
        f(s,i+1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        f(x,0);
    }
}
