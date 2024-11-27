package type_casting;

public class Main {

    public static void main(String[] args){

        byte b = 125;
        int a = b;

        int c = 257;
        byte k = (byte)c;

        float f = 5.6f;
        int t = (int)f;

        //type promotion 

        byte x = 10;
        byte y = 20;

        int result = x * y;

        System.out.println(result);

        System.out.println(t);
    }
}
