package javaBasics;

public class IncDemo {

    public static void main(String[] args) {
/* i++/i-- : first statement is executed then increment or decrement happens
   ++i /--i : first increment or decrement happens and then statements are executed
*/
         int i = 10;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

        // 10 ,10 ,11 , 12, 12

    }
}
