package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    }

    public int[] find(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[] ans = new int[row*col];
        int idx = 0;
        for(int d=0;d<row+col-1;d++){
            int r,c;
            if(d<col){
                r=0;
                c=d;
            }
            else{
                r = d- col + 1;
                c = col-1;
            }
            ArrayList<Integer> ll = new ArrayList<>();
            while(r>=0&& c>=0){
                ll.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                for(int ele:ll){
                    ans[idx] = ele;
                    idx++;
                }

            }
            else{
                Collections.reverse(ll);
                for(int ele :ll){
                    ans[idx] = ele;
                    idx++;
                }
            }
        }
        return ans;
    }

}
