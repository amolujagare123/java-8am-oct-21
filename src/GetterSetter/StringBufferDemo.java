package GetterSetter;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("amol");

        System.out.println(sb1.capacity());

        System.out.println(sb1.append("selenium"));

        System.out.println(sb1.insert(4,"aaa"));

        System.out.println(sb1.replace(4,7,"bbb"));
        System.out.println(sb1.delete(4,7));
        System.out.println(sb1.reverse());

        System.out.println(sb1.length());
        System.out.println(sb1.substring(2));
        System.out.println(sb1.substring(2,7));

        System.out.println(sb1.capacity());

        sb1.ensureCapacity(10);


    }
}
