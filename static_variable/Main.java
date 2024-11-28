package static_variable;

class Mobile
{
    String brand;
    int price;
    static String name;

    public void display()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Main {

    public static void main(String[] args){

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Mobile.name = "Smart Phone";

        Mobile.name = "phone";

        obj1.display();
        obj2.display();
    }
}
