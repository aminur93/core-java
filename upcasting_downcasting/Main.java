package upcasting_downcasting;

class A 
{
    public void show1()
    {
        System.out.println("In A Show");
    }
}

class B extends A 
{
    public void show2()
    {
        System.out.println("In B Show");
    }
}

public class Main {

    public static void main(String[] args)
    {
        A obj1 = (A) new B(); // upcasting
        obj1.show1();

        B obj2 = (B) obj1;
        obj2.show2();
    }
}
