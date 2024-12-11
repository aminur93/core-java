package array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list.get(1));

        list.remove("Banana");

        System.out.println(list);
    }
}
