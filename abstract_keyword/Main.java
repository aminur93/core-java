package abstract_keyword;

abstract class Car
{

    public int oil = 1000;
    public String brand = "wagonR";

    public abstract void drive();

    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Play music");
    }
}

abstract class Wagon extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdateWagon extends Wagon
{
    public void fly()
    {
        System.out.println("Flying.....");
    }
}

public class Main {

    public static void main(String[] args)
    {
        Car obj = new UpdateWagon();
        obj.drive();
        obj.fly();
        obj.playMusic();

        System.out.println(obj.oil + " " + obj.brand);
    }

}
