package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol"); // 0
        al.add("sudhir"); // 1
        al.add("anjali"); // 2
        al.add("satyajeet"); // 3
        al.add("Madhura"); // 4
        al.add("Rahul"); // 5
        al.add("Rani"); // 5
        al.add("Raju"); // 5

        System.out.println("al="+al);

        // predicate symbol   ->

        //al.removeIf( str -> ( str.length() <5 )   );

        al.removeIf( str -> (  str.endsWith("i"))   );

        System.out.println("al="+al);


    }
}
