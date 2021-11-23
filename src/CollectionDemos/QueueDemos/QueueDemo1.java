package CollectionDemos.QueueDemos;

import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(13);
        pq.offer(23);
        pq.offer(16);
        pq.offer(73);
        pq.offer(10);

        // 10 13 16 23 73
        System.out.println(pq);

        // some operating systems doesnot suppport priority queue
        // so sometimes we may not see the proper sorted output
        // but internally it is sorted
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
