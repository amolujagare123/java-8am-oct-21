package StringDemo;

public class StringSplit {

    public static void main(String[] args) {

        String str  = "Hi this is java";

        String[] stAr = str.split(" ");

       /* for(int i=0;i<stAr.length;i++)
        {
            System.out.println(stAr[i]);
        }*/

        for(int i=stAr.length-1;i>=0;i--)
        {
            System.out.println(stAr[i]);
        }

    }
}
