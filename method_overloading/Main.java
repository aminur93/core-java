package method_overloading;

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2)
    {
        return n1 + n2;
    }
}

public class Main {

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println("first only two parameter additation: " + calculator.add(3, 04));

        System.out.println("second only three parameter addition: " + calculator.add(10, 20, 30));

        System.out.println("third only two parameter fraction addition: " + calculator.add(25.5, 25.5));
    }
}
