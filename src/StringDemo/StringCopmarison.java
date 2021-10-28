package StringDemo;

public class StringCopmarison {

    public static void main(String[] args) {
        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = new String("amol");

       //str1==str2 --> address

        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// false
        System.out.println(str1.equalsIgnoreCase(str3));// true
        System.out.println(str1.equals(str4));// false
        System.out.println(str1.equals(str5));//


        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str5); // false


        str1=str4;

        System.out.println(str1);


    }
}
