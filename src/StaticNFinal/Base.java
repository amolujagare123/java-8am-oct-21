package StaticNFinal;

public /*final*/ class Base {

    /*final*/ void myMethod()
    {
        System.out.println("this is base method");
    }
}

class child extends Base
{
    void myMethod()
    {
        System.out.println("this is child method");
    }

    public static void main(String[] args) {

        StaticMethod.staticMethod();
    }
}
