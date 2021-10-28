package StringDemo;

public class StringSplit2 {

    public static void main(String[] args) {

        String str  = "Hey baby you are so lovely";

        String[] stAr = str.split(" ");

        for(int i=0;i<stAr.length;i++)
        {
            String temp = stAr[i];
            int l = temp.length();

            if(stAr[i].charAt(l-1) =='y') // check wherether the word(stAr[i]) ends with y
            System.out.println(stAr[i]);
        }


    }
}
