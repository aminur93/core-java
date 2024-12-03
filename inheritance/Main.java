package inheritance;

public class Main {

    public static void main(String[] args){

        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();

        int result1 = obj.add(10, 20);
        int result2 = obj.sub(100, 20);
        int result3 = obj.multiplication(10, 20);
        int result4 = obj.division(20, 10);
        double result5 = obj.power(4, 3);

        System.out.println("Addition result is : " + result1);
        System.out.println("Subtract result is : " + result2);
        System.out.println("Multiplication result is : " + result3);
        System.out.println("Division result is : " + result4);
        System.out.println("Power result is : " + result5);
    }
}
