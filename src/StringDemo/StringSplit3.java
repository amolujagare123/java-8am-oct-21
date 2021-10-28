package StringDemo;

public class StringSplit3 {

    public static void main(String[] args) {

        String str  = "Hey baby you are so lovely";

        String[] stAr = str.split(" ");

        for(int i=0;i<stAr.length;i++)
        {

            if(stAr[i].endsWith("y")) // check wherether the word(stAr[i]) ends with y
            System.out.println(stAr[i]);
        }


    }
}
