package ArraysDemos;

public class ArrayDemo4 {

    public static void main(String[] args) {

        int[] a = {12,45,67,12,68,90,12,54};

        for (int i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        char[] chAr = {'a','b','c','d','e','f','g'};

        for(int i=0;i<chAr.length;i++)
        {
            System.out.print(chAr[i]+" ");
        }

        System.out.println();

        String[] stAr = {"abc","pqr","xyz","lmn"};

        for (int i=0;i<stAr.length;i++)
        {
            System.out.print(stAr[i]+" ");
        }
    }
}
