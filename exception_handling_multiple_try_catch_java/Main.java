package exception_handling_multiple_try_catch_java;

public class Main {

    public static void main(String[] args)
    {
        int i = 2;
        int j = 0;

        int num[] = new int[5];

        String str = null;

        try {
            
            j = 18/i;

            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Stay your limit");
        }catch(Exception e){

            System.out.println("Something went wrong.");
        }

        System.out.println(j);
    }
}
