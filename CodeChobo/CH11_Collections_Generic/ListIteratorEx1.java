package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj);
        }
        System.out.println();

        while(it.hasPrevious()) {
            Object obj = it.previous();
            System.out.print(obj);
        }
        System.out.println();
    }
}