package enum_in_java;

enum Status{
    Running, Failed, Pending, Success;
}

public class Main {

    public static void main(String[] args)
    {
        Status s = Status.Success;

        System.out.println(s.ordinal());

        Status[] ss = Status.values();

        System.out.println("===================");
        for(Status a : ss)
        {
            System.out.println(a + " : " + a.ordinal());
        }
        System.out.println("===================");
    }
}
