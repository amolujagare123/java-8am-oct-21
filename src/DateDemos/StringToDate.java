package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12/10/2016";
        System.out.println(dateStr);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        // String to date
        Date date = sd.parse(dateStr);
        System.out.println(date);

        String dateStr0= "23-June-2016" ;
       //→ dd-MMMM-yyyy
        System.out.println(dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);


        String dateStr1= "23 | June 16  8:34" ;
       //→ dd | MMMM yy hh:mm
        System.out.println(dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);




    }
}
