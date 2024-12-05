package exception_handling_try_catch_java;

public class Main {

    public static void main(String[] args)
    {
        int i = 0;
        int j = 0;

        try{

            j = 18/i;

        }catch(Exception exception){
            System.out.println("Something went wrong....");
        }

        System.out.println(j);
    }
}
