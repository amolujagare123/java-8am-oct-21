package InheritanceDemo;

public class Bird {

    Bird()
    {
        System.out.println("Bird constructor");
    }

    String color = "black";

    void work()
    {
        System.out.println("Bird is working");
    }
}

class Sparrow extends  Bird
{

    Sparrow()
    {
        //super();
        System.out.println("sparrow constructor");
    }

    String color="yellow";

    void work()
    {
        System.out.println("Sparrow is working");
    }

    void sparrowMethod()
    {
        System.out.println(color);
        System.out.println(super.color);
        work();
        super.work();
    }


    public static void main(String[] args) {
        Sparrow s = new Sparrow();
      //  s.sparrowMethod();

    }


}
