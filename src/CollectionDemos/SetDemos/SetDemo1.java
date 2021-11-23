package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(89);
        hs.add(19);
        hs.add(81);
        hs.add(29);
        hs.add(83);
        hs.add(39);

        System.out.println(  hs.add(39));
        System.out.println(hs);

    }
}
