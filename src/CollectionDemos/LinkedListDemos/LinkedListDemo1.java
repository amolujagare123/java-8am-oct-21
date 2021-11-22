package CollectionDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(23);
        ll.add(13);
        ll.add(26);
        ll.add(73);
        ll.add(20);
        ll.add(33);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addLast(99);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
