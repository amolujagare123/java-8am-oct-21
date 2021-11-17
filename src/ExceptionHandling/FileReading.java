package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fp = new FileInputStream("d://amol1.txt");


        System.out.println("End of the program");
    }
}
