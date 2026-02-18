package Leetcode;

public class Lexiographical_386 {
    public static void main(String[] args) {
        int n =1000;
        Lexiographical(0,n);
    }
    public static void Lexiographical(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i = 0 ;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            Lexiographical(curr*10 + i ,n);
        }


    }
}