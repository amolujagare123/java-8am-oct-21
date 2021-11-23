package CollectionDemos.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Jyoti"); // 0 ----- 7
        s.push("Kishor"); // 1 ----- 6
        s.push("Madhura"); //2 ----- 5
        s.push("Rahul"); //3 ----- 4
        s.push("Sameer"); //4 ----- 3
        s.push("Sri vidya"); //5 ----- 2
        s.push("Amol"); //6 ----- 1

        System.out.println(s);

        System.out.println(s.search("aasa33")); // -1 if the object is not in stack
        System.out.println(s.search("Kishor")); // returns offset  if the object is in stack






    }
}
