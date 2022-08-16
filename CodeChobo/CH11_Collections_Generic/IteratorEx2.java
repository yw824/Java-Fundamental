package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList<>();
        ArrayList copy1 = new ArrayList<>();
        ArrayList copy2 = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            original.add(i+"");
        
        Iterator it = original.iterator();
        while(it.hasNext()) {
            copy1.add(it.next());
        }

        System.out.println("= Original에서 copy1으로 복사( copy ) =");
        System.out.println("Original : " + original);
        System.out.println("Copy1 : " + copy1);

        it = original.iterator();
        while(it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("= Original에서 copy2으로 이동( move ) =");
        System.out.println("Original : " + original);
        System.out.println("Copy2 : " + copy2);
    }
}
