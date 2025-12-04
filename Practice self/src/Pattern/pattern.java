package Pattern;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class pattern {
    public static void main(String[] args){
        int n=5;
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<2*n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print(" *");
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            //mirror
            if(row<n){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
            row++;

        }
    }
}
