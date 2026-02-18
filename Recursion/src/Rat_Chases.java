import java.util.Scanner;

public class Rat_Chases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<m;j++){
                maze[i][j] = sc.next(;
            }
        }

    }
}
