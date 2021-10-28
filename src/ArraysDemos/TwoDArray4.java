package ArraysDemos;

public class TwoDArray4 {

    public static void main(String[] args) {
        String[][] stArr = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}

        };



        System.out.println("row="+stArr.length);
        System.out.println("col="+stArr[0].length);

        for(int i=0;i<stArr.length;i++) // row - 4
        {
            for (int j=0; j<stArr[0].length;j++) // col - 3
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
