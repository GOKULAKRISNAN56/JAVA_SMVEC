class Student
{
    String name;
    int age;
    public void display()
    {   
        System.out.println("Name: "+name+"\n Age : "+age);

    }
}
class Gokul{
    String subj;
    int mark;
    public void display1()
    {
        System.out.println("Subject : "+subj+"\n mark :"+mark);
    }
}





public class Obj {
    public static void main(String[] args) {
        Student s1=new Student();
        Gokul g1=new Gokul();
        g1.subj="java programming";
        g1.mark=95;
        s1.name="Gokul";
        s1.age=21;
        g1.display1();
        
    }
}
