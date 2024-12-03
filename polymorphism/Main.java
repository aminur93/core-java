package polymorphism;

// compile time overloading start
class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public double add(double n1, double n2)
    {
        return n1 + n2;
    }
}
// compile time overloading end

// Run time overriding start
class A 
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}
// Run time overriding end

public class Main {

    public static void main(String[] args)
    {
        Calc obj1 = new Calc();

        int resul1 = obj1.add(10, 20);

        double resul2 = obj1.add(20.50, 25.55);

        System.out.println("interger result : " + resul1);
        System.out.println("double result : " + resul2);

        B obj2 = new B();
        obj2.show();
    }
}
