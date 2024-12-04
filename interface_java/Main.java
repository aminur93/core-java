package interface_java;

interface A 
{
    int age = 28; // in interface all varibale are final and static

    String area = "Dhaka"; // in interface all varibale are final and static

    void show();

    void config();
}

class B implements A
{

    @Override
    public void show() {
        System.out.println("In B Show");
    }

    @Override
    public void config() {
        System.out.println("In B Config");
    }
    
}

public class Main {

    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();

        //A.area = "Cumilla"; // its give me error because interface variable is final 

        System.out.println(A.age + " " + A.area);
    }
}
