package Asli_Recursion;

public class Count {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s="abc";
        print1(s,"");
        System.out.println("\n" + count);
        System.out.println("\n"+print(s,""));
    }

    //1st method
    public static int print(String ques,String ans) {
        if(ques.length()==0) {
            System.out.print(ans + "  ");
            return 1;
        }
        char ch= ques.charAt(0);
        int a1=print(ques.substring(1),ans);
        int a2=print(ques.substring(1),ans+ch);
        return a1+a2;
    }
    //2nd method
    static int count=0;
    public static void print1(String ques,String ans) {
        if(ques.length()==0) {
            System.out.print(ans + "  ");
            count++;
            return;
        }
        char ch= ques.charAt(0);
        print1(ques.substring(1),ans);
        print1(ques.substring(1),ans+ch);
    }
}
