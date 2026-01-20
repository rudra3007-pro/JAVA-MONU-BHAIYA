import java.util.*;
class Q29{
    static int f(String s,int l,int r){
        if(l>=r) return 1;
        if(s.charAt(l)!=s.charAt(r)) return 0;
        return f(s,l+1,r-1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        System.out.println(f(x,0,x.length()-1)==1);
    }
}
