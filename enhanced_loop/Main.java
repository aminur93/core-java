package enhanced_loop;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public void display()
    {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Main {

    public static void main(String[] args){

        Student students[] = new Student[3];

        students[0] = new Student("Aminur", 88);
        students[1] = new Student("Rashid", 78);
        students[2] = new Student("Juned", 65);

        for(Student student: students)
        {
            student.display();
        }
    }
}
