package default_parametrized_constructor;

class Human
{
    private String name;

    private int age;

    public Human() // default constructor
    {
        name = "Aminur";
        age = 21;
    }

    public Human(String name, int age) // parametrized constructor
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}

public class Main {

    public static void main(String[] args)
    {
        Human obj = new Human();

        System.out.println(obj.getName() + " age is " + obj.getAge());

        Human obj1 = new Human("Rashid", 37);

        System.out.println(obj1.getName() + " age is " + obj1.getAge());
    }
}
