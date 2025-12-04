package questions;

import java.util.Scanner;

public class CB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printAll(s);
    }
    public  static void printAll(String s){
        int c=0;
        boolean [] visited=new boolean [s.length()];
        for(int len = 1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i = j-len;
                long num = Long.parseLong(s.substring(i,j));
                if(isCBnumber(num)&&isvisited(visited,i,j-1)) {
                    c++;
                    for(int k=i;k<=j-1;k++){
                        visited[k] = true;
                    }
                }
            }
        }
    }
    public static boolean isvisited(boolean[] visited,int si , int ei){
        for(int k=si;k<=ei;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }
    public static boolean isCBnumber(long num){
        if(num==0||num==1){
            return false;
        }
        int[] arr = {2,3,5,7, 11, 13, 17, 19, 23, 29};
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return  false;
            }
        }
        return true;
    }
}
