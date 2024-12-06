package exception_throw_keyword_java;

public class Main {

    public static void main(String[] args)
    {
        int i = 20;
        int j = 0;

        try {
            
            j = 18/i;

            if (j==0) {
                throw new ArithmeticException("I do not want to print zero");
            }

        } catch(ArithmeticException exception){
                j = 18/1;
                System.out.println("thats the default output " + exception);
        } catch (Exception e) {

            System.out.println("Something went wrong....");
        }

        System.out.println(j);
    }
}
