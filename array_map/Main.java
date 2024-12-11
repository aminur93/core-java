package array_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        Map<String, Integer> students = new Hashtable<>();

        students.put("Aminur", 55);
        students.put("Khan", 33);
        students.put("Jahid", 43);
        students.put("Muzahid", 80);
        students.put("Khan", 77);

        System.out.println(students);
        System.out.println(students.get("Khan"));
        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
