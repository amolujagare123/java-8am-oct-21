package ClassConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }
    MyClass3()
    {
        a = 10;
        d =10.21;
        c='f';
        str="abcd";
    }

    public static void main(String[] args) {


        MyClass3 ob = new MyClass3();

        ob.display();

    }
}
