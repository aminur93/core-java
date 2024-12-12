package record_class_in_java;

// class Alien 
// {
//     private final int age;
//     private final String name;

//     public Alien(int age, String name)
//     {
//         this.age = age;
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [age=" + age + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

    

// }

record Alien (int age, String name) implements Cloneable 
{

    // public Alien()
    // {
    //     this(0, "");
    // }

    // public Alien(int age, String name)
    // {
    //     if (age == 0) {
    //         throw new IllegalArgumentException("id is not zero");
    //     }
    //     this.age = age;
    //     this.name = name;
    // }

    public Alien
    {
        if (age == 0) {
            throw new IllegalArgumentException("Age is not zero");
        }
    }

    public void show()
    {
        System.out.println("This is record class");
    }
}

public class Main {

    public static void main(String[] args)
    {
        Alien a1 = new Alien(22, "Aminur");
        //Alien a2 = new Alien(21, "Aminur");
        //Alien a3 = new Alien();

        System.out.println(a1);
        System.out.println(a1.name() + " : " + a1.age());
        //System.out.println(a2);
        a1.show();
        //System.out.println(a3);
    }
}
