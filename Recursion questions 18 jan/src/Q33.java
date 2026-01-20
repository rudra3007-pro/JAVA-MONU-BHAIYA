import java.util.*;
class Q33{
    static int f(String s,int i){
        if(i==s.length()) return 1;
        if(s.charAt(i)==' ') return 1+f(s,i+1);
        return f(s,i+1);
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        String x=s.nextLine();
        System.out.println(f(x,0));
    }
}
