public class FactoriallDemo {

    public static void main(String[] args) {

        int n = 0;
        int mult = 1;

        for(int i=n ; i>=1 ; i--)
        {
            mult = mult * i;
        }

        System.out.println("factorial = "+mult);
    }
}
