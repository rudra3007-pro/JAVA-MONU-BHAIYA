package Leetcode;

public class Palindrome_Partitioning_131 {
    public static void main(String[] args) {
        String ques = "nitin";
        Partition(ques,"");
    }
    public static void Partition(String ques , String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int cut =1 ; cut<=ques.length(); cut++){
                String s = ques.substring(0,cut);
                Partition(ques.substring(cut),ans+s+"|");
        }
    }
}

