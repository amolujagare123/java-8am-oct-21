package ClassConstructors;

public class MyClass {
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

    public static void main(String[] args) {
/*
        int x;
        x =10 ;
        System.out.println(x);*/

        MyClass ob = new MyClass();
        ob.a = 19 ;
        ob.d = 1.1;
        ob.c = 'c';
        ob.str ="amol";
        ob.display();


        MyClass ob1 = new MyClass();
        ob1.a = 29 ;
        ob1.d = 2.1;
        ob1.c = 'e';
        ob1.str ="rahul";
        ob1.display();


    }
}
