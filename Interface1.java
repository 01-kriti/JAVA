interface MyInterface{
    //void method1();
    //using default, static keyword we can implement abstract methods
    // default int method2()
    // {
    //     System.out.println("Implement Method.");
    //     return 1;
    // }
    default void show()
    {
        System.out.println("Default mathod in Interface.");
    }
    static void display()
    {
        System.out.println("Static method in Interface.");
    }
}
class MyClass implements MyInterface{}

public class Interface1{
    public static void main(String args[])
    {
        MyClass obj=new MyClass();
        obj.show();
        MyInterface.display();
    }
}