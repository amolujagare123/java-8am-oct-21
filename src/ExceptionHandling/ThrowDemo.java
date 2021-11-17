package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i>=1 && i<=10 )
            System.out.println("we are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {
        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(11);

        System.out.println("end of the program");


    }
}
