package CollectionDemos.QueueDemos;

import java.util.ArrayDeque;

public class QueueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(13);
        adq.offer(23);
        adq.offer(16);
        adq.offer(73);
        adq.offer(10);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
