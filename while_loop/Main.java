package while_loop;

public class Main {

    public static void main(String[] args){

        int i = 1;

        while (i <= 4) {
            System.out.println(i + " Hi");

            int j = 1;
            while (j <= 3) {
                System.out.println(j + " Hello");
                j++;
            }

            i++;
        }

        System.out.println("bye " + i);
    }
}
