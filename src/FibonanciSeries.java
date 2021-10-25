public class FibonanciSeries {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sum = 0;
        int n = 6;

        System.out.print(a+" "+b);

        for(int i=1;i<=n-2;i++)
        {
            sum = a + b;
            System.out.print(" "+sum);

            a = b;
            b = sum;
        }
    }
}
