package sealed_class;

sealed class A extends Thread implements Cloneable permits B,C
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

sealed class B  extends A permits D
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

non-sealed class C extends A
{
    public void show()
    {
        System.out.println("In C Show");
    }
}

final class D extends B
{
    public void show()
    {
        System.out.println("In D Show");
    }
}

class E extends C
{
    public void show()
    {
        System.out.println("In E Show");
    }
}


sealed interface X permits Y 
{
    public void config();
} 

non-sealed interface Y extends X
{

    public void display();
    
}

interface Z extends Y
{

    @Override
    void display();
    
}

public class Main {

    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.show();

        C obj2 = new C();
        obj2.show();

        D obj3 = new D();
        obj3.show();

        E obj4 = new E();
        obj4.show();
    }
}
