import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Combination_sum {
    public static void main(String[] args) {
        int []coin= {2,3,5};
        int amount=8;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        combination(coin,amount,ll,0,l);
        System.out.println(l);

    }
    public static void combination(int [] coin,int amount,List<Integer>ll, int idx , List<List<Integer>> l) {
        if(amount==0) {
            l.add(new ArrayList<>(ll));
            return;

        }
        for(int i=0;i<coin.length;i++) {
            if(amount>=coin[i]) {
                ll.add(coin[i]);
                combination(coin,amount-coin[i],ll,i,l);
                ll.remove(ll.size()-1);
            }
        }
    }

}
