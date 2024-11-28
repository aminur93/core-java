package array_of_object;

class Student{

    int rollNo;
    String name;
    int marks;
}

public class Main {

    public static void main(String[] args){

        Student s1 = new Student(); 
        s1.rollNo = 101;
        s1.name = "Aminur";
        s1.marks = 88;

        Student s2 = new Student(); 
        s2.rollNo = 102;
        s2.name = "Rashid";
        s2.marks = 80;

        Student s3 = new Student(); 
        s3.rollNo = 103;
        s3.name = "Morshed";
        s3.marks = 78;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0; i<student.length; i++)
        {
            System.out.println(student[i].name + " : " + student[i].marks);
        }
    }
}
