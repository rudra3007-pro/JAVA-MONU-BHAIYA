import java.util.*;
class Q39{
    static int c(char x){
        return "aeiouAEIOU".indexOf(x)==-1?1:0;
    }
    static int f(String s,int i){
        if(i==s.length()) return 0;
        return c(s.charAt(i))+f(s,i+1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.next();
        System.out.println(f(x,0));
    }
}
