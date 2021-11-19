package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {


        Integer ii = new Integer(5);

        int i = ii.intValue(); // unboxing / unwrapping

        System.out.println("ii="+ii);
        System.out.println("i="+i);

        int i1 = ii;  // auto unboxing / auto unwrapping
        System.out.println("i1="+i1);

    }
}
