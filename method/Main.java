package method;

class Computer {

    public void playMusic()
    {
        System.out.println("Music Playing");
    }

    public String getMePen(int price)
    {
        if (price >= 10) {
            
            return "Pen";
        }else{
            return "Noting";
        }

        
    }
}

public class Main {

    public static void main(String[] args){

        Computer computer = new Computer();

        computer.playMusic();

        String str = computer.getMePen(10);

        System.out.println(str);
    }

}
