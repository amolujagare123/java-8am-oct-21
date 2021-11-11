package Methods;

import ClassConstructors.pack2.Java3;

public class MethodsReurning {

    int getMyInt()
    {
        return 10;
    }

    int getMyInt2()
    {
        int x = 90;
        return x;
    }

    Java3 getMyObject()
    {
        Java3 j = new Java3();
        j.a3 = 12;
        j.d3 = 9.8;
        j.c3 = 'g';
        j.str3="amol";

        return j;
    }


    int[] getMyarray()
    {
        int[] x = {11,23,113,133,31,11};

        return x;
    }

    String[][] getMyTwodArray()
    {
        String[][] ss = {
                {"abc1", "xyz1", "pqr1"},
                {"abc2", "xyz2", "pqr2"},
                {"abc3", "xyz3", "pqr3"},
                {"abc4", "xyz4", "pqr4"}
        };

        return ss;
    }


    public static void main(String[] args) {

     //   int y = 10;

       // System.out.println(y);

     //   int z = y;

        MethodsReurning ob = new MethodsReurning();

          int xx =  ob.getMyInt();

        System.out.println("xx="+xx);

        System.out.println(ob.getMyInt()); // 10
        System.out.println(ob.getMyInt2()); // 20

        int[] yy = ob.getMyarray();

            for (int i=0;i<yy.length;i++)
                System.out.println(yy[i]);


            String[][] s1 = ob.getMyTwodArray();

            for(int i=0;i<s1.length;i++)
            {
                for (int j=0;j<s1[0].length;j++)
                {
                    System.out.print(s1[i][j]+" ");
                }
                System.out.println();
            }

        Java3 j1 =  ob.getMyObject();

            j1.display3();

    }


}
