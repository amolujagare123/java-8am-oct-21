package StaticNFinal;

public class StaticMethod {
    int rno;
    String name;
    public static String college;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }
     void nonstaticMethod1() // non static method
    {
        System.out.println("staticMethod1");
        System.out.println("rno="+rno); // non static -  allowed
        System.out.println("name="+name); // non static -  allowed
        System.out.println("college="+college); // static - allowed
        display();// non static -  allowed
        myMethod();// non static -  allowed

    }
    public static void myMethod()
    {
        System.out.println("myMethod");
    }


    public static void staticMethod() // static method
    {
        System.out.println("inside staic method");
      //  System.out.println("rno="+rno); // non static - not allowed
     //   System.out.println("name="+name); // non static - not allowed
        System.out.println("college="+college); // static - allowed
      //  display();// non static - not allowed
        myMethod();// non static - not allowed
     //   staticMethod1();// static - allowed
    }


    public static void main(String[] args) {

        StaticMethod ob = new StaticMethod();

        ob.staticMethod();
        ob.myMethod();

        StaticMethod.staticMethod();
        StaticMethod.myMethod();
    }
}
