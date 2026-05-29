public class Add {
    //Static method
    // public static int addTwoNumbers(int a,int b)
    // {
    //     return a+b;
    // }
    // public static void main(String[] args) {
    //     System.out.println(addTwoNumbers(11,12));
    // }

    //Non static method

    // public  int addTwoNumbers(int a,int b)
    // {
    //      return a+b;
    //  }
    //  public static void main(String[] args) {
    //     Add a=new Add();
    //      System.out.println(a.addTwoNumbers(11,12));
    //  }

    //Inside and Outside Method 

    // public  int addTwoNumbers(int a,int b)
    // {
    //      return a+b;
    // }
    // static void change(int x)
    // {
    //     x=5000;
    //     System.out.println("Inside Method: "+x);
    // }
    //  public static void main(String[] args) {
    //     int y=5;
    //     change(y);
    //     System.out.println("Outside Method: "+y);
    //     Add a=new Add();
    //      System.out.println(a.addTwoNumbers(11,12));
    // }

    // method overloading
      public  int addTwoNumbers(int a,int b)
    {
         return a+b;
    }
    //method overloading
    public int addTwoNumbers(int a,int b,int c)
    {
        return a+b+c;
    }
    static void change(int x)
    {
        x=5000;
        System.out.println("Inside Method: "+x);
    }
     public static void main(String[] args) {
        int y=5;
        change(y);
        System.out.println("Outside Method: "+y);
        Add a=new Add();
         System.out.println(a.addTwoNumbers(11,12,33));
    }
    


}
