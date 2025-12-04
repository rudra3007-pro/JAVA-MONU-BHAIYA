package intro;

import java.util.Scanner;

public class intro {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [2][2];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print((arr[0][0]));
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<1;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
