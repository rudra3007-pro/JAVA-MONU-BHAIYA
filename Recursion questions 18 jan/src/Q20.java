import java.util.*;
class Q20{
    static int v(char c){
        return "aeiouAEIOU".indexOf(c)>=0?1:0;
    }
    static int f(String s,int i){
        if(i==s.length()) return 0;
        return v(s.charAt(i))+f(s,i+1);
    }
    public static void main(String[] x){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(f(s,0));
    }
}
