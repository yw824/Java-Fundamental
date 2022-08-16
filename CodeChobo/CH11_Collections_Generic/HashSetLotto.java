package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        int num;
        for(int i = 0; i < 6; i++) {
            num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list);
        System.out.println(list);
    }
}
