package Assignment;

public class Replace_Char {
    public static void main(String[] args) {
        String s = "cat";
        Replace(s,"");

    }
    public static void Replace(String ques , String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch = ques.charAt(0);
        if(ch=='a'){
            Replace(ques.substring(1), ans+'o');
        }
        else{
            Replace(ques.substring(1) , ans + ch);
        }
    }
}
