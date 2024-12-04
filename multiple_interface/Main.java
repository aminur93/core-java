package multiple_interface;


// class -> class -> extend
// class -> interface -> implement
// interafce -> interafce -> implement

interface A 
{
    int age=25;
    String area = "Dhaka";

    void show();

    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    void walk();
}

class B implements A,Y
{

    @Override
    public void walk() {
        System.out.println("Walking....");
    }

    @Override
    public void run() {
        System.out.println("Running....");
    }

    @Override
    public void show() {
        System.out.println("In B Show");
    }

    @Override
    public void config() {
        System.out.println("In B Config");
    }
    
}

public class Main {

    public static void main(String[] args)
    {
        B obj = new B();

        obj.config();
        obj.run();
        obj.walk();
        obj.show();
    }
}
