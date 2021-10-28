package ArraysDemos;

public class TwoDArray2 {

    public static void main(String[] args) {
        float[][] f = {
                {34.5f , 2.4f, 6.6f},
                {11.2f, 32.1f , 9.9f},
                {34.5f , 2.4f, 6.6f},
                {11.2f, 32.1f , 9.9f}

        };



        System.out.println("row="+f.length);
        System.out.println("col="+f[0].length);

        for(int i=0;i<f.length;i++) // row - 4
        {
            for (int j=0; j<f[0].length;j++) // col - 3
            {
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }

    }
}
