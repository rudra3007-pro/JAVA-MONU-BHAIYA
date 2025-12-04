package Intro;

public class SUBSTRING_DEMO {
    public static void main(String[] args){
        String s = "hello";
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(2));
        prntAll(s);
    }
    public static void prntAll(String s){
        for(int i=0;i<s.length();i++){
            for(int j =i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
