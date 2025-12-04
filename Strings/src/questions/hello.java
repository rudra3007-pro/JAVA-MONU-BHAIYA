package questions;

import java.awt.*;
import java.util.Arrays;

public class hello {
    public static void main(String[] args){
        String s = "      the sky is blue   ";
        System.out.println(s);
        s=s.trim();
//        System.out.print(s);
        String[] arr = s.split(" +");
        System.out.println(Arrays.toString(arr));
    }
}
