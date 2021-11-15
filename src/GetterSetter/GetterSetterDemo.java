package GetterSetter;

public class GetterSetterDemo {

    private int a;
    private double d;
    private char c;
    private String str;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
/*public void setA(int a)
    {
        this.a = a;
    }

    public int getA()
    {
        return a;
    }*/

    public static void main(String[] args) {

        GetterSetterDemo ob = new GetterSetterDemo();

        ob.setA(12);
        ob.setC('n');
        ob.setD(12.4);
        ob.setStr("amol");
        ob.setStr("vinayak");

        System.out.println(ob.getA());
        System.out.println(ob.getC());
        System.out.println(ob.getD());
        System.out.println(ob.getStr());


    }

}
