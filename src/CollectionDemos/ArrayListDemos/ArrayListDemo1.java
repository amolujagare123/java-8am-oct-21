package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("amol"); // 0
        al.add("sudhir"); // 1
        al.add("anjali"); // 2
        al.add(12);
        al.add(2.2);
        al.add(true);
        al.add('v');

        System.out.println(al);

       /* System.out.println(al.get(3));
        System.out.println(al.size());*/


        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("Using iterator interface");
        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
