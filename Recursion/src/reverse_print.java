public class reverse_print {
    public static void main(String[] args) {
        int n = 5;
        Rev(n);
    }
    public static void Rev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Rev(n-1);
    }
}
