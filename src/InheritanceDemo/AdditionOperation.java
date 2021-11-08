package InheritanceDemo;

public class AdditionOperation {

    int a;
    int b;

    void addition()
    {
        int c = a + b;
        System.out.println("Addition="+c);
    }

    void addition(int x , int y)
    {
        int c = x + y;
        System.out.println("Addition="+c);
    }

    void addition(int x , int y , int z)
    {
        int c = x + y + z;
        System.out.println("Addition="+c);
    }

    void addition(double x , double y)
    {
        double c = x + y ;
        System.out.println("Addition="+c);
    }

    void addition(float x , float y)
    {
        double c = x + y ;
        System.out.println("Addition="+c);
    }

    void addition(String x , String y)
    {
        String c = x + y ;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {

        AdditionOperation ob = new AdditionOperation();
        ob.a =11;
        ob.b =22;
        ob.addition();
        ob.addition(55,66);
        ob.addition(5.5,6.6);
        ob.addition(5.5f,6.6f);
        ob.addition("Selenium","java");
    }



}
