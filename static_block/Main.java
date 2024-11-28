package static_block;

class Mobile
{
    static String name;
    String brand;
    int price;

    static
    {
        name = "Phone";
        System.out.println("Static Block");
    }

    public Mobile()
    {
        brand = "";
        price = 2000;
        System.out.println("In Constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Main {

    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("static_block.Mobile");
        // Mobile obj = new Mobile();
        // obj.brand = "Apple";

        // obj.show();
    }
}
