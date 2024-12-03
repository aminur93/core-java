package access_modifier;

import access_modifier.Other.A;

class D extends C
{
    public void display()
    {
        System.out.println(marks);
    }

}

public class Main {

    public static void main(String[] args)
    {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();

        B obj1 = new B();
        System.out.println(obj1.getMarks());

        // C obj2 = new C();
        // System.out.println(obj2.marks);

        D obj3 = new D();
        obj3.display();
    }
}
