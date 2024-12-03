package final_keyword;

import inheritance.Calculator;

final class Calc
{
    public void show()
    {
        System.out.println("Calc show");
    }

    public void add(int n1, int n2)
    {
        System.out.println("Result is : " + (n1 + n2));
    }
}

class AddCalc extends Calc 
{
    // its not extendable because Calc class declare as final
}

class A 
{
    public final void display()
    {
        System.out.println("In A Display");
    }
}

class B extends A
{
    public void display(){} // its give me error because display as declare final method
}
public class Main {

    public static void main(String[] args)
    {
        Calc obj = new Calc();
        obj.show();
        obj.add(10, 20);
    }
}
