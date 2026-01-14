public class First_occurences {
    public static void main(String[] args) {
        int[] arr = {3,4,2,4,2};
        int item = 4;
        System.out.print(First(arr,item,0));
    }
    public static int First(int[] arr , int item,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return First(arr,item,i+1);
    }
}
