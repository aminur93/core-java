package anonymoys_inner_class;

class A 
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

public class Main {

    public static void main(String[] args)
    {
        A obj = new A(){

            public void show()
            {
                System.out.println("In B Show");
            }
        };

        obj.show();
    }
}
