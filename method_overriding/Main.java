package method_overriding;

class A // super class 
{
    public void show()
    {
        System.out.println("In A Show");
    }

    public void config()
    {
        System.out.println("In A Config");
    }
}

class B extends A // sunclass B override class A show() and config() method.
{
    public void show()
    {
        System.out.println("In B Show");
    }
    
    public void config()
    {
        System.out.println("In B Config");
    }
}

class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class AdvClac extends Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2 + 1;
    }
}

public class Main {

    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();

        AdvClac obj1 = new AdvClac();
        int r1 = obj1.add(3, 4);
        System.out.println(r1);
    }
}
