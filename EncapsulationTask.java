class Student {
    private String name="";
    private int age=0;
    private int salary=0;
    public void setData(String name,int age,int salary)
    {
        this.name+=name;
        this.age+=age;
        this.salary+=salary;
    }
    public String getData1()
    {
        return name;
    }
    public int getData2()
    {
        return age;
    }
    public int getData3()
    {
        return salary;
    }

    
}
public class EncapsulationTask {
    public static void main(String[] args) {
    Student s1=new Student();
    s1.setData("Gokul",21,500000);
    System.out.println(s1.getData1());
    System.out.println(s1.getData2());
    System.out.println(s1.getData3());
    }
    
    
}
