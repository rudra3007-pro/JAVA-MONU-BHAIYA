package intro;

import java.awt.desktop.SystemSleepEvent;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll.size());
        ll.add(30);
        ll.add(20);
        ll.add(40);
        System.out.println(ll);
        ll.add(1, -7);
        System.out.println(ll);
        System.out.println(ll.get(1));
        System.out.println(ll.remove(0));
        System.out.println(ll.set(1,6));
        Collections.sort(ll);
        System.out.println(ll);
        for (int i=0;i<ll.size();i++){
            System.out.println((ll.get(i)+" "));
        }
        System.out.println(ll);

    }
}
