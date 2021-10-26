package javaBasics;

public class Marks {

    public static void main(String[] args) {
        int marks = 51;

        if(marks>=40 && marks<50) // pass condition
            System.out.println("pass");

        else if(marks>=50 && marks<60 )
            System.out.println("Second class");

        else if (marks>=60 && marks<75)
            System.out.println("First class");

        else if (marks>=75)
            System.out.println("Distinction");

        else if (marks<40)
            System.out.println("fail");
    }
}
