package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        Map.Entry e;
        while(it.hasNext()) {
            e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + " , 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : "+set);
        
        int total = 0;
        Collection values = map.values();
        it = values.iterator();
        Integer i;
        while(it.hasNext()) {
            i = (Integer)it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));

    }
}
