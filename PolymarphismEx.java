// overloading Example
class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    // Method overloading
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class PolymarphismEx {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20,20));
    }
}
