package ClassConstructors.pack1;

public class Java1 {

    public  int a1;
    private double d1;
    protected char c1;
    String str1;

    void display1()
    {
        System.out.println("a="+a1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 = 11;
        ob.d1 = 3.2;
        ob.c1 = 'q';//
        ob.str1="amol";
        ob.display1();

    }

}

