package Asli_Recursion;

public class print {

    public static void main(String[] args) {
        String s = "abc";
        print1(s, "");
    }

    public static void print1(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        print1(ques.substring(1), ans);
        print1(ques.substring(1), ans + ch);
    }
}
