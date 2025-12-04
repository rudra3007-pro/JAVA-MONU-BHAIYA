import java.util.*;
public class bookdistribution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int nob = sc.nextInt();   //number of books
            int nos = sc.nextInt();   //number of Student
            int [] page = new int[nob];
            for(int i=0;i<page.length;i++){
                page[i] = sc.nextInt();
            }
            System.out.print(Minimumpage(page,nos));
        }

    }
    public static int Minimumpage(int[] page, int nos){
        int lo=0;
        int hi =0;
        for(int i=0;i<page.length;i++){
            hi = hi+page[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(itispossible(page,nos,mid)){
                ans=mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean itispossible(int[] page,int nos , int mid){
        int student = 1;
        int read  = page[0];
        for(int i=1;i<page.length;){
            if(read+page[i]<=mid){
                read+=page[i];
                i++;
            }
            else{
                student++;
                read = 0;
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}	