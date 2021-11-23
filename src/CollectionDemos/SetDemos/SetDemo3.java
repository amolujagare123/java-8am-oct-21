package CollectionDemos.SetDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet<Integer> lhs = new TreeSet<>();

        lhs.add(89);
        lhs.add(19);
        lhs.add(81);
        lhs.add(29);
        lhs.add(83);
        lhs.add(39);

        System.out.println(  lhs.add(39));
        System.out.println(lhs);

    }
}
