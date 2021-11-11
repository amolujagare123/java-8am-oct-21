package Methods;

import ClassConstructors.pack2.Java3;

public class MethodArguments {

    void getMyInt(int a) {
        System.out.println("a=" + a);
    }

    void getMyInt2(int a, int b, char c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    void getMyBoolean(boolean b) {
        if (b)
            System.out.println("this is true");
        else
            System.out.println("this is false");
    }

    void getMyString(String s)
    {
        System.out.println(s);
    }


    void getMyArray(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }

    }

    void getMyTwoDArray(String[][] stArr)
    {
        for(int i=0;i<stArr.length;i++)
        {
            for(int j=0;j<stArr[0].length;j++) {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void getMyObject(Java3 ob)
    {
        ob.a3 = 12;
        ob.d3 = 9.8;
        ob.c3 = 'g';
        ob.str3="amol";
    }


    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();
        ob.getMyInt(78);
        ob.getMyInt2(12, 13, 'g');
        ob.getMyBoolean(false);
        ob.getMyString("amol");

        int[] b = {32, 23, 21, 11, 56, 33, 78};

        ob.getMyArray(b);

        String[][] ss = {
                {"abc1", "xyz1", "pqr1"},
                {"abc2", "xyz2", "pqr2"},
                {"abc3", "xyz3", "pqr3"},
                {"abc4", "xyz4", "pqr4"}
        };

        ob.getMyTwoDArray(ss);

        Java3 j3 = new Java3();

         ob.getMyObject(j3);

        j3.display3();

    }


}
