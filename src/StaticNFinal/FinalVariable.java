package StaticNFinal;

public class FinalVariable {

    final int speed = 100;

    void change()
    {
     //  speed = 150;
    }

    public static void main(String[] args) {

        FinalVariable ob = new FinalVariable();
        ob.change();
        System.out.println(ob.speed);
    }

}
