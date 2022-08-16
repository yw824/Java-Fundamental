package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i = 0; i < score.length; i++) 
            set.add(new Integer(score[i]));
        
        System.out.println("under 50 : "+set.headSet(new Integer(50)));
        System.out.println("over 50 : "+set.tailSet(new Integer(50)));
    }
}
