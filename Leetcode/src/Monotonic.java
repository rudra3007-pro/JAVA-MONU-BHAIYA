public class Monotonic {
    public static void main(String[] args){
        int[] arr = {1,5,4,4};
        int[] ary = {4,3,2,1};
        boolean h=true;
        int j=0;
        for(int i=1;i< arr.length;i++){
            if(arr[j]<=arr[i]){
                h = true;
            }
            else{
                h=false;
            }
            j++;
        }
        if(h==true){
            System.out.print("Monotonic");
        }
        else{
            System.out.print("Not");

        }

    }
}
