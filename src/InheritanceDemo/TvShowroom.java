package InheritanceDemo;

public class TvShowroom {

    public void volumeControl()
    {
        System.out.println("TvShowroom volumeControl");
    }
    void channels()
    {
        System.out.println("TvShowroom channels");
    }

    void settings()
    {
        System.out.println("TvShowroom settings");
    }

}

class Samsang extends  TvShowroom{

    public void volumeControl()
    {
        System.out.println("Samsang volumeControl");
    }
    void channels()
    {
        System.out.println("Samsang channels");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }

}

class LG extends  TvShowroom{

    public void volumeControl()
    {
        System.out.println("LG volumeControl");
    }
    void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }

}

class Onida extends  TvShowroom{

    public void volumeControl()
    {
        System.out.println("Onida volumeControl");
    }
    void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida   settings");
    }

}

class TestOverriding
{
    public static void main(String[] args) {

       /* TvShowroom tv = new TvShowroom(); // TvShowroom tv;
        tv.channels();
        tv.volumeControl();
        tv.settings();*/

        TvShowroom tv = new Onida(); // upcasting
        // reference variable / object reference
        tv.settings();
        tv.channels();
        tv.volumeControl();

        // we have to use reference variables of parent class to call overridden methods

        tv = new LG();

        tv.settings();
        tv.channels();
        tv.volumeControl();

        tv = new Samsang();

        tv.settings();
        tv.channels();
        tv.volumeControl();


    }
}