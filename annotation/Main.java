package annotation;

class A 
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A 
{
    @Override
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class Main {

    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }

}
