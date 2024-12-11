package race_condition;

class Counter 
{
    private int count;

    public synchronized void increment()
    {
        count++;
    }

    public int getCount()
    {
        return count;
    }
}

public class Main {

    public static void main(String[] args)
    {
        Counter counter = new Counter();

        Runnable obj1 = () -> 
        {

            for(int i=0; i < 1000; i++)
            {
                counter.increment();
            }
        };

        Runnable obj2 = () -> 
        {

            for(int i=0; i < 1000; i++)
            {
                counter.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
