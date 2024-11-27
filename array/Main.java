package array;

public class Main {

    public static void main(String[] args){

        int num[] = {3,4,6,8};

        //accessing like this way
        System.out.println(num[0]);

        //accessing using loop way
        for(int i=0; i<num.length; i++)
        {
            System.out.println("Firt number Element: " + num[i]);
        }

        int num1[] = new int[4];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        num1[3] = 40;

        for(int j=0; j<num1.length; j++)
        {
            System.out.println("Second number element: " + num1[j]);
        }
    }
}
