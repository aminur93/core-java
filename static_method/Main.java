package static_method;

class Student
{
    static String school_name;
    String name;
    int marks;

    public static void display(Student student)
    {
        System.out.println(school_name + " : " + student.name + " : " + student.marks);
    }
}

public class Main {

    public static void main(String[] args){

        Student student = new Student();

        Student.school_name = "TGH";
        student.name = "Aminur Rashid";
        student.marks = 88;

        Student.display(student);
    }
}
