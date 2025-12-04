package video;

import java.util.ArrayList;
import java.util.Collections;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        System.out.println(list);
        list.add (10);
        list.add (20);
        list.add(9);
        list.add(34);
        list.add(235);
        list.add(33);
        list.add(2323);
        list.add(0,-9);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println(list);
        list.set(0,-11);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        for(int i : list){
            System.out.print(i + " ");
        }



    }
}
