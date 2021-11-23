package CollectionDemos.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(); // default capacity --> 10

        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 0

        v.add("sameer");
        v.add("Amol");
        v.add("Sudhir");
        v.add("Satyajeet");
        v.add("Kishor");
        v.add("Akanksha");
        v.add("Sudhir");
        v.add("Satyajeet");
        v.add("Kishor");
        v.add("Akanksha");
        v.add("Akanksha");

        System.out.println("size="+v.size()); // 10
        System.out.println("Capacity="+v.capacity()); // 10

        System.out.println(v);





    }
}
