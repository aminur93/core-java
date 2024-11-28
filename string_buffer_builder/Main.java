package string_buffer_builder;

public class Main {

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Aminur");

        sb.deleteCharAt(2);

        sb.insert(0, "Java ");

        sb.append(" Rashid");

        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder sb1 = new StringBuilder("Khan");

        sb1.append(" Ahmed");

        sb1.insert(0, "Java ");

        sb1.delete(0, 5);

        System.out.println(sb1);

        System.out.println(sb1.capacity());

        System.out.println(sb1.length());
    }
}
