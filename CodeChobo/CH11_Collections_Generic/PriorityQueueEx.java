package CodeChobo.CH11_Collections_Generic;

import java.util.*;

public class PriorityQueueEx {
    public static void main(String[] args)
    {
        Queue pq = new PriorityQueue() ; 
        pq.offer(3); // pq.offer( new Integer(3) ) ; // 오토박싱
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null ; 

        // Priority Queue에 저장된 요소를 하나씩 꺼낸다.
        while((obj = pq.poll()) != null)
            System.out.println(obj);
    }
}
