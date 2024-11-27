package arithmetic_operator;

public class Main {

    public static void main(String[] args){

        //addition
        int a = 10;
        int b = 20;
        int add_result = a + b;

        //subtraction
        int c = 20;
        int d = 10;
        int subs_result = c - d;

        //multiplication
        int e = 5;
        int f = 5;
        int multiplication_result = e * f;

        //dividation
        int g = 10;
        int h = 2;
        int divide_result = g / h;

        int num1 = 7;

        //num1 = num1 + 2;
        //num1 += 2;

        //num1 -= 3;

        //num1 *= 5;

        //num1 /=6;

        //num1++; // post increment
        //num1--; // post decrement

        //++num1; // pre increment

        int result = num1++; // fetch the value then increment
        // int result = ++num1; // increment then fetch the value

        System.out.println("Addition result is: "+ add_result);
        System.out.println("Substract result is: "+ subs_result);
        System.out.println("Multiplication result is: "+ multiplication_result);
        System.out.println("Dividation result is: "+ divide_result);

        System.out.println(result);
    }
}
