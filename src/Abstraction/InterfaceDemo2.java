package Abstraction;

public interface InterfaceDemo2 {

    abstract void start();
    abstract void run();

    void display();

}

interface AnotherInteface
{
    void display();
}

class ChildInterface1 implements InterfaceDemo2 , AnotherInteface
{
    public void start()
    {
        System.out.println("start");
    }
    public void run()
    {
        System.out.println("run");
    }

    public void display()
    {
        System.out.println("display");
    }


    public static void main(String[] args) {


    }
}