package abstract_anonymous_inner_class;

abstract class A 
{
    public abstract void show();

    public abstract void config();
}

public class Main {

    public static void main(String[] args)
    {
        A obj = new A() {

            @Override
            public void show() {
                System.out.println("In New Show");
            }

            @Override
            public void config() {
                System.out.println("In new config");
            }
            

        };
        
        obj.show();
        obj.config();
    }
}
