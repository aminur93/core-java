package functional_interface_java;

@FunctionalInterface
interface A 
{
    public void show();
}

// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("In Show");
//     }
// }

public class Main {

    public static void main(String[] args)
    {
        A obj = new A() {
            
            public void show()
            {
                System.out.println("Show");
            }
        };
        obj.show();
    }
}
