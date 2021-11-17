package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 12;
            a[2] = 21;
            a[3] = 13;
            a[4] = 41;
            a[5] = 41;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("inside catch");


        }
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");
    }
}
