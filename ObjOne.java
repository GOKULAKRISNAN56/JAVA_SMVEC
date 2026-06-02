// constructor
class Student  {
    String name;
    int age;
    //Default constructor
    Student()
    {
        name ="Default";
        age=21;
    }
    // parameterized constructor
    Student(String name,int age)
    {
       this.name=name;
       this.age=age;
    }//constructor overloading
    Student(String name)
    {
        this.name=name;;
        this.age=22;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
}


public class ObjOne {
    public static void main(String[] args) {
        Student s1=new Student("Gokul",21);
        s1.display();

    }
}
