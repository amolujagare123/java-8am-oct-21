package ClassConstructors;

public class MyClass4 {

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

    MyClass4(int a,double d,char c,String str)
    {
        a = a;
        d = d;
        c = c;
        str=str;
    }

    public static void main(String[] args) {


        MyClass4 ob = new MyClass4(12,4.5,'g',"pqr");

        ob.display();

    }
}
