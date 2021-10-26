package ArraysDemos;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] = 12;
        a[0][1]= 24;
        a[0][2] = 15;

        a[1][0] = 12;
        a[1][1]= 24;
        a[1][2] = 15;

        a[2][0] = 12;
        a[2][1]= 24;
        a[2][2] = 15;

        a[3][0] = 12;
        a[3][1]= 24;
        a[3][2] = 15;

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
