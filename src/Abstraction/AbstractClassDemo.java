package Abstraction;

public abstract  class AbstractClassDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }

}

class Child extends AbstractClassDemo
{
    void start()
    {
        System.out.println("start");
    }

    void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new Child();
        ob.run();
        ob.start();
        ob.display();
    }
}
