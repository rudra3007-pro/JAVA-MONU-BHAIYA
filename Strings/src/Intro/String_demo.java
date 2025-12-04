package Intro;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class String_demo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
//        System.out.println(s1==s2);
//        System.out.println(s3==s2);
//        System.out.println(s3==s4);
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.concat(" hii"));
//        String s5 = "hello"+"bye";
//        System.out.println(s5);
//        System.out.println("hello"+(10+20)+"bye");
        System.out.println(s1.length());
        int[] arr = new int[5];
//        System.out.println(arr.length);
//        System.out.println(s1.charAt(2));
    }
    public static boolean equal(String s1 , String s2){
        if(s1==s2){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
