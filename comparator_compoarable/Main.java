package comparator_compoarable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Student that) {

        if (this.age > that.age) {
                    
            return 1;
        }else{
            return -1;
        }
    }
}

public class Main {

    public static void main(String[] args)
    {

        Comparator<Student> com = (i, j) ->  i.age > j.age ? 1 : -1;
            
        

        List<Student> student = new ArrayList<>();

        student.add(new Student(21, "Afridi"));
        student.add(new Student(12, "Inzamam"));
        student.add(new Student(18, "Nazim"));
        student.add(new Student(20, "Shoiab"));

        Collections.sort(student, com);

        for(Student s : student)
        {
            System.out.println(s);
        }
       
    }
}
