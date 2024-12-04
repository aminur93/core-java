package inner_class;

class A 
{
    int age;

    public void show()
    {
        System.out.println("In A Show");
    }

    class B
    {
        public void display()
        {
            System.out.println("In B Display");
        }
    }

    static class c 
    {
        public void config()
        {
            System.out.println("In C Config");
        }
    }
}

public class Main {

    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.display();

        A.c obj2 = new A.c();
        obj2.config();
    }
}
