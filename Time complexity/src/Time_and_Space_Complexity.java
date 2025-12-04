public class Time_and_Space_Complexity {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for(int i = 0;i<Integer.MAX_VALUE; i++){
//            System.out.print(i + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

