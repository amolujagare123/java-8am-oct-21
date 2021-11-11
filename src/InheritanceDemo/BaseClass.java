package InheritanceDemo;

public class BaseClass {

    void demoMethod()
    {
        System.out.println("Demo method base class");
    }
}

class DerivedClass extends BaseClass
{
    void demoMethod() // overriden method
    {
        System.out.println("Demo method Derived class");
    }

    public static void main(String[] args) {
        DerivedClass ob = new DerivedClass();
        ob.demoMethod();
    }
}