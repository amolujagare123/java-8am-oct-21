package Abstraction;

public interface InterfaceDemo1 {

    default void display1()
    {
        System.out.println("inside dispay1");
    }

    static void display2()
    {
        System.out.println("inside dispay2");
    }

    private void display3()
    {
        System.out.println("inside dispay3");
    }

    void start(); //public abstract
    void run();

}

class ChildInterface implements InterfaceDemo1
{
    public void start()
    {
        System.out.println("start");
    }
    public void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        InterfaceDemo1 ob = new ChildInterface();

        ob.start();
        ob.run();
        ob.display1();
        InterfaceDemo1.display2();

       // ob.display2();
    }
}
