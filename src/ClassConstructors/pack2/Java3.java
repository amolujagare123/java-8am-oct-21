package ClassConstructors.pack2;

import ClassConstructors.pack1.Java1;

public class Java3 {

    int a3;
    double d3;
    char c3;
    String str3;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 = 11;
        ob.d1 = 3.2;
        ob.c1 = 'q';
        ob.str1="amol";
        ob.display1();
    }

}

