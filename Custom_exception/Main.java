package Custom_exception;

class CustomException extends Exception
{
    public CustomException(String string)
    {   
        super(string);
    }
}

public class Main {

    public static void main(String[] args){

        int i = 20;
        int j = 0;

        try {
            j = 18/i;

            if (j==0) {
                throw new CustomException("I do not want print zero");
            }

        } catch(CustomException e){
            j=18/1;
            System.out.println("thats the default output: " + e);

        } catch (Exception e) {

            System.out.println("Something went wrong...");
        }

        System.out.println(j);
    }
}
