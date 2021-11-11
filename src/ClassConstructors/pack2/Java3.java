package ClassConstructors.pack2;

import ClassConstructors.pack1.Java1;

public class Java3 extends  Java1{

    public int a3;
    public double d3;
    public char c3;
    public String str3;

    public void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a1 = 11;
       // ob.c1 = 'q';

        Java3 ob3 = new Java3();
        ob3.c1='j'; // c1 -> protected member


       /* ob.d1 = 3.2;
        ob.c1 = 'q';
        ob.str1="amol";
        ob.display1();*/
    }

}

