package CollectionDemos.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("sameer");
        v.add("Amol");
        v.add("Sudhir");
        v.add("Satyajeet");
        v.add("Kishor");
        v.add("Akanksha");

        System.out.println(v);


        /*Object[] arr = v.toArray();

        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i]);*/

        System.out.println("Using iterator interface");
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Using Enumeration interface");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());




    }
}
