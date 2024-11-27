package logical_operator;

public class Main {

    public static void main(String[] args){

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result1 = x > y && a > b;
        System.out.println(result1);

        boolean result2 = x > y && a < b;
        System.out.println(result2);

        boolean result3 = x > y || a > b;
        System.out.println(result3);

        boolean result4 = x < y || a < b;
        System.out.println(result4);

        boolean result5 = a > b;
        System.out.println(!result5);
    }
}
