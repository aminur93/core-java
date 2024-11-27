package for_loop;

public class Main {

    public static void main(String[] args){

        for(int i =1; i <=4; i++)
        {
            System.out.println("Hi " + i);
        }

        for(int i =4; i >=1; i--)
        {
            System.out.println("Hi " + i);
        }

        for(int i =0; i <4; i++)
        {
            System.out.println("Hi " + i);
        }

        for(int i=1; i<=5; i++)
        {
            System.out.println("DAY " + i);

            for(int j=1; j<=9; j++)
            {
                System.out.println("   " + (j+8) + "  - " + (j+9));
            }
        }

        int k=1;

        for(;k<=5;)
        {
            System.out.println("Hi " + k);
            k++;
        }
    }
}
