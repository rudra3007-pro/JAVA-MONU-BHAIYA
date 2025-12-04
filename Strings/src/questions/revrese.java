package questions;

import java.util.Scanner;

public class revrese {
    public static void main(String[] args){;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse(s);


    }
    public static void reverse(String s){
        s = s.trim();
        String ans = "";
        String[] arrs = s.split(" +");
        for(int i=arrs.length-1;i<=0;i--){
            ans+=arrs[i] + " ";
        }
        System.out.println(ans);

    }
}
