package anonymous;

class A 
{
    public A()
    {
        System.out.println("Object created");
    }

    public void show()
    {
        System.out.println("In A show");
    }
}

public class Main {

    public static void main(String[] args){

        new A().show(); // anonymous object
    }
}
