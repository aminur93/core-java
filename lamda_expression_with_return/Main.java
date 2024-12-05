package lamda_expression_with_return;

@FunctionalInterface
interface A 
{
    public int subtract(int n1, int n2);
}

public class Main {

    public static void main(String[] args)
    {
        A obj = (n1, n2) -> n1 - n2;
        int result = obj.subtract(20, 10);

        System.out.println("Subtract result is: " + result);
    }
}
