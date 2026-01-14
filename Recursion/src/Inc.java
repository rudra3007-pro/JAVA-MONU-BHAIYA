public class Inc {
    public static void main(String[] args) {
        int n = 5;
        Incr(n);
    }
    public static void Incr(int n){
        if(n==0){
            return;
        }
        Incr(n-1);
        System.out.println(n);
    }
}
