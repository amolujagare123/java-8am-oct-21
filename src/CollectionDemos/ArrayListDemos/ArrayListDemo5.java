package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol"); // 0
        al.add("sudhir"); // 1
        al.add("anjali"); // 2
        al.add("satyajeet"); // 3
        al.add("Madhura"); // 4
        al.add("Rahul"); // 5

        System.out.println("al="+al);

        al.remove(2);
       // al.remove("anjali");
        System.out.println("al="+al);


    }
}
