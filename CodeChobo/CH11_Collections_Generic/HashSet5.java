package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet<>();
        HashSet setB = new HashSet<>();
        HashSet setHab = new HashSet<>();
        HashSet setKyo = new HashSet<>();
        HashSet setCha = new HashSet<>();

        setA.add("1"); setA.add("2"); setA.add("3");
        setA.add("4"); setA.add("5");
        System.out.println("A = "+setA);

        
        setB.add("4"); setB.add("5"); setB.add("6");
        setB.add("7"); setB.add("8");
        System.out.println("B = "+setB);

        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp)) 
                setKyo.add(tmp);
        }

        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp)) 
                setCha.add(tmp);
        }

        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            setHab.add(tmp);
        }
        it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            setHab.add(tmp);
        }

        System.out.println("A | B = "+setHab);
        System.out.println("A & B = "+setKyo);
        System.out.println("A - B = "+setCha);
    }
}
