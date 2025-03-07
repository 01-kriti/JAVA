// class Vehicle {
//     void move() {
//         System.out.println("The vehicle is moving.");
//     }
// }

// class Car extends Vehicle {
//     void speed() {
//         System.out.println("The car is moving at 80 km/h.");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.move(); 
//         myCar.speed(); 
//     }
// }


// import java.util.Scanner;

// // Parent class
// class User {
//     String username;
//     String password;

//     // Constructor
//     User(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }

//     // Method to validate login
//     boolean login(String inputUsername, String inputPassword) {
//         return this.username.equals(inputUsername) && this.password.equals(inputPassword);
//     }
// }

// // Child class
// class Admin extends User {
//     // Constructor
//     Admin(String username, String password) {
//         super(username, password);
//     }

//     void manageUsers() {
//         System.out.println("Admin can manage users.");
//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter username: ");
//         String inputUsername = scanner.nextLine();
        
//         System.out.print("Enter password: ");
//         String inputPassword = scanner.nextLine();
        
//         Admin admin = new Admin("kriti", "kriti@123");
        
//         // Validating login
//         if (admin.login(inputUsername, inputPassword)) {
//             System.out.println("Login successful!");
//             admin.manageUsers();
//         } else {
//             System.out.println("Invalid credentials!");
//         }
        
//         scanner.close();
//     }
// }



// class animal{
//     void eat()
//     {
//         System.out.println("All animals eat.");
//     }
// }
// class mammal extends animal{
//     void walk()
//     {
//         System.out.println("all mammals walk.");
//     }
// }
// class dog extends mammal{
//     void bark()
//     {
//         System.out.println("The dog barks.");
//     }
// }
// public class practice{
//     public static void main(String args[])
//     {
//         dog d=new dog();
//         d.eat();
//         d.walk();
//         d.bark();
//     }
// }





class Person {
    protected String name;
    protected int age;
    protected String email;

    public Person(String name, int age, String email) 
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

class Student extends Person 
{
    private static int studentCount = 0;
    private String studentID;
    private String course;

    public Student(String name, int age, String email, String studentID) 
    {
        super(name, age, email);
        this.studentID = studentID;
        this.course = "Undeclared";
        studentCount++;
    }

    public Student(String name, int age, String email, String studentID, String course) 
    {
        super(name, age, email);
        this.studentID = studentID;
        this.course = course;
        studentCount++;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }

    public static int getStudentCount() 
    {
        return studentCount;
    }
}

class Faculty extends Person 
{
    private static int facultyCount = 0;
    private String facultyID;
    private String department;

    public Faculty(String name, int age, String email, String facultyID, String department) 
    {
        super(name, age, email);
        this.facultyID = facultyID;
        this.department = department;
        facultyCount++;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Department: " + department);
    }

    public static int getFacultyCount() 
    {
        return facultyCount;
    }
}

public class practice{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Alice Johnson", 20, "alice@example.com", "S101", "Computer Science");
        Student s2 = new Student("Bob Smith", 22, "bob@example.com", "S102", "Mechanical Engineering");
        Student s3 = new Student("Charlie Brown", 19, "charlie@example.com", "S103");

        Faculty f1 = new Faculty("Dr. Emily White", 45, "emily@example.com", "F201", "Computer Science");
        Faculty f2 = new Faculty("Dr. David Black", 50, "david@example.com", "F202", "Mathematics");

        System.out.println("=== Student Details ===");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
        System.out.println();

        System.out.println("=== Faculty Details ===");
        f1.displayInfo();
        System.out.println();
        f2.displayInfo();
        System.out.println();

        // Display total count
        System.out.println("Total Students: " + Student.getStudentCount());
        System.out.println("Total Faculty: " + Faculty.getFacultyCount());
    }
}