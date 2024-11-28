package encapculation;

class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class Main {

    public static void main(String[] args){

        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Aminur");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
