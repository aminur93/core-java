package lambda_expression;

@FunctionalInterface
interface Calculator
{
    public int addition(int n1, int n2);
}

public class Main {

    public static void main(String[] args)
    {
        Calculator obj = (a, b) -> a + b;
        int result = obj.addition(10, 20);

        System.out.println("Addition Result is: " + result);
    }

}
