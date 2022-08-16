package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"Dog", "cat", "lion", "tiger"}; // 대소문자 구분하기 위해 일부러 섞어서 작성
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr); // String의 Comparable 구현
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println(Arrays.toString(strArr));

        //Arrays.sort(strArr, Collections.reverseOrder()); // 역순 정렬
        Arrays.sort(strArr, new Descending()); 
        System.out.println(Arrays.toString(strArr));
    } 
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c1.compareTo(c2) * -1; // c2.compareTo(c1);
            //return c2.compareTo(c1);
        }
        return -1;
    }
}
