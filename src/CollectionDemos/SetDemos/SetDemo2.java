package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

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
