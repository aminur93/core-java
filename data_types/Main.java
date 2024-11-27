package data_types;

public class Main {

    public static void main(String[] args){

        byte by = 127;
        long l = 5582l;
        short sh = 558;
        int age = 25; // primitive data type
        float num = 25.5f;
        double salary = 50000.00; // primitive data type
        char grade = 'A'; // primitive data type
        boolean isActive = true; // primitive data type

        String name = "Aminur Rashid"; // non-primitve data type
        int[] marks = {21,35,56,78}; // non-primitive data types
        
        if (isActive == true) {
            System.out.println("byte is: " + by);
            System.out.println("long is: " + l);
            System.out.println("Short is: " + sh);
            System.out.println("Age is : " + age);
            System.out.println("float is : " + num);
            System.out.println("Salary is : " + salary);
            System.out.println("Grade is : " + grade);
        }

        System.out.println("Your name is : " + name);
        
    }
}
