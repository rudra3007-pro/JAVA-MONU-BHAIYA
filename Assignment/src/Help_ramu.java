import java.util.Scanner;

public class Help_ramu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int no_of_rickshaws = sc.nextInt();
            int no_of_cabs = sc.nextInt();
            int[] cab = new int[no_of_cabs];
            int[] rickshaw = new int[no_of_rickshaws];
            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt();
            }
        }
    }
    public static int minimum_sum(int[] rickshaw , int[] cab , int c1,int c2,int c3,int c4){
        int cost_rickshaw = 0;
        for(int i=0;i<rickshaw.length;i++){
            cost_rickshaw+=Math.min(rickshaw[i]*c1,c2);
        }
        cost_rickshaw=Math.min(cost_rickshaw,c3);
        int cost_cabs = 0;
        for(int i=0;i<cab.length;i++){
            cost_cabs+=Math.min(cab[i]*c1,c2);
        }
        cost_cabs=Math.min(cost_cabs,c3);
        int total = cost_cabs+cost_rickshaw;
        return Math.min(total,c4);
    }
}
