package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(89);
        al.add(7);
        al.add(66);
        al.add(6);
        al.add(66);
        al.add(9);
        al.add(67);

        System.out.println(al);

      //  al.removeIf(a -> (a<10) );

        al.removeIf(a ->  a%2 == 0  );

        System.out.println(al);

    }
}
