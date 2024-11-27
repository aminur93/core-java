public class Main {

    //static varibale
    static int superNumber = 500;

    //local varibale
    public void LocalNumber()
    {
        int local_number = 100;
        System.out.println("Local Number is: " + local_number);
    }

    public static void main(String[] args){

        Main localNumber = new Main();

        //instance varibale
        int number = 5;

        //instance varibale
        double number1 = 10.00;

        //instance varibale
        double result = number + number1;

        //instance varibale
        String userName = "Aminur";

        System.out.println("Number is: "+ number);
        System.out.println("Number1 is: "+ number1);
        System.out.println("Name is: "+ userName);

        System.out.println("Result is: "+ result);

        localNumber.LocalNumber();

        System.out.println("This is calss static varibale: " + superNumber);
    }
}
