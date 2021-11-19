package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol"); // 0
        al.add("sudhir"); // 1
        al.add("anjali"); // 2
        al.add("satyajeet"); // 3
        al.add("Madhura"); // 4
        al.add("Rahul"); // 5

        System.out.println("al="+al);

        ArrayList<String> al1 = new ArrayList<>();

        al1.add("amol"); // 0
        al1.add("sudhir"); // 1
        al1.add("anjali"); // 2
        al1.add("abc"); // 0
        al1.add("pqr"); // 1
        al1.add("xyz"); // 2

        System.out.println("al1="+al1);


        al1.removeAll(al);

        System.out.println("al1="+al1);



    }
}
