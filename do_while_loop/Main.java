package do_while_loop;

public class Main {

    public static void main(String[] args){

        int i = 1;

        do{
            System.out.println("Hi " + i);

            int j = 1;
            do{
                System.out.println("Hello " + j);
                j++;
            }while(j <= 3);

            i++;
        }while(i <= 4);
    }
}
