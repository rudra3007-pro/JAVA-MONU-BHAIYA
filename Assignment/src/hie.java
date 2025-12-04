import java.util.*;
public class hie {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int cols=sc.nextInt();
        int [] [] arr=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Wave(arr,rows,cols);
    }
    public static void Wave(int [] []arr,int rows, int cols){
        for(int col=0;col<cols;col++){
            if(col%2==0){
                for(int row =0;row<rows;row++){
                    System.out.print(arr[row][col] + ", ");
                }
            }
            else{
                for(int row=rows-1;row>=0;row++){
                    System.out.print(arr[row][col] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}