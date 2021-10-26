package javaBasics;

public class ForDemo3 {

    public static void main(String[] args) {
       // 1 to 10 numbers and also print even or odd
        // in front of the number

        for (int i=1;i<=10 ;i++)
        {
           if(i % 2 == 0)
            System.out.println(i+" even");
           else
               System.out.println(i+" odd");
        }
    }
}
