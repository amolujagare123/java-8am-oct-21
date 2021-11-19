package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol"); // 0
        al.add("sudhir"); // 1
        al.add("anjali"); // 2
       /* al.add(12);
        al.add(2.2);
        al.add(true);
        al.add('v');*/

        System.out.println("al="+al);

        ArrayList<Integer> al1 = new ArrayList<>();

        System.out.println(al1.isEmpty()); // true

        al1.add(89);
        al1.add(77);
        al1.add(66);
        al1.add(67);

        System.out.println(al1.isEmpty()); // false

        System.out.println("al1="+al1);


        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.println(al2.isEmpty()); // true

        System.out.println("al2="+al2);

         al2.addAll(al1);

        System.out.println("al2="+al2);

    }
}
