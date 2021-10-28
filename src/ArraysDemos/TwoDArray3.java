package ArraysDemos;

public class TwoDArray3 {

    public static void main(String[] args) {
        int[][] a = {
                {34 , 2, 6},
                {11, 3 , 9},
                {34 , 2, 6},
                {11, 32 , 9}

        };



        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);

        for(int i=0;i<a.length;i++) // row - 4
        {
            for (int j=0; j<a[0].length;j++) // col - 3
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
